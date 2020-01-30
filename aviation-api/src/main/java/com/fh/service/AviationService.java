package com.fh.service;

import com.fh.model.po.AreaPo;
import com.fh.model.po.FlightPo;
import com.fh.model.po.FlightTicket;
import com.fh.model.po.PlaneTypeVo;
import com.fh.model.vo.FlightVo;

import java.util.List;

public interface AviationService {
    List<FlightVo> initTable();

    List<PlaneTypeVo> initPlaneType();

    List<AreaPo> initCity();

    List<AreaPo> initAirport(Integer id);

    List<AreaPo> initTerminal(Integer id);

    void addFlight(FlightPo flightPo);

    void addTouDeng(FlightTicket flightTicket);
}
