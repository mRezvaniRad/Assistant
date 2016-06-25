package com.rezvani.assistant.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.security.Timestamp;
import java.util.Calendar;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class Drug extends BaseEntity {

    @Column(name = "title")
    private String tittle;

    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    private Timestamp startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.DATE)
    private Timestamp endDate;

    @Column(name = "startTime")
    @Temporal(TemporalType.TIME)
    private Timestamp startTime;

    @Column(name = "endTime")
    @Temporal(TemporalType.TIME)
    private Timestamp endTime;

    @Column(name = "useCount")
    private Integer useCount;

    @Column(name = "description")
    private String description;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
