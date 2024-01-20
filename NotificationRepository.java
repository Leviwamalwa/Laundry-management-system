package com.example.LaundryManagementSystem;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Date> {

}
