package com.rezvani.assistant.model;

import javax.persistence.*;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class Goal extends BaseEntity {

    @Column(name = "tittle")
    private String tittle;

    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
