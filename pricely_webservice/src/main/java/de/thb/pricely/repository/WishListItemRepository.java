package de.thb.pricely.repository;
/*
 * Repository: Wish List Item
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Repository Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.WishlistItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = WishlistItem.class, idClass = Long.class)
public interface WishListItemRepository extends CrudRepository<WishlistItem, Long> {

       List<WishlistItem> findAllByUserId(Long userId);
}
