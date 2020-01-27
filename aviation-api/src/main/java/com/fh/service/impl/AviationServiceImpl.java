package com.fh.service.impl;

import com.fh.dao.AviationDao;
import com.fh.dao.FlightTicketDao;
import com.fh.model.po.FlightTicket;
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
             if(flightTickets.get(j).getType()==1 ){
                 list.get(i).setPrice(flightTickets.get(j).getPrice());
             }else {
                 list.get(i).setPrice(flightTickets.get(j).getPrice());
             }
            count+=flightTickets.get(i).getTotalCount();

         }
         list.get(i).setTotalCount(count);
         String startname = aviationDao.queryStartPAreaName(list.get(i).getStartAreaPid());
         String endname =aviationDao.queryEndPAreaName(list.get(i).getEndAreaPid());
         list.get(i).setEndPAreaName(endname);
         list.get(i).setStartPAreaName(startname);
       }
        return list;
    }
}
