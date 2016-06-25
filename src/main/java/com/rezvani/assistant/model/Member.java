package com.rezvani.assistant.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by mrezvani on 6/12/2016.
 */
@Entity
public class Member extends BaseEntity {
    @OneToMany(mappedBy = "member")
    private List<MedicineType> medicineTypes;

    @OneToMany(mappedBy = "member")
    private List<Goal> goals;

    @OneToMany(mappedBy = "member")
    private List<SprintType> sprintTypes;

    @OneToMany(mappedBy = "member")
    private List<Task> tasks;

    @OneToMany(mappedBy = "member")
    private List<DebtType> debtTypes;

    @OneToMany(mappedBy = "member")
    private List<PaymentDetail> paymentDetails;

    @OneToMany(mappedBy = "member")
    private List<Fund> funds;

    public List<MedicineType> getMedicineTypes() {
        return medicineTypes;
    }

    public void setMedicineTypes(List<MedicineType> medicineTypes) {
        this.medicineTypes = medicineTypes;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public List<SprintType> getSprintTypes() {
        return sprintTypes;
    }

    public void setSprintTypes(List<SprintType> sprintTypes) {
        this.sprintTypes = sprintTypes;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<DebtType> getDebtTypes() {
        return debtTypes;
    }

    public void setDebtTypes(List<DebtType> debtTypes) {
        this.debtTypes = debtTypes;
    }

    public List<PaymentDetail> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaymentDetail> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public List<Fund> getFunds() {
        return funds;
    }

    public void setFunds(List<Fund> funds) {
        this.funds = funds;
    }
}
