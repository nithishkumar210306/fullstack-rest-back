package com.taskapi.taskrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskapi.taskrestapi.entity.model;

@Repository
public interface taskrepository extends JpaRepository<model, Long> {

}
