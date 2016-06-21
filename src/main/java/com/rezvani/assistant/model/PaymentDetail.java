package com.rezvani.assistant.model;

import java.util.Date;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class PaymentDetail extends BaseEntity {

    private Long payment;
    private Date paymentDate;
    private String discription;
    private Boolean done;

    public Long getPayment() {
        return payment;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }
}
