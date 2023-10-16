package com.example.courseneo4j.dao.models;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Data
public class Lesson {
    @Id
    @GeneratedValue
    private long id;
    private String identifier;
    private String title;
}
