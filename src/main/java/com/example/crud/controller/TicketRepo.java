package com.example.crud.controller;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.controller.Ticket;

@Repository
public interface TicketRepo extends JpaRepository<Ticket,Long> 
{

}
