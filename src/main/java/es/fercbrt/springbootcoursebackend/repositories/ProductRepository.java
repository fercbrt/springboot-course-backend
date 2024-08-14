package es.fercbrt.springbootcoursebackend.repositories;

import es.fercbrt.springbootcoursebackend.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long>{
}
