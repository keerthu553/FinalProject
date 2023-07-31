package org.verizon.CommunicationService.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CommunicationService.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
