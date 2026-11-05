package com.example.studentservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
            new Student(101, "Rahul"),
            new Student(102, "Priya"),
            new Student(103, "Kiran"),
            new Student(104, "Sriram")
        );
    }
}
