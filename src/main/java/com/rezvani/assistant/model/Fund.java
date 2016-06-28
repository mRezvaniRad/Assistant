package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by mrezvani on 6/12/2016.
 */

@Entity
public class Fund extends BaseEntity {
    @Column(name = "payment")
    private Long payment;

    @Column(name = "paymentIncrement")
    private Long paymentIncrement;

    @Column(name = "paymentDecrement")
    private Long paymentDecrement;

    @Column(name = "date")
    private Calendar date;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Long getPaymentIncrement() {
        return paymentIncrement;
    }

    public void setPaymentIncrement(Long paymentIncreament) {
        this.paymentIncrement = paymentIncrement;
    }

    public Long getPaymentDecrement() {
        return paymentDecrement;
    }

    public void setPaymentDecrement(Long paymentDecreament) {
        this.paymentDecrement = paymentDecreament;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
