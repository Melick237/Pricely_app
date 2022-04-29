package de.thb.pricely.repository;
/*
 * Repository: Product Type
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Repository Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.Category;
import de.thb.pricely.entity.Product_type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;


@RepositoryDefinition(domainClass = Product_type.class, idClass = Long.class)
public interface Product_typeRepository extends CrudRepository<Product_type, Long> {
    List<Product_type> findByCategory(Category category);
}
