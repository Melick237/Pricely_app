package de.thb.pricely.repository;
/*
 * Repository: Category
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Repository Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;


@RepositoryDefinition(domainClass = Category.class, idClass = Long.class)
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
