package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CompanyScholarship implements Scholarship {
    public void show() {
        System.out.println("This is Company Scholarship");
    }
}
