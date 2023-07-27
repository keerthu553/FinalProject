package org.verizon.CommunicationService.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.verizon.CommunicationService.model.Catalog;

@Repository
public interface CatalogRepo extends JpaRepository<Catalog,Integer> {

}
