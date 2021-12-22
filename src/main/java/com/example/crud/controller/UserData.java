package com.example.crud.controller;

import java.sql.Date;
import java.util.List;

import com.example.crud.controller.Passenger;

public class UserData {
private long train_no;
 private Date travel_date;
 private List<Passenger> pass;
public long getTrain_no() {
	return train_no;
}
public void setTrain_no(long train_no) {
	this.train_no = train_no;
}
public Date getTravel_date() {
	return travel_date;
}
public void setTravel_date(Date travel_date) {
	this.travel_date = travel_date;
}
public List<Passenger> getPass() {
	return pass;
}
public void setPass(List<Passenger> pass) {
	this.pass = pass;
}
public UserData(long train_no, Date travel_date, List<Passenger> pass) {
	super();
	this.train_no = train_no;
	this.travel_date = travel_date;
	this.pass = pass;
}
@Override
public String toString() {
	return "UserData [train_no=" + train_no + ", travel_date=" + travel_date + ", pass=" + pass + "]";
}
public UserData() {
	super();
	
}
	
 
	
}
