package com.example.TaskTrackerApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TaskTrackerApplication.model.ToDo;


@Repository
public interface IToDoRepo extends JpaRepository<ToDo , Long> {
	

}
