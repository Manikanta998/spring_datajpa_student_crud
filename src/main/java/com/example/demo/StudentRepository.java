package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {
    public Student findById(int id);
}
