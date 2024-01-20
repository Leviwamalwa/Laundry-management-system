package com.example.LaundryManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value="/offeredservices")
public class OfferedServicesController {
@Autowired
OfferedServicesRepository repo;
@GetMapping("/offeredservices")
public String offeredservices() {
	return "services";
}
@GetMapping("/offeredservices/deleteservices")
public String deleteservices() {
	return "deleteservices";
}
@GetMapping("/offeredservices/updateservices")
public String updateservices() {
	return "updateservices";
}
@PostMapping("/offeredservices")
@ResponseBody
public OfferedServices postservices( OfferedServices offeredservices) {
	repo.save(offeredservices);
	return offeredservices;
}
@GetMapping("/offeredservices/viewservices")
@ResponseBody
public List<OfferedServices> viewservices(OfferedServices offeredservices) {
	return repo.findAll();
}
@DeleteMapping(value="/offeredservices/deleteservices/{serviceId}" )
public OfferedServices deleteservicesbyId(@RequestParam int serviceId) {
	if(repo.findById(serviceId)==null) {
		System.out.println("The service does not exist.");
	}
	@SuppressWarnings("deprecation")
	OfferedServices offeredservices=repo.getById(serviceId);
	repo.delete(offeredservices);
	return offeredservices;
}
@PutMapping(path="/offeredservices/updateservices",consumes= {"application/json"})
public OfferedServices updateservices(@RequestBody OfferedServices offeredservices) {
	repo.save(offeredservices);
	return offeredservices;
}

}
