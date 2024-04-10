package org.example.neuefisch_recap_project_spring.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {

    private  String  id;
    private  String    description;
    private  String    status; // string  OPEN IN_PROGRESS DONE),

}
