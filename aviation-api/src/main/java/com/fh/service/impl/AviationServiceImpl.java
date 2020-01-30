package com.fh.service.impl;

import com.fh.dao.AreaDao;
import com.fh.dao.AviationDao;
import com.fh.dao.FlightTicketDao;
import com.fh.dao.PlaneTypeDao;
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
import java.util.List;

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
    public List<FlightVo> initTable() {
       List<FlightVo> list= aviationDao.initTable();
       for (int i=0;i<list.size();i++){
           Date date =new Date();
           long a =date.getTime();
           long startTime = list.get(i).getStartTime().getTime();
             long  b = a - startTime;
             long hour =b /(60 * 60 * 1000);
             if (hour <= 2){
                 list.get(i).setNear("临近起飞");
             }
         List<FlightTicket>  flightTickets=aviationDao.selectTicketById(list.get(i).getFlightId());
           Integer count = 0;
         for (int j=0;j<flightTickets.size();j++){
             if(flightTickets.get(j).getType()==1 && flightTickets.get(j).getTotalCount()!= 0){
                     list.get(i).setPrice(flightTickets.get(j).getPrice());
             }else {
                 if( flightTickets.get(j).getType()==2 && flightTickets.get(j).getTotalCount() !=0){
                     list.get(i).setPrice(flightTickets.get(j).getPrice());
                 }
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
        flightTicketDao.insert(flightTicket);
    }
}
