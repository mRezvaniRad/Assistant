package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class MedicineVisit extends BaseEntity {

    @Column(name = "fee")
    private Long fee;

    @Column(name = "date")
    private Calendar date;

    @OneToMany(mappedBy ="medicineVisit")
    private List<Drug> drugs;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_medicineInfo")
    private MedicineInfo medicineInfo;

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }
}
