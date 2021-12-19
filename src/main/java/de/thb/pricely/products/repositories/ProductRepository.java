package de.thb.pricely.products.repositories;

import de.thb.pricely.products.entities.Category;
import de.thb.pricely.products.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    @Override
    List<Product> findAll();

    List<Product> findAllByCategoryEqualsOrderByPriceAsc(Category category);
}
