package com.rezvani.assistant.model;

import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class MedicineType extends BaseEntity {
    private String tittle;
    private List<MedicineInfo> medicineInfoes;

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

   }
