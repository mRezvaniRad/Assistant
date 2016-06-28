package com.rezvani.assistant.model;


import javax.persistence.*;
import java.util.Set;

/**
 * Created by mrezvani on 6/12/2016.
*/

@Entity
@Table( name ="tb_Address")
public class Address extends BaseEntity {
    @Column(name = "title")
    private String tittle;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "allay")
    private String allay;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "no")
    private Integer no ;

    @OneToMany(mappedBy = "address")
    private Set<CallInfo> callInfoes ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_medicineInfo")
    private MedicineInfo medicineInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user")
    private User user;

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

    public MedicineInfo getMedicineInfo() {
        return medicineInfo;
    }

    public void setMedicineInfo(MedicineInfo medicineInfo) {
        this.medicineInfo = medicineInfo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
