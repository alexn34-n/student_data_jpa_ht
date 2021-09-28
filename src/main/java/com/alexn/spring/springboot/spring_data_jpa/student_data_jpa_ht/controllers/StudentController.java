package com.alexn.spring.springboot.spring_data_jpa.student_data_jpa_ht.controllers;


import com.alexn.spring.springboot.spring_data_jpa.student_data_jpa_ht.models.Student;
import com.alexn.spring.springboot.spring_data_jpa.student_data_jpa_ht.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/students")
public class StudentController{
    private final StudentService studentService;

    @GetMapping
    public List<Student> showAll() {
        return studentService.showAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id){
        return studentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void  deleteStudentById(@PathVariable long id){
        studentService.deleteById(id);

    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveNewStudent(@RequestBody Student student){
        student.setId(null);
        return studentService.saveOrUpdate(student);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.saveOrUpdate(student);
    }


}
