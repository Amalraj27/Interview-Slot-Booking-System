package com.example.InterviewSlotBookingSystem.Controller;

import com.example.InterviewSlotBookingSystem.Model.AvailableInterview;
import com.example.InterviewSlotBookingSystem.Model.EnrolledInterview;
import com.example.InterviewSlotBookingSystem.Services.InterviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class InterviewController {

    @Autowired
    InterviewServices services;

    @GetMapping("/availableinterview")
    public List<AvailableInterview> getavaliable()
    {
        return services.getavailable();
    }

    @GetMapping("/enrolled")
    public List<EnrolledInterview> getenrolled()
    {
        return services.enrolledavailable();
    }

    @PostMapping("/interviewbooking")
    public String interviewbook(@RequestParam("name") String name,
                                @RequestParam("email_id") String email_id,
                                @RequestParam("phone_no") Long phone_no,
                                @RequestParam("roles") String roles,
                                @RequestParam("timing") String timing)
    {
        services.interviewbook(name,email_id,phone_no,roles,timing);
        return "Congrats "+name+" you successfully registered for "+ timing;
    }
}
