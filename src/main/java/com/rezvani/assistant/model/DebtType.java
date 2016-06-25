package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class DebtType extends BaseEntity {

    @Column(name = "tittle")
    private String tittle;

    @OneToMany(mappedBy = "debtType")
    private List<Debt> debts;

    @OneToMany(mappedBy = "debtType")
    private List<Demand> demand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;

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

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
