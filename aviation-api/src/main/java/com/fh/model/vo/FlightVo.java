package com.fh.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fh.annotation.Export;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
@Export(title = "航班表")
public class FlightVo {
   private Integer flightId;
    @Export(name = "航班名")
    private String flightName;
    @Export(name = "起飞时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @Export(name = "到达时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @Export(name = "飞机类型")
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

    private Integer totalCount1;

    private Integer totalCount2;

    private BigDecimal price1;

    private BigDecimal price2;

    private Integer startCityId;

    private Integer endCityId;

    public Integer getStartCityId() {
        return startCityId;
    }

    public void setStartCityId(Integer startCityId) {
        this.startCityId = startCityId;
    }

    public Integer getEndCityId() {
        return endCityId;
    }

    public void setEndCityId(Integer endCityId) {
        this.endCityId = endCityId;
    }

    public Integer getTotalCount1() {
        return totalCount1;
    }

    public void setTotalCount1(Integer totalCount1) {
        this.totalCount1 = totalCount1;
    }

    public Integer getTotalCount2() {
        return totalCount2;
    }

    public void setTotalCount2(Integer totalCount2) {
        this.totalCount2 = totalCount2;
    }

    public BigDecimal getPrice1() {
        return price1;
    }

    public void setPrice1(BigDecimal price1) {
        this.price1 = price1;
    }

    public BigDecimal getPrice2() {
        return price2;
    }

    public void setPrice2(BigDecimal price2) {
        this.price2 = price2;
    }

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
