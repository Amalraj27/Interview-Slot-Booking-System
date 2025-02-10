package com.example.InterviewSlotBookingSystem.Model;

import jakarta.persistence.*;
@Entity

public class AvailableInterview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String interviewer_name;
    private String interviewer_email_id;
    private Long interviewer_phone_number;
    private String roles;

    public String getInterviewer_name() {
        return interviewer_name;
    }

    public void setInterviewer_name(String interviewer_name) {
        this.interviewer_name = interviewer_name;
    }

    public String getInterviewer_email_id() {
        return interviewer_email_id;
    }

    public void setInterviewer_email_id(String interviewer_email_id) {
        this.interviewer_email_id = interviewer_email_id;
    }

    public Long getInterviewer_phone_number() {
        return interviewer_phone_number;
    }

    public void setInterviewer_phone_number(Long interviewer_phone_number) {
        this.interviewer_phone_number = interviewer_phone_number;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AvailableInterview(String interviewer_name, String interviewer_email_id, Long interviewer_phone_number, String roles) {
        this.interviewer_name = interviewer_name;
        this.interviewer_email_id = interviewer_email_id;
        this.interviewer_phone_number = interviewer_phone_number;
        this.roles = roles;
    }

    public AvailableInterview() {}
}
