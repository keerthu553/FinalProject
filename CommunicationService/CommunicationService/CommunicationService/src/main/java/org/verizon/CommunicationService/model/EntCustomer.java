package org.verizon.CommunicationService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EntCustomer {
	@Id
	private int ec_id;
	private String ec_name;
	@ManyToOne
	@JoinColumn(name="order_id")
	private Orders orders;
	
	public EntCustomer() {
		
	}

	public int getEc_id() {
		return ec_id;
	}

	public void setEc_id(int ec_id) {
		this.ec_id = ec_id;
	}

	public String getEc_name() {
		return ec_name;
	}

	public void setEc_name(String ec_name) {
		this.ec_name = ec_name;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
	
	

}
