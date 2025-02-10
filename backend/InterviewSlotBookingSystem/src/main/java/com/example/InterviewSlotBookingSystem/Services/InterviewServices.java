package com.example.InterviewSlotBookingSystem.Services;

import com.example.InterviewSlotBookingSystem.Model.AvailableInterview;
import com.example.InterviewSlotBookingSystem.Model.EnrolledInterview;
import com.example.InterviewSlotBookingSystem.Repo.AvailableInterviewRepo;
import com.example.InterviewSlotBookingSystem.Repo.EnrolledInterviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServices {

    @Autowired
    AvailableInterviewRepo availablerepo;

    @Autowired
    EnrolledInterviewRepo enrolled;

    public List<AvailableInterview> getavailable() {
       return availablerepo.findAll();
    }

    public List<EnrolledInterview> enrolledavailable() {
        return enrolled.findAll();
    }

    public void interviewbook(String name, String emailId, Long phoneNo, String roles, String timing) {
        EnrolledInterview enroll = new EnrolledInterview(name,emailId,phoneNo,roles,timing);
        enrolled.save(enroll);
    }
}
