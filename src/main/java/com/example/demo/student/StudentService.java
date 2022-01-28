package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return Arrays.asList(new Student(), new Student());
    }

}
