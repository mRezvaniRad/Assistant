package com.rezvani.assistant.model;

import java.util.Date;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class Sprint extends BaseEntity {
    private Date startDate;
    private Date endDate;

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
}
