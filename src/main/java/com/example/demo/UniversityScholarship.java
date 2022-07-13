package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UniversityScholarship implements Scholarship {
    public void show() {
        System.out.println("This is University Scholarship");
    }
}
