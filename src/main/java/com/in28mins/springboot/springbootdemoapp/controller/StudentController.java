package com.in28mins.springboot.springbootdemoapp.controller;

import com.in28mins.springboot.springbootdemoapp.entity.Student;
import com.in28mins.springboot.springbootdemoapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;

    @GetMapping("/students")
    public List<Student> getStudents() {
        Iterable<Student> studentsIterable =  repository.findAll();

        if(studentsIterable instanceof List) {
            return (List<Student>) studentsIterable;
        }
        return null;
    }
}
