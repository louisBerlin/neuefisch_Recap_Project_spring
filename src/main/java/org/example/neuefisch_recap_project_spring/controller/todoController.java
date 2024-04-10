package org.example.neuefisch_recap_project_spring.controller;


import lombok.RequiredArgsConstructor;
import org.example.neuefisch_recap_project_spring.dto.TodoWOId;
import org.example.neuefisch_recap_project_spring.model.Todo;
import org.example.neuefisch_recap_project_spring.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class todoController {



    private final TodoService todoService;

    @GetMapping("/api/addtodo")
    public void addData () {
todoService.addData();
    }


    // responseURL: "http://localhost:8080/api/todo"
    //  get

    @GetMapping("/api/todo")
        public List<Todo> todo () {

return todoService.getAll();
    }



    @GetMapping("/api/todo/{id}")
    public Todo byid (@PathVariable String id) {

        return todoService.getById(id);
    }

    @PostMapping("/api/todo")
    public void addTodo (@RequestBody TodoWOId todo) {

         todoService.addTodo(todo.getDescription(), todo.getStatus());
    }


    @PutMapping("/api/todo/{id}")
    public void saveTodo (@PathVariable String id,@RequestBody Todo todo) {
//        System.out.println(raw);
        todoService.saveTodo(new Todo(id,todo.getDescription(),todo.getStatus()));
    }


    @DeleteMapping("/api/todo/{id}")
    public void saveTodo (@PathVariable String id) {
//        System.out.println(raw);
        todoService.deletTodoById(id);
    }


/*
    @PutMapping("/api/todo/{id}")
    public void save (@PathVariable String id) {

        return todoService.getById(id);
    }


 */


/*
    @DeleteMapping("/api/todo/${id}")
    public void deletByid (@PathVariable String id) {

         todoService.deletTodoById(id);
    }

 */



    //     id: string,
    //    description: string,
    //    status: string  OPEN IN_PROGRESS DONE),

    /**
     * export const getAllTodos = () =>
     *   axios.get('/api/todo').then(response => response.data)
     *
     * export const getTodoById = id =>
     *   axios.get(`/api/todo/${id}`).then(response => response.data)
     *
     * export const postTodo = description =>
     *   axios.post('/api/todo', { description: description, status: 'OPEN' })
     *
     * export const putTodo = todo => axios.put(`/api/todo/${todo.id}`, todo)
     *
     * export const deleteTodo = id => axios.delete(`/api/todo/${id}`)
     **/



}
