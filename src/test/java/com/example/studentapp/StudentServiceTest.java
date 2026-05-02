package com.example.studentapp;

import com.example.studentapp.repository.StudentRepository;
import com.example.studentapp.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService service;

    @Test
    void testGetAllStudents() {
        assertNotNull(service.getAllStudents());
    }


    @Autowired
    private StudentRepository repo;

    @Test
    void testFindAll() {
        assertNotNull(repo.findAll());
    }
}