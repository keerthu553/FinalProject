package org.verizon.CommunicationService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationService.model.Servicee;
import org.verizon.CommunicationService.repo.ServiceRepo;

@Service
public class ServService {
	private final ServiceRepo servicerepo;

	@Autowired
	public ServService(ServiceRepo servicerepo) {
		this.servicerepo = servicerepo;
	}
	
	public List<Servicee>getAllService(){
		return servicerepo.findAll();
	}
	
	public Servicee getServiceById(Integer id) {
		return servicerepo.findById(id).orElse(null);
	}
	
	public Servicee createService (Servicee service) {
		return servicerepo.save(service);
		}
	
	public void deleteService(Integer id) {
		servicerepo.deleteById(id);
	}
	
	
}