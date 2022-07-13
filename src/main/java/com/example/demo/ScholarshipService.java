package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScholarshipService {

    @Autowired
    private ScholarshipResponsitory scholarshipResponsitory;

    public ScholarshipService(ScholarshipResponsitory scholarshipResponsitory) {
        this.scholarshipResponsitory = scholarshipResponsitory;
    }

    public void getScholarship() {
        scholarshipResponsitory.getScholarship();
    }


    
}
