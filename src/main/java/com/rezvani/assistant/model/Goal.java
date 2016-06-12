package com.rezvani.assistant.model;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class Goal extends BaseEntity {
    private String tittle;
    private String discription;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
