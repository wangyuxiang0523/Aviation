package com.fh.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class AddFlightPo {


    private String name;
    private Integer typeId;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    private Integer startTermianlId;
    private Integer endTermianlId;
    private Integer flightId;
    private Integer type;
    private Integer totalCount;
    private BigDecimal price;
    private Integer totalCountt;
    private BigDecimal pricee;
    private Integer toudeng;
    private Integer jingji;

    public Integer getTotalCountt() {
        return totalCountt;
    }

    public void setTotalCountt(Integer totalCountt) {
        this.totalCountt = totalCountt;
    }

    public BigDecimal getPricee() {
        return pricee;
    }

    public void setPricee(BigDecimal pricee) {
        this.pricee = pricee;
    }

    public Integer getToudeng() {
        return toudeng;
    }

    public void setToudeng(Integer toudeng) {
        this.toudeng = toudeng;
    }

    public Integer getJingji() {
        return jingji;
    }

    public void setJingji(Integer jingji) {
        this.jingji = jingji;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

    public Integer getStartTermianlId() {
        return startTermianlId;
    }

    public void setStartTermianlId(Integer startTermianlId) {
        this.startTermianlId = startTermianlId;
    }

    public Integer getEndTermianlId() {
        return endTermianlId;
    }

    public void setEndTermianlId(Integer endTermianlId) {
        this.endTermianlId = endTermianlId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
