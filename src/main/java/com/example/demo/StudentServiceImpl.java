package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student saveStudent(Student student) {
        Student studentresponse = studentRepository.save(student);
        return studentresponse;
    }

    @Transactional
    public Student findById(int id) {
        Student studentresponse = studentRepository.findById(id);
        return studentresponse;
    }

    @Transactional
    public Student updateStudent(Student student) {
        Student studentresponse = studentRepository.save(student);
        return studentresponse;
    }

}
