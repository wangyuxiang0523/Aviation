package com.fh.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class FlightQuery {
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    private Integer type;
    private Integer planeType;
    private Integer planeSize;
    private String startCity;
    private String endCity;
    private  Integer isTicket;


    public Integer getIsTicket() {
        return isTicket;
    }

    public void setIsTicket(Integer isTicket) {
        this.isTicket = isTicket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPlaneType() {
        return planeType;
    }

    public void setPlaneType(Integer planeType) {
        this.planeType = planeType;
    }

    public Integer getPlaneSize() {
        return planeSize;
    }

    public void setPlaneSize(Integer planeSize) {
        this.planeSize = planeSize;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }
}
