package com.example.InterviewSlotBookingSystem.Repo;

import com.example.InterviewSlotBookingSystem.Model.AvailableInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableInterviewRepo extends JpaRepository<AvailableInterview,Integer> {
}
