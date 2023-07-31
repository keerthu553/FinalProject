package org.verizon.CommunicationService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationService.model.Catalog;
import org.verizon.CommunicationService.repo.CatalogRepo;

@Service
public class CatalogService {
	
	private final CatalogRepo catalogrepo;
	@Autowired
	public CatalogService(CatalogRepo catalogrepo) {
	
		this.catalogrepo = catalogrepo;
	}
	
	public List<Catalog> getAllCatalog(){
		return catalogrepo.findAll();
		
	}
	
	public Catalog getCatalogById(Integer id) {
		return catalogrepo.findById(id).orElse(null);
	}
	
	public Catalog createCatalog (Catalog catalog) { 
		return catalogrepo.save(catalog); 
		} 
		
	public Catalog updateCatalog(Integer id,Catalog catalog) { 
		Catalog existingCatalog=catalogrepo.findById(id).orElse(null); 
		if(existingCatalog!=null) { 
		existingCatalog.setPlans(catalog.getPlans());
		existingCatalog.setPrice(catalog.getPrice());
		existingCatalog.setValidity(catalog.getValidity());
		return catalogrepo.save(existingCatalog); 
		}
		return null; 
		}
	
	public void deleteCatalog(Integer id) {
		catalogrepo.deleteById(id);
	}
}
