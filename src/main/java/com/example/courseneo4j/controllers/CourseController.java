package com.example.courseneo4j.controllers;

import com.example.courseneo4j.dao.models.Course;
import com.example.courseneo4j.services.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/courses")
public class CourseController {

    private final CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> courseIndex() {
        return ResponseEntity.ok(courseService.getAllCourses());
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Course> courseIndex(@PathVariable String identifier) {
        return ResponseEntity.ok(courseService.getCourse(identifier));
    }



}
