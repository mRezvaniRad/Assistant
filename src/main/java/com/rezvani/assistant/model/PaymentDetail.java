package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class PaymentDetail extends BaseEntity {

    @Column(name = "payment")
    private Long payment;

    @Column(name = "paymentDate")
    @Temporal(TemporalType.DATE)
    private Calendar paymentDate;

    @Column(name = "description")
    private String description;

    @Column(name = "done")
    private Boolean done;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;


    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Calendar getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
