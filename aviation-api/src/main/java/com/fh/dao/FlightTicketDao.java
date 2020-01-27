package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.po.FlightTicket;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FlightTicketDao extends BaseMapper<FlightTicket> {

}
