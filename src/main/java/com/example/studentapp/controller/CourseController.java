package com.example.studentapp.controller;

import com.example.studentapp.entity.Course;
import com.example.studentapp.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }
}