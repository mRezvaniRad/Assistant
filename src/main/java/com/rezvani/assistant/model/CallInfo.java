package com.rezvani.assistant.model;

import javax.persistence.*;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class CallInfo extends BaseEntity {

    @Column(name = "phone")
    private String phone;

    @Column(name ="cell")
    private String cell;

    @Column(name = "email")
    private String email;

    @Column(name = "webSite")
    private String webSite;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "fk_addr")
    private Address address;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
