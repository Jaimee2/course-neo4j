package com.example.courseneo4j.services;

import com.example.courseneo4j.dao.models.Lesson;
import com.example.courseneo4j.dao.repositories.LessonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;

    public List<Lesson> getAllLessons() {
        return lessonRepository.findAll();
    }

    public List<Lesson> getAllLessonsByCourseIdentifier(String identifier) {
        return lessonRepository.findLessonByCourseIdentifier(identifier);
    }

}
