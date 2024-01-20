package com.example.LaundryManagementSystem;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrdersController {
@Autowired
OrdersRepository ordersRepo;

@GetMapping("/")
public String orders() {
	return "orders";
}
@GetMapping("vieworders")
public String vieworders() {
	return "vieworders";
}
@GetMapping("deleteorders")
public String deleteorders() {
	return "deleteorders";
}
@GetMapping("updateorders")
public String updateOrders() {
	return "updateorders";
}
@GetMapping("viewordersbylocation")
public String viewordersbylocation() {
	return "viewordersbylocation";
}
@PostMapping(path="/" )
@ResponseBody
public Orders saveOrders( Orders orders) {
	 ordersRepo.save(orders);
	 return orders;
	
}
@GetMapping(path="/allorders")
@ResponseBody
public List<Orders> getallorders() {
	return ordersRepo.findAll();
}
@GetMapping(path="/vieworders/{orderdate}")
@ResponseBody
public List<Orders> findOrdersByOrderdate(Date orderdate) {
	return ordersRepo.findOrdersByorderdate(orderdate);
}
@GetMapping(path="/viewordersbylocation/{location}")
@ResponseBody
public List<Orders> findOrdersByLocation(String location){
	return ordersRepo.findOrdersByLocation(location);
}

@DeleteMapping(path="/deleteorders/{ordernumber}")
@ResponseBody
public Orders deleteOrders(@PathVariable int ordernumber) {
	Orders orders=ordersRepo.getReferenceById(ordernumber);
	ordersRepo.delete(orders);
	return orders;
}
@PutMapping(path="/orders")
public Orders updateOrders(@RequestBody Orders orders) {
	ordersRepo.save(orders);
	return orders;
}

}
