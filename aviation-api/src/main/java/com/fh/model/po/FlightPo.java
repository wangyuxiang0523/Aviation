package com.fh.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@TableName("w_flight")
public class FlightPo {
    @TableId(value = "id",type = IdType.AUTO)
    private  Integer id;

    private String name;
    @TableField(value = "typeId")
    private Integer typeId;
    @TableField(value = "startTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @TableField(value = "endTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;
    @TableField(value = "startTerminalId")
    private Integer startTermianlId;
    @TableField(value = "endTerminalId")
    private Integer endTermianlId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
