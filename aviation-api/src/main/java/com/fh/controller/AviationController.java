package com.fh.controller;

import com.fh.model.FlightQuery;
import com.fh.model.po.*;
import com.fh.model.vo.FlightVo;
import com.fh.service.AviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("flight")
@CrossOrigin
public class AviationController {
    @Autowired
    private AviationService aviationService;
    @PostMapping("initTable")
    public List initTable(FlightQuery flightQuery){
         List<FlightVo> list =aviationService.initTable(flightQuery);
        return list;
    }
    @PostMapping("initForm")
    public List initForm(){
        List<PlaneTypeVo> list =aviationService.initPlaneType();
        return list;
    }
    @PostMapping("initCity")
    public List initCity(){
        List<AreaPo> list =aviationService.initCity();
        return list;
    }
    @PostMapping("initAirport")
    public List initAirport(Integer id){
        List<AreaPo> list =aviationService.initAirport(id);
        return list;
    }
    @PostMapping("initTerminal")
    public List initTerminal(Integer id){
        List<AreaPo> list =aviationService.initTerminal(id);
        return list;
    }
    @PostMapping("addForm")
    public Map addForm( FlightPo flightPo,AddFlightPo addFlightPo){
        Map map =new HashMap();
        aviationService.addFlight(flightPo);
        FlightTicket flightTicket=new FlightTicket();
        flightTicket.setFlightId(flightPo.getId());
        flightTicket.setTotalCount(addFlightPo.getTotalCount());
        flightTicket.setPrice(addFlightPo.getPrice());
        flightTicket.setType(addFlightPo.getToudeng());
        aviationService.addTouDeng(flightTicket);
        flightTicket.setType(addFlightPo.getJingji());
        flightTicket.setPrice(addFlightPo.getPricee());
        flightTicket.setTotalCount(addFlightPo.getTotalCountt());
        aviationService.addTouDeng(flightTicket);
        map.put("code",200);
        map.put("message","添加完成");
        return map;
    }
    @PostMapping("deleteFlight")
    public Map deleteFlight(Integer id){
        Map map=new HashMap();
        aviationService.deleteFlight(id);
        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }
    @PostMapping("plDelete")
    public Map deleteFlight(String ids){
        Map map=new HashMap();
        String[] split = ids.split(",");
        for (int i =0;i<split.length;i++){
            aviationService.plDelete(Integer.valueOf(split[i]));
        }

        map.put("code",200);
        map.put("message","删除成功");
        return map;
    }
    @PostMapping("toUpdate")
    public Map toUpdate(Integer id){
        Map<String,Object> map = new HashMap();
        FlightVo flightVo = aviationService.queryFlightById(id);
        List<PlaneTypeVo> list =aviationService.initPlaneType();
        map.put("flight",flightVo);
        map.put("type",list);
        return map;
    }
    @PostMapping("updateFlight")
    public Map updateFlight( FlightVo flightVo,FlightPo flightPo,AddFlightPo addFlightPo){
        Map map =new HashMap();
        flightPo.setId(flightVo.getFlightId());
        aviationService.updateFlightById(flightPo);
        FlightTicket flightTicket=new FlightTicket();
        flightTicket.setFlightId(flightPo.getId());
        flightTicket.setTotalCount(addFlightPo.getTotalCount());
        flightTicket.setPrice(addFlightPo.getPrice());
        flightTicket.setType(addFlightPo.getToudeng());
        aviationService.updateTicketByFlightId(flightTicket);
        flightTicket.setType(addFlightPo.getJingji());
        flightTicket.setPrice(addFlightPo.getPricee());
        flightTicket.setTotalCount(addFlightPo.getTotalCountt());
        aviationService.updateTicketByFlightId(flightTicket);
        map.put("code",200);
        map.put("message","修改完成");
        return map;
    }
 }
