package com.rezvani.assistant.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Date;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
@Table(name = "tb_drug")
public class Drug extends BaseEntity {

    @Column(name = "title")
    private String tittle;

    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.DATE)
    private Date endDate;

    @Column(name = "startTime")
    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Column(name = "endTime")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    @Column(name = "useCount")
    private Integer useCount;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_medicineVisit")
    private MedicineVisit medicineVisit;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public MedicineVisit getMedicineVisit() {
        return medicineVisit;
    }

    public void setMedicineVisit(MedicineVisit medicineVisit) {
        this.medicineVisit = medicineVisit;
    }
}
