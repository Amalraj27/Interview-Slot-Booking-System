package com.example.InterviewSlotBookingSystem.Repo;
import com.example.InterviewSlotBookingSystem.Model.EnrolledInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolledInterviewRepo extends JpaRepository<EnrolledInterview, Integer> {
}
