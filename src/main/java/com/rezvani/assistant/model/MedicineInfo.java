package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class MedicineInfo extends BaseEntity{

    @Column(name = "tittle")
    private String tittle;

    @OneToMany(mappedBy = "medicineInfo")
    private List<Address> addresses;

    @OneToMany(mappedBy = "medicineInfo")
    private List<MedicineVisit> medicineVisit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_medicineType")
    private MedicineType medicineType;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<MedicineVisit> getMedicineVisit() {
        return medicineVisit;
    }

    public void setMedicineVisit(List<MedicineVisit> medicineVisit) {
        this.medicineVisit = medicineVisit;
    }

    public MedicineType getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }
}
