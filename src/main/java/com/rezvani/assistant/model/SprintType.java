package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
@Table(name = "tb_sprint_type")
public class SprintType extends BaseEntity {

    @Column(name = "tittle")
    private String tittle;

    @OneToMany(mappedBy = "sprintType")
    private Set<Sprint> sprint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Set<Sprint> getSprint() {
        return sprint;
    }

    public void setSprint(Set<Sprint> sprint) {
        this.sprint = sprint;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
