package com.rezvani.assistant.model;

import java.security.Timestamp;
import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class MedicineVisit extends BaseEntity {

    private Long fee;
    private Timestamp date;
    private List<Drug> drugs;

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }
}
