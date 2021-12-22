package com.example.crud.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="trains")
public class Trains 
{
	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="train_no")
    private long train_no;
	
    @Column(name="train_name")
	private String train_name;
    @Column(name="souce")
	private String source;
    @Column(name="destination")
	private String destination;
    @Column(name="ticketPrice")
	private double ticketPrice;
	
	
	@Override
	public String toString() {
		return "Trains [train_no=" + train_no + ", train_name=" + train_name + ", source=" + source + ", destination="
				+ destination + ", ticketPrice=" + ticketPrice + "]";
	}


	public long getTrain_no() {
		return train_no;
	}


	public void setTrain_no(long train_no) {
		this.train_no = train_no;
	}


	public String getTrain_name() {
		return train_name;
	}


	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
}
