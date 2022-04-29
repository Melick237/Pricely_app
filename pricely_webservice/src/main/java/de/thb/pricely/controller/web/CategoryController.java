package de.thb.pricely.controller.web;
/*
 * Controller: Category
 * Autor: Chin-Wen,Kao
 * Datum: 18.01.2022
 * Reference: Example Controller Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.controller.web.form.CategoryFormModel;
import de.thb.pricely.entity.Category;
import de.thb.pricely.entity.Product_type;
import de.thb.pricely.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@Controller
@AllArgsConstructor
public class CategoryController {

    private final MainService mainService;

    /**
     * http://localhost:8080/categories
     */
    @GetMapping("categories")
    public String showCategories(Model model) {
        List<Category> categoryList = mainService.getAllCategories();
        model.addAttribute("categoryList", categoryList);
        return "categories";
    }

    @PostMapping("categories")
    public String addCategory(@Valid CategoryFormModel form,
                              BindingResult result) {

        mainService.addCategory(form.getName(),
                form.getDescription());

        return "redirect:/categories";
    }

    /**
     * http://localhost:8080/categories/42
     */
    @GetMapping("categories/{id}")
    public String showCategoryDetails(@PathVariable("id") Long id,
                                      Model model) {

        Category category = mainService.getCategoryById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        model.addAttribute("category", category);


       List<Product_type>  product_types = mainService.getAllByCategoryId(id);


        //add path
        String productPath = "";
        if(product_types.size() > 0 ) {
            productPath = product_types.get(0).getCategory().getName();
        }

        model.addAttribute("product_types", product_types);
        model.addAttribute("product_path", productPath);
        return "product_types";
    }




}
