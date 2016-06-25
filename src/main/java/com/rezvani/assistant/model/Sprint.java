package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by mrezvani on 6/12/2016.
 */

@Entity
public class Sprint extends BaseEntity {

    @Column(name = "tittle")
    private String tittle;

    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.DATE)
    private Calendar endDate;

    @OneToMany(mappedBy = "sprint")
    private SprintType sprintType;

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public SprintType getSprintType() {
        return sprintType;
    }

    public void setSprintType(SprintType sprintType) {
        this.sprintType = sprintType;
    }
}
