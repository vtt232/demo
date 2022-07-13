package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path="/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController( StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(path = "/",produces = "application/json")
    public StudentList getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping(path="/{age}",produces = "application/json")
    public Optional<Student> getStudent(@PathVariable int age) {
        Student student = studentService.getByAge(age);
        Optional<Student> result = Optional.of(student);
        if (result.isPresent()) {
            return result;
        }
        return null;
    }

    @PostMapping(path="/",produces = "application/json", consumes = "application/json")
    public List<Student> addStudent(@RequestBody Student newStudent) {
        StudentList studentList = studentService.addStudent(newStudent);
        if (studentList == null) {
            return null;
        }
        else {
            return studentList.getStudentList();
        }
    }

    @PutMapping(path = "/{age}", produces = "application/json", consumes = "application/json")
    public Student updateStudent(@PathVariable int age, @RequestBody Student studentUpdateDetail) {
        Student result = studentService.updateStudent(age, studentUpdateDetail);
        return result;
    }

    @DeleteMapping(path ="/{age}",produces = "application/json")
    public List<Student> deleteStudent(@PathVariable int age) {
        StudentList studentList = studentService.deleteStudent(age);
        if (studentList == null) {
            return null;
        }
        else {
            return studentList.getStudentList();
        }

    }
    
}
