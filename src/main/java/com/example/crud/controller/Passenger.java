package com.example.crud.controller;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="passengers")
public class Passenger implements Comparable
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="p_id") 
	private long p_id;
	
	@Column(name="pname")
	private String name;
	@Column(name="page")
	private int age;
	@Column(name="pgender")
	private char gender;
	@Override
	public String toString() {
		return "Passenger [p_id=" + p_id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public long getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public int compareTo(Object o) 
	{
		if (((Passenger) o).getName().toUpperCase().compareTo(getName().toUpperCase()) == 0)
		{
			return 1;
		}
			else
			{
			return -1;
			}
	}
}