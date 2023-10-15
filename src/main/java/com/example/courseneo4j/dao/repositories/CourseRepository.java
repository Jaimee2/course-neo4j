package com.example.courseneo4j.dao.repositories;

import com.example.courseneo4j.dao.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Optional;

public interface CourseRepository extends Neo4jRepository<Course, Long> {
    Optional<Course> findByIdentifier(String identifier);
}
