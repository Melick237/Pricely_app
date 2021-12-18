package de.thb.pricely.general;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showIndexPage(){
        return "index";
    }

    @GetMapping("/about")
    public String showAboutPage(){
        return "about";
    }

    @GetMapping("/kategorie")
    public String showKategoriePage(){
        return "kategorie";
    }

    @GetMapping("/contact")
    public String showContactPage(){
        return "contact";
    }

    @GetMapping("/kategorie_list")
    public String showKategorieListPage(){
        return "kategorie_list";
    }

    @GetMapping("/product_detail")
    public String showSinglePage(){
        return "product_detail";
    }
}
