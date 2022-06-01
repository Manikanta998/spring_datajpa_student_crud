package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public interface StudentService {
    public Student saveStudent(Student student);

    public Student findById(int id);

    public Student updateStudent(Student student);
}
