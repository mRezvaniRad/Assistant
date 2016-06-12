package com.rezvani.assistant.model;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class SprintType extends BaseEntity {
    private String tittle;
    private Sprint sprint;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
}
