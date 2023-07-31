package org.verizon.CommunicationService.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationService.model.Customer;
import org.verizon.CommunicationService.service.CustomerService;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {
	private CustomerService customerservice;
	@Autowired
	public CustomerController(CustomerService customerservice) {
		this.customerservice = customerservice;
	}
	
	@RequestMapping("/allcustomer")
	public List<Customer>getAllCustomer(){
		return customerservice.getAllCustomer();
	}

	@PostMapping("/insert")
	public Customer createCustomer(@RequestBody Customer customer ) {
		return customerservice.createCustomer(customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer( @PathVariable int id) {
		customerservice.deleteCustomer(id);
	}

	

}
