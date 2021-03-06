package com.fh.service;

import com.fh.model.FlightQuery;
import com.fh.model.po.AreaPo;
import com.fh.model.po.FlightPo;
import com.fh.model.po.FlightTicket;
import com.fh.model.po.PlaneTypeVo;
import com.fh.model.vo.FlightVo;

import java.util.List;

public interface AviationService {
    List<FlightVo> initTable(FlightQuery flightQuery);

    List<PlaneTypeVo> initPlaneType();

    List<AreaPo> initCity();

    List<AreaPo> initAirport(Integer id);

    List<AreaPo> initTerminal(Integer id);

    void addFlight(FlightPo flightPo);

    void addTouDeng(FlightTicket flightTicket);

    void deleteFlight(Integer id);

    void plDelete(Integer s);

    FlightVo queryFlightById(Integer id);

    void updateFlightById(FlightPo flightPo);

    void updateTicketByFlightId(FlightTicket flightTicket);
}
