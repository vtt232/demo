package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class StudentList{
    private List<Student> studentList;

    public List<Student> getStudentList()
    {
  
        if (studentList == null) {
  
            studentList = new ArrayList<>();
  
                   
        }
  
        return studentList;        
    }
  
    public void setStudentList(List<Student> studentList)
    {
        this.studentList= studentList;
    }
}