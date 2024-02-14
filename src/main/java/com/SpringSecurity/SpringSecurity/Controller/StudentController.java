package com.SpringSecurity.SpringSecurity.Controller;

import com.SpringSecurity.SpringSecurity.Entity.Student;
import com.SpringSecurity.SpringSecurity.Repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    // http://localhost:8080/api/student
    public ResponseEntity<?> saveStudent(@RequestBody Student s1){

        Student save = repo.save(s1);

        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
    @GetMapping
    // http://localhost:8080/api/student
    public ResponseEntity<?> display(){

        List<Student> result = repo.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
