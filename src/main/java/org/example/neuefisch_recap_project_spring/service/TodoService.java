package org.example.neuefisch_recap_project_spring.service;

import lombok.RequiredArgsConstructor;
import org.example.neuefisch_recap_project_spring.model.Todo;
import org.example.neuefisch_recap_project_spring.repository.TodoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service


public class TodoService {


    private  final TodoRepository todoRepository;


    public void addData () {
        todoRepository.insert( List.of(new Todo("12","dfgdg","OPEN"),new Todo("13","dfgdg","IN_PROGRESS"),new Todo("14","dfgdg","DONE")));
    }

    public List<Todo> getAll () {
        return todoRepository.findAll();
    }

    public Todo getById (String id) {
        return todoRepository.findById(id).orElseThrow();
    }

    public void addTodo (String message, String status) {
        todoRepository.insert(new Todo(UUID.randomUUID().toString(),message, status));
    }


    public void saveTodo (Todo todo) {
        todoRepository.save(todo);
    }

    public void deletTodoById (String id) {
        todoRepository.deleteById(id);
    }


}
