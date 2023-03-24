package com.example.manali.coursemanagement.controller;

import com.example.manali.coursemanagement.model.Student;
import com.example.manali.coursemanagement.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }
    @RequestMapping("/all")
    @GetMapping
    public List<Student> getStudents(){
        return repository.findAll();
    }
    @RequestMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody Student student){
        repository.save(student);
    }
}
