package com.example.crud.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.crud.controller.Trains;

public interface TrainRepo extends JpaRepository<Trains,Long>{

	
	@Query("SELECT t FROM Trains t WHERE t.train_no = ?1")
	Trains findByTrainNumber(Long train_no);
}
