package com.example.crud.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


import com.example.crud.controller.Passenger;

public interface PassengerRepo extends JpaRepository<Passenger,Long> 
{

}
