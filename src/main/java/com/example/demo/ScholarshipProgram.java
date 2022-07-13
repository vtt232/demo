package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ScholarshipProgram {
    @Autowired
    private Scholarship scholarship;


    @Autowired
    public ScholarshipProgram(Scholarship scholarship)
    {
        this.scholarship = scholarship;
    }
    
    public Scholarship getScholarship(){
        return this.scholarship;
    }
}
