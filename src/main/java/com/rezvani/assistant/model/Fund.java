package com.rezvani.assistant.model;

import java.security.Timestamp;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class Fund extends BaseEntity {
    private Long payment;
    private Long paymentIncreament;
    private Long paymentDecreament;
    private Timestamp date;
    private String discription;

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Long getPaymentIncreament() {
        return paymentIncreament;
    }

    public void setPaymentIncreament(Long paymentIncreament) {
        this.paymentIncreament = paymentIncreament;
    }

    public Long getPaymentDecreament() {
        return paymentDecreament;
    }

    public void setPaymentDecreament(Long paymentDecreament) {
        this.paymentDecreament = paymentDecreament;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
