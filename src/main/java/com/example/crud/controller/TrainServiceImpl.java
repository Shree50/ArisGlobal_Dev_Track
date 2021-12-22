package com.example.crud.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.controller.Passenger;
import com.example.crud.controller.Ticket;
import com.example.crud.controller.Trains;
import com.example.crud.controller.PassengerRepo;
import com.example.crud.controller.TicketRepo;
import com.example.crud.controller.TrainRepo;


@Service
public class TrainServiceImpl implements TrainService {

	
	@Autowired
	private TicketRepo ticketrepo;
	@Autowired
	private PassengerRepo passengerrepo;
	@Autowired
	private TrainRepo trainrepo;
	private Ticket ticket;
	private Trains train;
	
	  
	    private TreeMap<Passenger, Double> passengers = new TreeMap<Passenger,Double>();
	    
	    private int counter=100;
	    

		@Override
		public String generatePNR(UserData users) throws IOException
		{
			train=trainrepo.findByTrainNumber(users.getTrain_no());
			if(train==null) 
			{
				return "Train Number Entered is invalid";
				
			}
			Date current_date = new Date();
			if(users.getTravel_date().before(current_date)) 
			{
				return "Travel Date is before current date";
			}
			SimpleDateFormat DateFor = new SimpleDateFormat("yyyyMMdd");
			String date = DateFor.format(users.getTravel_date());
			String pnr=Character.toString(train.getSource().charAt(0)) +
	                   Character.toString(train.getDestination().charAt(0)) + "_" +
	                   date+
	                  ++counter;
			        for(Passenger p:users.getPass()) 
			        {
			        	addPassenger(p);
			        }
			        Double totalprice = calTotalPrice(passengers);
			        
			        ticket=new Ticket();
			        ticket.setPassanger(users.getPass());
			        ticket.setTravel_date(users.getTravel_date());
			        ticket.setPnr(pnr);
			        ticket.setTrain(train);
			        ticketrepo.save(ticket);
			        System.out.println(passengers);
			        Path p = Paths.get("C:\\Project\\"+pnr+".txt");
			    	if (Files.exists(p))
			    	{
			    		Files.delete(p);
			    	}
			    	SimpleDateFormat DateforFile = new SimpleDateFormat("dd/MM/yyyy");
			    	String Filedate = DateforFile.format(users.getTravel_date());
			    	p = Files.createFile(p);
			    	Files.write(p,("PNR: " + pnr + "\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("Train NO: " +train.getTrain_no() +"\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("Train Name: " + train.getTrain_name().replace("\n", " ") + "\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("From: " + train.getSource() + "\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("To: " +train.getDestination() + "\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("Travel Date: " + Filedate + "\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("Passengers:\n").getBytes(),StandardOpenOption.APPEND);
			    	Files.write(p,("name"+"\t"+"\t"+"\t"+"age"+"\t"+"\t"+"gender"+"\t"+"\t"+"fare"+"\n").getBytes(),StandardOpenOption.APPEND);
			    	for(Map.Entry<Passenger,Double> e :
			    	passengers.entrySet()) 
			    	{
			    		Files.write(p,(e.getKey().getName()+"\t\t\t"+e.getKey().getAge()+"\t\t"+e.getKey().getGender()+"\t\t  "+e.getValue()+"\n").getBytes(),StandardOpenOption.APPEND);
			    	 }
			    	Files.write(p,("Total Price:"+totalprice).getBytes(),StandardOpenOption.APPEND);
			         return pnr;
			        
		}
		private Double calTotalPrice(TreeMap<Passenger, Double> passengers) 
		{
			Double total = 0.0;
			for(Map.Entry<Passenger,Double> e:
				passengers.entrySet()) 
			{
				total=total+e.getValue();
			}
			
			return total;
		}
		public Double calculateFare(Passenger pass) 
		{
			
			 if (pass.getAge() <= 12)
		        {
		            return train.getTicketPrice() * 0.5;
		        }
		        if (pass.getAge() >= 60)
		        {
		            return train.getTicketPrice() *0.6;
		        }
		        if (pass.getGender() == 'F' || pass.getGender() =='f')
		        {
		            return train.getTicketPrice() * 0.75;
		        } else{
		            return train.getTicketPrice();
		        }

	    }
		public void addPassenger(Passenger pass)
		{
	        passengers.put(pass,calculateFare(pass));
	    }
		
		
			
}
