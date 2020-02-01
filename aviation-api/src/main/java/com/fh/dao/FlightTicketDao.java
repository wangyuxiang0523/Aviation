package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.po.FlightTicket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FlightTicketDao extends BaseMapper<FlightTicket> {

    void updateIsSticket(@Param("flightId") Integer flightId, @Param("typeId") Integer type);
    void updateIsSticket1(@Param("flightId") Integer flightId, @Param("typeId") Integer type);
}
