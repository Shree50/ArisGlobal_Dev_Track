package com.example.crud.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subject 
{
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", techerName=" + techerName + ", duration=" + duration + "]";
	}

	public Subject(long id, String name, String techerName, Integer duration) {
		
		this.id = id;
		this.name = name;
		this.techerName = techerName;
		this.duration = duration;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTecherName() {
		return techerName;
	}

	public void setTecherName(String techerName) {
		this.techerName = techerName;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Id
	@GeneratedValue
	@Column(name="SUBJECT_ID")
	private long id;
	
	@Column
	private  String name;
	
	@Column
	private String techerName;
	
	@Column
	private Integer duration;
}
