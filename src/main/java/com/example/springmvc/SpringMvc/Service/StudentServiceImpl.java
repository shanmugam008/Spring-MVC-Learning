package com.example.springmvc.SpringMvc.Service;

import com.example.springmvc.SpringMvc.Entity.Student;
import com.example.springmvc.SpringMvc.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public Student updateStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
         studentRepository.deleteById(studentId);
    }


}
