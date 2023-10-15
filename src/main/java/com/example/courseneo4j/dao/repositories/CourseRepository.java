package com.example.courseneo4j.dao.repositories;

import com.example.courseneo4j.dao.models.Course;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CourseRepository extends Neo4jRepository<Course, Long> {
}
