package pl.piomin.services.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piomin.services.department.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
