package com.example.springmvc.SpringMvc.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_ID")
    private long studentId;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Email_ID")
    private String Email;




	public Student(String fistName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fistName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
