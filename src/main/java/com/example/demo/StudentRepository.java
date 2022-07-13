package com.example.demo;



public interface StudentRepository {

    public StudentList getAllStudent();

    public Student getByAge(int age);

    public StudentList addStudent(Student student);

    public Student updateStudent(int age, Student studentUpdateDetail);
   
    public StudentList deleteStudent(int age);
}
