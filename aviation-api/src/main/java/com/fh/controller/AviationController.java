package com.fh.controller;

import com.fh.model.vo.FlightVo;
import com.fh.service.AviationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("flight")
@CrossOrigin
public class AviationController {
    @Autowired
    private AviationService aviationService;
    @PostMapping("initTable")
    public List initTable(){
         List<FlightVo> list =aviationService.initTable();
        return list;
    }
}
