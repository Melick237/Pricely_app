package de.thb.pricely.controller.web;
/*
 * Controller: Wish List
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Controller Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.User;
import de.thb.pricely.entity.WishlistItem;

import de.thb.pricely.service.MainService;
import de.thb.pricely.service.WishListService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@Controller
@AllArgsConstructor
public class WishListItemController {

    @Autowired
    private WishListService wishListService;

    @Autowired
    private MainService deskService;

    /*
    * Show the wish list from a user
    * */
    @GetMapping("/view_list")
    public String viewList(Model model, Principal principal) {
        //Get the user, which is logged in now
        User user = deskService.findByEmail(principal.getName()).get();
        List<WishlistItem> wishList = user.getWishlistItems();

        model.addAttribute("wishList", wishList);
        return "view_list";
    }

    /*
     * Delete all items in the wish list from a user
     * */
    @RequestMapping("/empty-list")
    public String emptyList(Model model, Principal principal) {
        model.addAttribute("classActiveViewCart", "home active");
        //Get the user, which is logged in now
        User user = deskService.findByEmail(principal.getName()).get();
        //Delete all items in wish list
        wishListService.emptyWishList(user);
        model.addAttribute("wishList", user.getWishlistItems());

        return "redirect:/view_list?emptyList";
    }

    /*
     * Add an item in the wish list from a user
     * */
    @RequestMapping("/add-to-list/{id}")
    public String addToList(
            @PathVariable("id") Long id
            , Principal principal) {
        //Get the user, which is logged in now
        User user = deskService.findByEmail(principal.getName()).get();

        WishlistItem wishlistItem = new WishlistItem();
        wishlistItem.setProduct(deskService.getProductById(id).get());
        wishlistItem.setUser(user);
        //Add item to the wish list
        wishListService.createWishlist(wishlistItem);

        return "redirect:/view_list";
    }

    /*
     * Delete one item with item id in the wish list from a user
     * */
    @RequestMapping(value="/update-list/{id}", method= RequestMethod.POST, params="action=delete")
    public String removeItem(
            @PathVariable("id") Long id
            , Principal principal) {
        //Get the user, which is logged in now
        User user = deskService.findByEmail(principal.getName()).get();
        //Remove item to the wish list
        wishListService.removeItemFromList(id, user);

        return "redirect:/view_list";
    }
}
