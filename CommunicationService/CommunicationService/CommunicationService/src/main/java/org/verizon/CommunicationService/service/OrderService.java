package org.verizon.CommunicationService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.verizon.CommunicationService.model.Orders;
import org.verizon.CommunicationService.repo.OrderRepo;

@Service
public class OrderService {
	private final OrderRepo orderrepo;
	@Autowired
	public OrderService(OrderRepo orderrepo) {
	
		this.orderrepo = orderrepo;
	}
	
	public List<Orders> getAllOrder(){
		return orderrepo.findAll();
		
	}
	
	public Orders getOrderById(Integer id) {
		return orderrepo.findById(id).orElse(null);
	}
	
	public Orders createOrder (Orders order) { 
		return orderrepo.save(order); 
		} 
		
	public Orders updateOrder(Integer id,Orders order) { 
		Orders existingOrder=orderrepo.findById(id).orElse(null); 
		if(existingOrder!=null) { 
		existingOrder.setPlan_id(order.getPlan_id());
		return orderrepo.save(existingOrder); 
		}
		return null; 
		}
	
	public void deleteOrder(Integer id) {
		orderrepo.deleteById(id);
	}

}
