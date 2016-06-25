package com.rezvani.assistant.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Created by mrezvani on 6/21/2016.
 */
@Entity
public class Demand extends PaymentDetail {

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_debtType")
    private DebtType debtType;

    public DebtType getDebtType() {
        return debtType;
    }

    public void setDebtType(DebtType debtType) {
        this.debtType = debtType;
    }
}
