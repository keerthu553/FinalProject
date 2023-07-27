package org.verizon.CommunicationService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.verizon.CommunicationService.model.Catalog;
import org.verizon.CommunicationService.service.CatalogService;

@RestController
@RequestMapping("/api/Catalog")
public class CatalogController {
	private CatalogService catalogservice;
	
@Autowired
	public CatalogController(CatalogService catalogservice) {
		this.catalogservice = catalogservice;
	}

@RequestMapping("/allcatalog")
public List<Catalog>getAllCatalog(){
	return catalogservice.getAllCatalog();
	
}
@PostMapping("/insert")
public Catalog createCatalog(@RequestBody Catalog catalog) {
	return catalogservice.createCatalog(catalog);
}

@PostMapping("/{id}")
public Catalog updateCatalog(@PathVariable int id, @RequestBody Catalog catalog) {
	return catalogservice.updateCatalog(id,catalog);
	
}

@DeleteMapping("{id}")
public void  deleteCatalog(@PathVariable int id) {
	 catalogservice.deleteCatalog(id);}

}
