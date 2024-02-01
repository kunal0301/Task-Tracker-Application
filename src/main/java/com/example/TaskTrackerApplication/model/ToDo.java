package com.example.TaskTrackerApplication.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;


@Entity
@Table(name="todo")
public class ToDo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Nonnull
	private Long Id;
	
	@Column
	@Nonnull
	private String title;
	
	@Column
	@Nonnull
	private String description;
	
	@Column
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Nonnull
	private Date due_date;
	
	@Column
	@Nonnull
	private String Status;
	
	
	
	
	public ToDo() {
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDue_date() {
		return due_date;
	}

	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	

}
