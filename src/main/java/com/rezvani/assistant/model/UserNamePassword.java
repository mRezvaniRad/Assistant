package com.rezvani.assistant.model;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class UserNamePassword extends BaseEntity{
    private String userName;
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
