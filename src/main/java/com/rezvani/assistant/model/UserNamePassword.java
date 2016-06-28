package com.rezvani.assistant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
@Table(name = "tb_usr_pass")
public class UserNamePassword extends BaseEntity{

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
