package com.example.crud.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.controller.TrainService;
import com.example.crud.controller.UserData;

@RestController
@RequestMapping("/api/railway")
public class TicketController 
{
	@Autowired
	private TrainService service;
	@Autowired
	private TrainRepo trainRepo;
	@Autowired
	private PassengerRepo passengerRepo;
	@Autowired
	private TicketRepo ticketRepo;
	  

	public TicketController(TrainService service) {
		super();
		this.service = service;
	}
	@GetMapping("/getTrains")
	public List<Trains> getAll()
	{
		return trainRepo.findAll();
		
	}
	@PostMapping("/add")
	public List<Trains> addTrains (@RequestBody Trains trains)
	{
		trainRepo.save(trains);
		
		return trainRepo.findAll();
		
	}

	@PostMapping("/get")
	public String save(@RequestBody UserData users) throws IOException {
		 
	    return (service.generatePNR(users));

	}
}
