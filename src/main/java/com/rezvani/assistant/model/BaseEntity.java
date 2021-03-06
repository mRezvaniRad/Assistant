package com.rezvani.assistant.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by mrezvani on 6/12/2016.
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {


    }
}
