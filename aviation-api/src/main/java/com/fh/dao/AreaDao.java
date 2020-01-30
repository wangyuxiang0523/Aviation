package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.po.AreaPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AreaDao extends BaseMapper<AreaPo> {

    List<AreaPo> queryCity();

    List<AreaPo> queryAirportById(Integer id);

    List<AreaPo> queryTerminal(Integer id);
}
