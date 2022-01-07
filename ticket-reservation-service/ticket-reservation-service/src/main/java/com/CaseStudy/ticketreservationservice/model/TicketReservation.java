package com.CaseStudy.ticketreservationservice.model;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Reserve")
public class TicketReservation 
{
	
	@Id 
	public String id;
	public int noOfTickets;
	private int adults;
	private int age;
	private int childrens;
	private String startStation;
	private String endStation;
	public TicketReservation(String id, int noOfTickets, int adults, int age, int childrens, String startStation,
			String endStation) {
		super();
		this.id = id;
		this.noOfTickets = noOfTickets;
		this.adults = adults;
		this.age = age;
		this.childrens = childrens;
		this.startStation = startStation;
		this.endStation = endStation;
	}
	public TicketReservation() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getChildrens() {
		return childrens;
	}
	public void setChildrens(int childrens) {
		this.childrens = childrens;
	}
	public String getStartStation() {
		return startStation;
	}
	public void setStartStation(String startStation) {
		this.startStation = startStation;
	}
	public String getEndStation() {
		return endStation;
	}
	public void setEndStation(String endStation) {
		this.endStation = endStation;
	}
	
	@Override
	public String toString() {
		return "TicketReservation [id=" + id + ", noOfTickets=" + noOfTickets + ", adults=" + adults + ", age=" + age
				+ ", childrens=" + childrens + ", startStation=" + startStation + ", endStation=" + endStation + "]";
	}
	
	
	
    
//	public Collection<Trains> train;
//	public TicketReservation(String id, String noOfTickets, Collection<Trains> train) {
//		super();
//		this.id = id;
//		this.noOfTickets = noOfTickets;
//		this.train = train;
//	}
//	public TicketReservation() {
//		
//	}
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getNoOfTickets() {
//		return noOfTickets;
//	}
//	public void setNoOfTickets(String noOfTickets) {
//		this.noOfTickets = noOfTickets;
//	}
//	public Collection<Trains> getTrain() {
//		return train;
//	}
//	public void setTrain(Collection<Trains> train) {
//		this.train = train;
//	}
//	@Override
//	public String toString() {
//		return "TicketReservation [id=" + id + ", noOfTickets=" + noOfTickets + ", train=" + train + "]";
//	}
//	
//	
//	
}
