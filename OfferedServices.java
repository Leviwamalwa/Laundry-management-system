package com.example.LaundryManagementSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="offeredservices")
public class OfferedServices {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int serviceId;
	@Column(nullable=false,length=30,unique=true)
private String servicename;
	@Column(nullable=false)
private double cost;
public int getServiceId() {
	return serviceId;
}
public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}
public String getServicename() {
	return servicename;
}
public void setServicename(String servicename) {
	this.servicename = servicename;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "OfferedServices [serviceId=" + serviceId + ", servicename=" + servicename + ", cost=" + cost + "]";
}
}
