package com.example.springmvc.SpringMvc.Repository;

import com.example.springmvc.SpringMvc.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
