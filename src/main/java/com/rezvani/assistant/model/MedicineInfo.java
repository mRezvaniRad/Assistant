package com.rezvani.assistant.model;

import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class MedicineInfo extends BaseEntity{

    private String tittle;
    private List<Address> addresses;
    private List<MedicineVisit> medicineVisit;

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
}
