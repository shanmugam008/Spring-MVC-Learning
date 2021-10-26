package com.example.springmvc.SpringMvc.Controller;

import com.example.springmvc.SpringMvc.Entity.Student;
import com.example.springmvc.SpringMvc.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String getStudents(Model model) {
        model.addAttribute("students", studentService.getStudents());
        return "students";
    }

        @GetMapping("/students/new")
        public String createStudentForm(Model model){
            Student student = new Student();
            model.addAttribute("student", student);
            return "create_student";
        }

        @PostMapping("/students")
        public String saveStudent(@ModelAttribute("student") Student student){

          studentService.saveStudent(student);
          return "redirect:/students";
        }

        @GetMapping("/students/edit/{studentId}")
        public String editStudentForm(@PathVariable Long studentId,Model model){
        model.addAttribute("student",studentService.getStudentById(studentId));
        return "edit_student";
        }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student) {

        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setStudentId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

        @GetMapping("students/{studentId}")
        public String deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
        return "redirect:/students";
        }








}
