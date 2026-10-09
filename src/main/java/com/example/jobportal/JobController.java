package com.example.jobportal;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping("/jobs")
    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    @PostMapping("/jobs")
    public Job addJob(@RequestBody Job job) {
        return jobRepository.save(job);
    }
}