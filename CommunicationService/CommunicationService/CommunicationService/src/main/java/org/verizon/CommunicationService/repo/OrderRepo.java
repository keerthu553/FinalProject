package org.verizon.CommunicationService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CommunicationService.model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders,Integer> {

}
