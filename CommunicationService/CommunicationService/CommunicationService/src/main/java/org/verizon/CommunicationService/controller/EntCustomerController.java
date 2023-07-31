package org.verizon.CommunicationService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationService.model.EntCustomer;
import org.verizon.CommunicationService.service.EntCustomerService;

@RestController
@RequestMapping("/api/EntCustomer")
public class EntCustomerController {
	private EntCustomerService entcustomerservice;
	@Autowired
	public EntCustomerController(EntCustomerService entcustomerservice) {
		this.entcustomerservice = entcustomerservice;
	}
	
	@RequestMapping("/allentcustomer")
	public List<EntCustomer>getAllEntCustomer(){
		return entcustomerservice.getAllEntCustomer();
	}

	@PostMapping("/insert")
	public EntCustomer createEntCustomer(@RequestBody EntCustomer entcustomer ) {
		return entcustomerservice.createEntCustomer(entcustomer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEntCustomer( @PathVariable int id) {
	}
	
	

}
