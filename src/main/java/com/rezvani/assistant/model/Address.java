package com.rezvani.assistant.model;

import java.util.Set;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class Address extends BaseEntity {
    private String tittle;
    private String country;
    private String city;
    private String street;
    private String allay;
    private String zipCode;
    private Integer no ;
    private Set<CallInfo> callInfoes ;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAllay() {
        return allay;
    }

    public void setAllay(String allay) {
        this.allay = allay;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Set<CallInfo> getCallInfoes() {
        return callInfoes;
    }

    public void setCallInfoes(Set<CallInfo> callInfoes) {
        this.callInfoes = callInfoes;
    }
}
