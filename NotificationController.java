package com.example.LaundryManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value="/notification")
public class NotificationController {
@Autowired
NotificationRepository notificationRepo;
@GetMapping("/notification")
public String notification() {
	return "notification";
}
}
