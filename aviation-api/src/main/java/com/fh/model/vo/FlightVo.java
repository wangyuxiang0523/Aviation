package com.fh.model.vo;

import java.math.BigDecimal;
import java.util.Date;

public class FlightVo {
   private Integer flightId;

    private String flightName;

    private Date startTime;

    private Date endTime;

    private String planeName;

    private Integer planeTypeId;

    private Integer totalCount;

    private BigDecimal price;

    private String startAreaName;

    private Integer startAreaPid;

    private Integer endAreaPid;

    private String endAreaName;

    private String startPAreaName;

    private String endPAreaName;

    private Integer startAreaId;

    private Integer endAreaId;

    private String near;

    public String getNear() {
        return near;
    }

    public void setNear(String near) {
        this.near = near;
    }

    public Integer getStartAreaId() {
        return startAreaId;
    }

    public void setStartAreaId(Integer startAreaId) {
        this.startAreaId = startAreaId;
    }

    public Integer getEndAreaId() {
        return endAreaId;
    }

    public void setEndAreaId(Integer endAreaId) {
        this.endAreaId = endAreaId;
    }

    public String getStartPAreaName() {
        return startPAreaName;
    }

    public void setStartPAreaName(String startPAreaName) {
        this.startPAreaName = startPAreaName;
    }

    public String getEndPAreaName() {
        return endPAreaName;
    }

    public void setEndPAreaName(String endPAreaName) {
        this.endPAreaName = endPAreaName;
    }

    public Integer getStartAreaPid() {
        return startAreaPid;
    }

    public void setStartAreaPid(Integer startAreaPid) {
        this.startAreaPid = startAreaPid;
    }

    public Integer getEndAreaPid() {
        return endAreaPid;
    }

    public void setEndAreaPid(Integer endAreaPid) {
        this.endAreaPid = endAreaPid;
    }

    public String getStartAreaName() {
        return startAreaName;
    }

    public void setStartAreaName(String startAreaName) {
        this.startAreaName = startAreaName;
    }

    public String getEndAreaName() {
        return endAreaName;
    }

    public void setEndAreaName(String endAreaName) {
        this.endAreaName = endAreaName;
    }


    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public Integer getPlaneTypeId() {
        return planeTypeId;
    }

    public void setPlaneTypeId(Integer planeTypeId) {
        this.planeTypeId = planeTypeId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
