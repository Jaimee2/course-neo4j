package com.example.courseneo4j.services;

import com.example.courseneo4j.dao.models.Course;
import com.example.courseneo4j.dao.repositories.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourse(String identifier) {
        return courseRepository.findByIdentifier(identifier)
                .orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404)));
    }


}
