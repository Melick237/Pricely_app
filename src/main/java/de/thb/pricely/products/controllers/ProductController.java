package de.thb.pricely.products.controllers;

import de.thb.pricely.products.entities.Category;
import de.thb.pricely.products.entities.Product;
import de.thb.pricely.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/kategorie")
    public String showKategoriePage(Model model){
        model.addAttribute("categories", Category.values());
        return "kategorie";
    }

    @GetMapping("/productList/{categoryName}")
    public String showKategorieListPage(@PathVariable String categoryName, Model model){

        Category category = Category.getCategory(categoryName);
        List<Product> products = productService.getProductsWithCategory(category);
        model.addAttribute("products", products);
        model.addAttribute("category", categoryName);
        return "productList";
    }

    @GetMapping("/product_detail")
    public String showSinglePage(){
        return "product_detail";
    }
}
