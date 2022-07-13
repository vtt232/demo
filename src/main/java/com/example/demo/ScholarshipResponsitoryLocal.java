package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScholarshipResponsitoryLocal implements ScholarshipResponsitory {

    private ScholarshipProgram scholarshipProgram;

    @Autowired
    public ScholarshipResponsitoryLocal(ScholarshipProgram scholarshipProgram) {
        this.scholarshipProgram = scholarshipProgram;
    }

    public void getScholarship() {
        scholarshipProgram.getScholarship().show();
    }
    
}
