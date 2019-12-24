package com.docker.todo.webapp.service;

import com.docker.todo.webapp.model.Todo;
import com.docker.todo.webapp.repository.TodoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Todo add(Todo todo) {
        return repository.save(todo);
    }

    public List<Todo> findAll() {
        return repository.findAll();
    }
}