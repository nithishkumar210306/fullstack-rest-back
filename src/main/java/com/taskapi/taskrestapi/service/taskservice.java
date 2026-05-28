package com.taskapi.taskrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskapi.taskrestapi.repository.taskrepository;
import com.taskapi.taskrestapi.entity.model;

@Service
public class taskservice {

    @Autowired
    public taskrepository repo;

    public List<model> getAllTasks() {
        return repo.findAll();
    }

    public model saveTask(model task) {
        return repo.save(task);
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}