package de.thb.pricely.controller.web;
/*
 * Controller: Product Type
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Controller Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.entity.Product;
import de.thb.pricely.entity.Product_type;
import de.thb.pricely.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
@AllArgsConstructor
public class Product_typeController {
    @Autowired
    private final MainService mainService;

    /*
    * Show all product types in a category
    * */
    @GetMapping("product_types")
    public String showTypes(Model model) {
        List<Product_type> typeList =mainService.getAllTypes();
        model.addAttribute("typeList", typeList);

        return "product_types";
    }
    @GetMapping("search_result")
    public String showResult(Model model) {
        List<Product_type> typeList =mainService.getAllTypes();
        model.addAttribute("typeList", typeList);
        return "search_result";
    }
    /*
     *Product List(Products from different providers) in every Product Type, it would be sorted by price or rating
     * */
    @GetMapping("product_types/{id}")
    public String showProducts(@PathVariable("id") Long id,
                                      Model model) {

        Product_type product_type =mainService.getTypeById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        List<Product> originalList = product_type.getProduct();
        List<Product> listSortByPrice = new ArrayList<Product>();
        for(int i=0; i<originalList.size(); i++){
            listSortByPrice.add(originalList.get(i));
        }

        //Comparing and then sorting by Price
        listSortByPrice.sort(Comparator.comparing(Product::getPrice));
        model.addAttribute("listSortByPrice",listSortByPrice);
        List<Product> listSortByRating = new ArrayList<Product>();
        try{
        for (Product item : originalList) listSortByRating.add(item.clone());
        }catch(Exception e){
            System.out.println("Error"+e);
        }

        //Comparing and then sorting by Rating
        listSortByRating.sort(Comparator.comparing(Product::getRating).reversed());
        model.addAttribute("listSortByRating",listSortByRating);
        model.addAttribute("product_type", product_type);
        return "products";
    }
    /*
    *Product List as Searching Result, it would be sorted by price or rating
    * */
    @RequestMapping("search_result/")
    public String viewResult(Model model, @Param("keyword") String keyword) {
        List<Product> listProducts =mainService.listAll(keyword);

        List<Product> searchSortByPrice = new ArrayList<Product>();
        for(int i=0; i<listProducts.size(); i++){
            searchSortByPrice.add(listProducts.get(i));
        }

        //Comparing and then sorting by Price
        searchSortByPrice.sort(Comparator.comparing(Product::getPrice));
        model.addAttribute("searchSortByPrice",searchSortByPrice);
        List<Product> searchSortByRating = new ArrayList<Product>();
        try{
            for (Product item : listProducts) searchSortByRating.add(item.clone());
        }catch(Exception e){
            System.out.println("Error"+e);
        }
        //Comparing and then sorting by Rating
        searchSortByRating.sort(Comparator.comparing(Product::getRating).reversed());
        model.addAttribute("searchSortByRating",searchSortByRating);

        model.addAttribute("listProducts", listProducts);
        model.addAttribute("keyword", keyword);
        return "search_result";

    }



}
