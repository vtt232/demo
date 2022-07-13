package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/scholarship")
public class ScholarshipProgramController {
    private ScholarshipService scholarshipService;

    @Autowired
    public ScholarshipProgramController(ScholarshipService scholarshipService) {
        this.scholarshipService = scholarshipService;
    }

    @GetMapping(path = "/")
    public void getScholarship() {
        scholarshipService.getScholarship();
    }



    
}
