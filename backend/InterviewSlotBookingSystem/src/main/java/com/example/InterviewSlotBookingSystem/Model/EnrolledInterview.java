package com.example.InterviewSlotBookingSystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EnrolledInterview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email_id;
    private Long phone_no;
    private String roles;
    private String timing;

    public EnrolledInterview(String name, String email_id, Long phone_no, String roles, String timing) {
        this.name = name;
        this.email_id = email_id;
        this.phone_no = phone_no;
        this.roles = roles;
        this.timing = timing;
    }
    public EnrolledInterview() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public Long getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(Long phone_no) {
        this.phone_no = phone_no;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String date) {
        this.timing= timing;
    }
}
