package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class MedicineType extends BaseEntity {

    @Column(name = "tittle")
    private String tittle;

    @OneToMany(mappedBy = "MedicineType")
    private List<MedicineInfo> medicineInfoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<MedicineInfo> getMedicineInfoes() {
        return medicineInfoes;
    }

    public void setMedicineInfoes(List<MedicineInfo> medicineInfoes) {
        this.medicineInfoes = medicineInfoes;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
