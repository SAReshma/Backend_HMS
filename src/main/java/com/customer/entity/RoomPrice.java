package com.customer.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class RoomPrice {
	@Id	
	private String generatedPriceID;
	@Column(length=30)
	private double price;
	@Column(length=30)
	private LocalDateTime startDate;
	@Column(length=30)
	private LocalDateTime endDate;
	@ManyToOne(cascade=CascadeType.ALL)
	private Rooms rooms;
	private String roomNumber;
	
	public RoomPrice(String generatedPriceID, double price, LocalDateTime startDate, LocalDateTime endDate,
			Rooms rooms) {
		super();
		this.generatedPriceID = generatedPriceID;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rooms = rooms;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Rooms getRooms() {
		return rooms;
	}
	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}
	public String getGeneratedPriceID() {
		return generatedPriceID;
	}
	public void setGeneratedPriceID(String generatedPriceID) {
		this.generatedPriceID = generatedPriceID;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public RoomPrice(String generatedPriceID, double price, LocalDateTime startDate, LocalDateTime endDate,String roomNumber) {
		super();
		this.generatedPriceID = generatedPriceID;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.roomNumber=roomNumber;
	}
	public RoomPrice() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RoomPrice [generatedPriceID=" + generatedPriceID + ", price=" + price + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", rooms=" + rooms + ", roomNumber=" + roomNumber + "]";
	}
	
}
