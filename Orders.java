package com.example.LaundryManagementSystem;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
private int ordernumber;
	@Column(nullable=false)
	private Date orderdate;
	@Column(nullable=false)
private String pickupdate;
	@Column(nullable=false)
private String deliverydate;

@Column(nullable=false,length=30)
private String FirstName;
@Column(nullable=false,length=30)
private String LastName;
@Column(nullable=false,unique=true)
private String PhoneNumber;

@Column(nullable=false,length=30)
private String Email;
@Column(nullable=false,length=30)
private String location;
@Column(nullable=false,length=50)
private String servicename;
public int getOrdernumber() {
	return ordernumber;
}
public void setOrdernumber(int ordernumber) {
	this.ordernumber = ordernumber;
}
public Date getOrderdate() {
	return orderdate;
}
public void setOrderdate(Date orderdate) {
	this.orderdate = orderdate;
}
public String getPickupdate() {
	return pickupdate;
}
public void setPickupdate(String pickupdate) {
	this.pickupdate = pickupdate;
}
public String getDeliverydate() {
	return deliverydate;
}
public void setDeliverydate(String deliverydate) {
	this.deliverydate = deliverydate;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getlocation() {
	return location;
}
public void setlocation(String location) {
	this.location = location;
}
public String getServicename() {
	return servicename;
}
public void setServicename(String servicename) {
	this.servicename = servicename;
}
@Override
public String toString() {
	return "orders [ordernumber=" + ordernumber + ", orderdate=" + orderdate + ", pickupdate=" + pickupdate
			+ ", deliverydate=" + deliverydate + ", FirstName=" + FirstName + ", LastName=" + LastName
			+ ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", location=" + location + ", servicename="
			+ servicename + "]";
}
}
