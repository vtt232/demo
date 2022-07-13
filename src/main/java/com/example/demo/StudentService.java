package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentService( StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentList getAllStudents() {
        return studentRepository.getAllStudent();
    }
    
    public Student getByAge(int age) {
        return studentRepository.getByAge(age);
    }

    public StudentList addStudent(Student newStudent) {
        return studentRepository.addStudent(newStudent);
    }

    public Student updateStudent(int age, Student studentUpdateDetail) {
        return studentRepository.updateStudent(age, studentUpdateDetail);
    }

    public StudentList deleteStudent(int age) {
        return studentRepository.deleteStudent(age);
    }
}
