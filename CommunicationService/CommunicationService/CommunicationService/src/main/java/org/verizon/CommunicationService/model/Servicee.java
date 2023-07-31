package org.verizon.CommunicationService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Servicee {
	@Id
	private int service_id;
	private String provision;
	private String test_qos;
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Catalog catalog;
	private String activity;
	
	public Servicee() {
	
	}

	public int getService_id() {
		return service_id;
	}

	public void setService_id(int service_id) {
		this.service_id = service_id;
	}

	public String getProvision() {
		return provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

	public String getTest_qos() {
		return test_qos;
	}

	public void setTest_qos(String test_qos) {
		this.test_qos = test_qos;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	
	
	
	

}
