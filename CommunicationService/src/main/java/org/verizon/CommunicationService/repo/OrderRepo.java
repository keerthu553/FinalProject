package org.verizon.CommunicationService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.verizon.CommunicationService.model.Orders;

public interface OrderRepo extends JpaRepository<Orders,Integer> {

}
