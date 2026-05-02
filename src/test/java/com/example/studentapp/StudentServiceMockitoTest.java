package com.example.studentapp;

import com.example.studentapp.entity.Student;
import com.example.studentapp.repository.StudentRepository;
import com.example.studentapp.service.StudentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StudentServiceMockitoTest {

    @Mock
    private StudentRepository repo;

    @InjectMocks
    private StudentService service;

    @Test
    void testGetAllStudents() {

        Student s1 = new Student();
        s1.setName("Aman");
        s1.setEmail("aman@test.com");

        Student s2 = new Student();
        s2.setName("Ravi");
        s2.setEmail("ravi@test.com");

        when(repo.findAll()).thenReturn(Arrays.asList(s1, s2));

        List<Student> result = service.getAllStudents();

        assertEquals(2, result.size());
    }
}
