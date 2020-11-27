package com.accenture.democode.day9.junit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoApp {

    private List<ToDo> toDoList = new ArrayList<>();

    // Add todos
    public void addToDo(String task, LocalDate completionDate) {
        // validate if completionDate is not before today
        if (!completionDate.isBefore(LocalDate.now())) {
            ToDo toDo = new ToDo(task, completionDate, false);
            toDoList.add(toDo);
        }
    }

    public List<ToDo> getToDoList() {
        return toDoList;
    }

// Complete todo

    // Display todo list
}
