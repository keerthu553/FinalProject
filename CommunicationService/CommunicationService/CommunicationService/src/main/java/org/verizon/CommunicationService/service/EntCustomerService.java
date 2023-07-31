package org.verizon.CommunicationService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationService.model.EntCustomer;
import org.verizon.CommunicationService.repo.EntCustomerRepo;

@Service
public class EntCustomerService {
	private final EntCustomerRepo entcustomerrepo;
	@Autowired
	public EntCustomerService(EntCustomerRepo entcustomerrepo) {
		this.entcustomerrepo = entcustomerrepo;
	}
	
	public List<EntCustomer> getAllEntCustomer(){
		return entcustomerrepo.findAll();
		
	}
	
	public EntCustomer getEntCustomerById(Integer id) {
		return entcustomerrepo.findById(id).orElse(null);
	}
	
	public EntCustomer createEntCustomer (EntCustomer entcustomer) { 
		return entcustomerrepo.save(entcustomer); 
		} 
	
	public void deleteEntCustomer(Integer id) {
		entcustomerrepo.deleteById(id);
	}
	
	

}
