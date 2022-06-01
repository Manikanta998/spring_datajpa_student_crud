package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Student saveStudent(@RequestBody Student student) {
        Student studentResponse = (Student) studentService.saveStudent(student);
        return studentResponse;
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Student updateStudent(@RequestBody Student student, @PathVariable int id) {
        Student existingStudent = studentService.findById(id);
        if(existingStudent == null) {
            throw new RuntimeException("Record not found");
        }
        Student studentResponse = (Student) studentService.updateStudent(student);
        return studentResponse;
    }

}
