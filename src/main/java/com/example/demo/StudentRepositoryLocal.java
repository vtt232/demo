package com.example.demo;


import org.springframework.stereotype.Repository;





@Repository
public class StudentRepositoryLocal implements StudentRepository {


    private static StudentList list= new StudentList();

    static
    {
        list.getStudentList().add(new Student("Le van hoa", 11));

        list.getStudentList().add(new Student("Nguyen van A", 14));

        list.getStudentList().add(new Student("Huynh duc", 18));
    }

        // Method to return the list
        public StudentList getAllStudent()
        {

            return list;
        }
        
        public Student getByAge(int age) {
            for (Student student : list.getStudentList()) {
                if (student.getAge() == age) {
                    return student;
                }
            }
            return null;
        }

        public StudentList addStudent(Student student) {
            list.getStudentList().add(student);
            return list;
        }

        public Student updateStudent(int age, Student studentUpdateDetail) {
            Student updatingStudent = getByAge(age);
            updatingStudent.setAge(studentUpdateDetail.getAge());
            updatingStudent.setName(studentUpdateDetail.getName());
            return updatingStudent;
        }

        public StudentList deleteStudent(int age) {
            Student deletingStudent = getByAge(age);
            list.getStudentList().remove(deletingStudent);
            return list;
        }

}