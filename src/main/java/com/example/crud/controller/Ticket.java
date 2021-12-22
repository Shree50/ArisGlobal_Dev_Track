package com.example.crud.controller;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ticket_id")
	private int ticket_id;
	
	@Column(name="pnr")
	private String pnr;
	@Column
	private Date travel_date;

	

	@Override
	public String toString() {
		return "Ticket [ticket_id=" + ticket_id + ", pnr=" + pnr + ", travel_date=" + travel_date + ", train=" + train
				+ ", passanger=" + passanger + "]";
	}



	public Ticket(int ticket_id, String pnr, Date travel_date, Trains train, List<Passenger> passanger) {
		super();
		this.ticket_id = ticket_id;
		this.pnr = pnr;
		this.travel_date = travel_date;
		this.train = train;
		this.passanger = passanger;
	}



	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getTicket_id() {
		return ticket_id;
	}



	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}



	public String getPnr() {
		return pnr;
	}



	public void setPnr(String pnr) {
		this.pnr = pnr;
	}



	public Date getTravel_date() {
		return travel_date;
	}



	public void setTravel_date(Date travel_date) {
		this.travel_date = travel_date;
	}



	public Trains getTrain() {
		return train;
	}



	public void setTrain(Trains train) {
		this.train = train;
	}



	public List<Passenger> getPassanger() {
		return passanger;
	}

	public void setPassanger(List<Passenger> passanger) {
		this.passanger = passanger;
	}

	@OneToOne(cascade = CascadeType.ALL)
	private Trains train;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="ticket_pasenger",joinColumns= {@JoinColumn(name="ticket_id")},inverseJoinColumns={@JoinColumn(name="p_id")})
	private List<Passenger> passanger;
	
}
