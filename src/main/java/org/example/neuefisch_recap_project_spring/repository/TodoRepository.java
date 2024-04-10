package org.example.neuefisch_recap_project_spring.repository;

import org.example.neuefisch_recap_project_spring.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository

public interface TodoRepository extends MongoRepository<Todo,String> {
    List<Todo> findAll ();
    Optional<Todo> findById (String id);
}
