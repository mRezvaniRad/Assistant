package com.rezvani.assistant.model;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by mrezvani on 6/12/2016.
 */
public class Task extends BaseEntity {

    @Column(name = "tittle")
    private String title;

    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    private Calendar startDate;

    @Column(name = "endDate")
    @Temporal(TemporalType.DATE)
    private Calendar endDate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "eventType")
    private String eventType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_member")
    private Member member;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
