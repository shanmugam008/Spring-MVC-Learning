package com.example.springmvc.SpringMvc.Service;

import com.example.springmvc.SpringMvc.Entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long studentId);

    Student updateStudent(Student student);

    public void deleteStudent(Long studentId);

}
