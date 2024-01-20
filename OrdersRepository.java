package com.example.LaundryManagementSystem;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,Integer> {

	List<Orders> findOrdersByorderdate(Date orderdate);

	List<Orders> findOrdersByLocation(String location);


	

}
