package com.example.courseneo4j.controllers;

import com.example.courseneo4j.dao.models.Lesson;
import com.example.courseneo4j.services.LessonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lessons")
@AllArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    @GetMapping
    public ResponseEntity<List<Lesson>> lessonsIndex() {
        return ResponseEntity.ok(lessonService.getAllLessons());
    }

    @GetMapping("/by-id-course/{identifier}")
    public ResponseEntity<List<Lesson>> getCourse(@PathVariable String identifier) {
        return ResponseEntity.ok(lessonService.getAllLessonsByCourseIdentifier(identifier));
    }
}
