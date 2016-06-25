package com.rezvani.assistant.model;

/**
 * Created by mrezvani on 6/21/2016.
 */
public enum EventType {

    OPENED("opened"),
    CLOSED("closed"),
    REOPENED("reopened"),
    WAITING("waiting"),
    INPROGRESS("inprogress"),
    DONE("done"),
    TODO("todo");

    private String value;

    EventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

