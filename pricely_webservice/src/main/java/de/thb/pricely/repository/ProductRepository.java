package de.thb.pricely.repository;
/*
 * Repository: Product
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Repository Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = Product.class, idClass = Long.class)
public interface ProductRepository extends CrudRepository<Product, Long> {

       @Query("SELECT p FROM product p WHERE CONCAT(p.name, ' ') LIKE %?1%")
       public List<Product> search(String keyword);

}
