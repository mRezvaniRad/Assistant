package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Set;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
@Table( name ="tb_User")
public class User extends BaseEntity {

    @Column(name = "firstName")
    private String firstName ;

    @Column(name = "lastName")
    private String lastName ;

    @Column(name = "birthLocation")
    private String birthLocation ;

    @Column(name = "birthDate")
    @Temporal(TemporalType.DATE)
    private Calendar birthDate ;

    @OneToMany(mappedBy = "user")
    private Set<Address> addresses ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }
}
