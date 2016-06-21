package com.rezvani.assistant.model;

import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class DebtType extends BaseEntity {

    private String tittle;
    private List<Debt> debts;
    private List<Demand> demand;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<Debt> getDebts() {
        return debts;
    }

    public void setDebts(List<Debt> debts) {
        this.debts = debts;
    }

    public List<Demand> getDemand() {
        return demand;
    }

    public void setDemand(List<Demand> demand) {
        this.demand = demand;
    }
}
