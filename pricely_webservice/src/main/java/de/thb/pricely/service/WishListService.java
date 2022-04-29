package de.thb.pricely.service;
/*
 * Service: Wish List
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Service Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.User;
import de.thb.pricely.entity.WishlistItem;
import de.thb.pricely.repository.WishListItemRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WishListService {
    private final WishListItemRepository wishListItemRepository;

    public WishListService(WishListItemRepository wishListItemRepository) {
        this.wishListItemRepository = wishListItemRepository;
    }

    //Create the wish list
    public void createWishlist(WishlistItem wishListItem) {
        wishListItemRepository.save(wishListItem);
    }

    //Read the wish list by user id
    public List<WishlistItem> readWishList(Long userId) {
        return wishListItemRepository.findAllByUserId(userId);
    }

    //Remove a item by item id from the wish list by user id
    public  List<WishlistItem> removeItemFromList(Long itemID, User user){

        List<WishlistItem> items = readWishList(user.getId());

        wishListItemRepository.saveAll(items);

        wishListItemRepository.deleteById(itemID);

        return items;
    }

    //Delete all items in the wish list
    public void emptyWishList(User user) {
        if(user == null || user.getWishlistItems()==null) return;

        wishListItemRepository.deleteAll(user.getWishlistItems());
    }
}
