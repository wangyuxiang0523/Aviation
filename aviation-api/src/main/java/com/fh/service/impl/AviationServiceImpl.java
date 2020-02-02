package com.fh.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.fh.dao.AreaDao;
import com.fh.dao.AviationDao;
import com.fh.dao.FlightTicketDao;
import com.fh.dao.PlaneTypeDao;
import com.fh.model.FlightQuery;
import com.fh.model.po.AreaPo;
import com.fh.model.po.FlightPo;
import com.fh.model.po.FlightTicket;
import com.fh.model.po.PlaneTypeVo;
import com.fh.model.vo.FlightVo;
import com.fh.service.AviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AviationServiceImpl implements AviationService {
    @Autowired
    private AviationDao aviationDao;
    @Autowired
    private FlightTicketDao flightTicketDao;
    @Autowired
    private PlaneTypeDao planeTypeDao;
    @Autowired
    private AreaDao areaDao;


    @Override
    public List<FlightVo> initTable(FlightQuery flightQuery) {
       List<FlightVo> list= aviationDao.initTable(flightQuery);
       for (int i=0;i<list.size();i++){
           Date date =new Date();
           long a =date.getTime();
           long startTime = list.get(i).getStartTime().getTime();
             long  b = a - startTime;
             long hour =b /(60 * 60 * 1000);
             if (hour <= 2){
                 list.get(i).setNear("临近起飞");
             }
         List<FlightTicket>  flightTickets=aviationDao.selectTicketById(list.get(i).getFlightId(),flightQuery);
           Integer count = 0;
         for (int j=0;j<flightTickets.size();j++){
             if(flightTickets.get(j).getType()==1 && flightTickets.get(j).getTotalCount()!= 0){
                     list.get(i).setPrice(flightTickets.get(j).getPrice());
                     flightTicketDao.updateIsSticket(flightTickets.get(j).getFlightId(),flightTickets.get(j).getType());
             }else {
                     flightTicketDao.updateIsSticket1(flightTickets.get(j).getFlightId(),flightTickets.get(j).getType());
             }
                 if( flightTickets.get(j).getType()==2 && flightTickets.get(j).getTotalCount() !=0){
                     list.get(i).setPrice(flightTickets.get(j).getPrice());
                     flightTicketDao.updateIsSticket(flightTickets.get(j).getFlightId(),flightTickets.get(j).getType());
             }else {
                     flightTicketDao.updateIsSticket1(flightTickets.get(j).getFlightId(),flightTickets.get(j).getType());
                 }
            /*count+=flightTickets.get(i).getTotalCount();*/
             count= count + flightTickets.get(j).getTotalCount();
         }
         list.get(i).setTotalCount(count);
         String startname = aviationDao.queryStartPAreaName(list.get(i).getStartAreaPid());
         String endname =aviationDao.queryEndPAreaName(list.get(i).getEndAreaPid());
         list.get(i).setEndPAreaName(endname);
         list.get(i).setStartPAreaName(startname);
       }
        return list;
    }

    @Override
    public List<PlaneTypeVo> initPlaneType() {
        return planeTypeDao.selectList(null);
    }

    @Override
    public List<AreaPo> initCity() {
        return areaDao.queryCity();
    }

    @Override
    public List<AreaPo> initAirport(Integer id) {
        return areaDao.queryAirportById(id);
    }

    @Override
    public List<AreaPo> initTerminal(Integer id) {
        return areaDao.queryTerminal(id);
    }

    @Override
    public void addFlight(FlightPo flightPo) {
        aviationDao.insert(flightPo);
    }

    @Override
    public void addTouDeng(FlightTicket flightTicket) {
        flightTicket.setIsTicket(1);
        flightTicketDao.insert(flightTicket);
    }

    @Override
    public void deleteFlight(Integer id) {
        aviationDao.deleteById(id);
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("fight_id",id);
        flightTicketDao.deleteByMap(columnMap);
    }

    @Override
    public void plDelete(Integer s) {
        aviationDao.deleteById(s);
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("fight_id",s);
        flightTicketDao.deleteByMap(columnMap);
    }

    @Override
    public FlightVo queryFlightById(Integer id) {
        FlightVo flightVo = aviationDao.queryFlightById(id);
        Integer startCityId= areaDao.selectCityId(flightVo.getStartAreaPid());
        Integer endCityId= areaDao.selectCityId(flightVo.getEndAreaPid());
        flightVo.setStartCityId(startCityId);
        flightVo.setEndCityId(endCityId);
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("fight_id",id);
        List<FlightTicket> flightTickets= flightTicketDao.selectByMap(columnMap);
        for (int i=0;i<flightTickets.size();i++){
            if (flightTickets.get(i).getType()==1){
                 flightVo.setPrice1(flightTickets.get(i).getPrice());
                 flightVo.setTotalCount1(flightTickets.get(i).getTotalCount());
            }
            if(flightTickets.get(i).getType()==2){
                flightVo.setPrice2(flightTickets.get(i).getPrice());
                flightVo.setTotalCount2(flightTickets.get(i).getTotalCount());
            }
        }
        return flightVo;
    }

    @Override
    public void updateFlightById(FlightPo flightPo) {
        aviationDao.updateById(flightPo);
    }

    @Override
    public void updateTicketByFlightId(FlightTicket flightTicket) {

        flightTicketDao.update(
                flightTicket,
                new UpdateWrapper<FlightTicket>()
                        .eq("fight_id",flightTicket.getFlightId())
                        .eq("type",flightTicket.getType()));

    }
}
