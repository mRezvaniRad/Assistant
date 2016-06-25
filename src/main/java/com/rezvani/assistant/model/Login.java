package com.rezvani.assistant.model;

import javax.persistence.*;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class Login extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_userPass")
    private UserNamePassword userNamePassword;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserNamePassword getUserNamePassword() {
        return userNamePassword;
    }

    public void setUserNamePassword(UserNamePassword userNamePassword) {
        this.userNamePassword = userNamePassword;
    }
}
