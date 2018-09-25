package com.andi.business;

import com.andi.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

// SUT ... System Under Tests
public class TodoBusinessImpl{

    // Dependency
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);

        for(String todo: todos){
            if(todos.contains("Spring"))
                filteredTodos.add(todo);
        }
        return filteredTodos;
    }
}

/*
public interface TodoService {

    public List<String> retrieveTodos(String user);
}*/
