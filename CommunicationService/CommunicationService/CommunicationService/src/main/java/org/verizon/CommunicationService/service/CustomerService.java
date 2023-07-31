package org.verizon.CommunicationService.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationService.model.Customer;
import org.verizon.CommunicationService.repo.CustomerRepo;

@Service
public class CustomerService {
	private final CustomerRepo customerrepo;
	@Autowired
	public CustomerService(CustomerRepo customerrepo) {
		this.customerrepo = customerrepo;
	}
	
	public List<Customer> getAllCustomer(){
		return customerrepo.findAll();
		
	}
	
	public Customer getCustomerById(Integer id) {
		return customerrepo.findById(id).orElse(null);
	}
	
	public Customer createCustomer (Customer customer) { 
		return customerrepo.save(customer); 
		} 
	
	public void deleteCustomer(Integer id) {
		customerrepo.deleteById(id);
	}
	
}
