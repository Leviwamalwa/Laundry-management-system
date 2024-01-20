package com.example.LaundryManagementSystem;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="notification")
public class Notification {
	@Column(nullable=false,length=255)
private String messagebody;
	@Id
	@Column(nullable=false)
private Date date;
@Column(nullable=false)
private String PhoneNumber;
public String getMessagebody() {
	return messagebody;
}
public void setMessagebody(String messagebody) {
	this.messagebody = messagebody;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
@Override
public String toString() {
	return "notification [messagebody=" + messagebody + ", date=" + date + ", PhoneNumber=" + PhoneNumber + "]";
}
}
