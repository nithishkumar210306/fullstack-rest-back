package com.taskapi.taskrestapi.controller;

import com.taskapi.taskrestapi.entity.model;
import com.taskapi.taskrestapi.service.taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin("*")
public class taskcontroller {

    @Autowired
    private taskservice service;

    @GetMapping
    public List<model> getTasks() {
        return service.getAllTasks();
    }

    @PostMapping
    public model addTask(@RequestBody model task) {
        return service.saveTask(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        service.deleteTask(id);
    }
}