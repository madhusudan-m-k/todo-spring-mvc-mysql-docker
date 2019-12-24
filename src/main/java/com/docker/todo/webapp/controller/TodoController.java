package com.docker.todo.webapp.controller;

import java.util.List;

import com.docker.todo.webapp.model.Todo;
import com.docker.todo.webapp.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {

    @Autowired
    private TodoService todoService;

    public TodoController() {

    }

    /**
     * find all todo list.
     * 
     * @param model input data
     * @return view object to be returned.
     */
    @RequestMapping(value = "/todo/todolist", method = RequestMethod.GET)
    public String findTodoList(Model model) {
        System.out.println("login method 2");
        List<Todo> todoList = todoService.findAll();
        model.addAttribute("todolist", todoList);
        return "todo-list";
    }

    /**
     * create new todo data.
     * 
     * @param model input model
     * @return return view
     */
    @RequestMapping(value = "/todo/createnewtodo", method = RequestMethod.GET)
    public String createNewTodo(Model model) {
        Todo todo = new Todo();
        model.addAttribute("todoModel", todo);

        return "add-todo";
    }

    /**
     * Request Mapping to add new todo task.
     * 
     * @param todo  todo task
     * @param model model for the view object to share info
     * @return Return the view object
     */
    @RequestMapping(value = "/todo/addtodo", method = RequestMethod.POST)
    public String addTodo(@ModelAttribute(name = "todoModel") Todo todo, Model model) {
        Todo objTodo = todoService.add(todo);
        model.addAttribute("todo", objTodo);
        List<Todo> todoList = todoService.findAll();
        model.addAttribute("todolist", todoList);
        return "todo-list";
    }
}