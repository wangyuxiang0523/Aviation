package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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
    List<FlightVo> initTable();

    List<FlightTicket> selectTicketById(Integer flightId);

    String queryStartPAreaName(Integer startAreaPid);

    String queryEndPAreaName(Integer endAreaPid);
}
