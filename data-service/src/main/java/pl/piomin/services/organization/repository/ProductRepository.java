package pl.piomin.services.organization.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.piomin.services.organization.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
