package com.rezvani.assistant.model;

import javax.persistence.*;

/**
 * Created by mrezvani on 6/21/2016.
 */
@Entity
@Table(name = "tb_demand")
public class Demand extends PaymentDetail {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_debtType")
    private DebtType debtType;

    public DebtType getDebtType() {
        return debtType;
    }

    public void setDebtType(DebtType debtType) {
        this.debtType = debtType;
    }
}
