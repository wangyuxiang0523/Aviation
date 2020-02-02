package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.FlightQuery;
import com.fh.model.po.FlightPo;
import com.fh.model.po.FlightTicket;
import com.fh.model.vo.FlightVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AviationDao extends BaseMapper<FlightPo> {
    List<FlightVo> initTable(@Param("flightQuery") FlightQuery flightQuery);

    List<FlightTicket> selectTicketById(@Param("flightId") Integer flightId,@Param("flightQuery") FlightQuery flightQuery);

    String queryStartPAreaName(Integer startAreaPid);

    String queryEndPAreaName(Integer endAreaPid);


    FlightVo queryFlightById(Integer id);

    List<FlightTicket> queryTicketById(Integer flightId);
}
