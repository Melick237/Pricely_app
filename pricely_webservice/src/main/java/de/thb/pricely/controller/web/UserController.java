package de.thb.pricely.controller.web;
/*
 * Controller: User
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Controller Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import de.thb.pricely.entity.User;
import de.thb.pricely.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;


@Controller
public class UserController {

    @Autowired
    private MainService customerService;
    /*
    * Registration Form
    * */
    @GetMapping("/registration")
    public String register(Model model) {
        model.addAttribute("classActiveMyAccount", "home active");

        User user = new User();
        model.addAttribute("user", user);

        return "/registration";
    }

    /*
     * Create new User with Email address and password
     * */
    @PostMapping("/registration")
    public String registerUserAccount(@Valid @ModelAttribute("user") User user, BindingResult result, HttpServletRequest request, Model model) {
        model.addAttribute("classActiveMyAccount", "home active");

        model.addAttribute("user", user);

        //Check if the email is already registered by finding user with email in DB
        User customerExists = customerService.findByEmail(user.getEmail()).orElse(null);

        System.out.println("customerExists-->"+customerExists);

        if (customerExists != null) {
            return "redirect:/registration?email";
        }
        if(result.hasErrors()){
            return "/registration";
        }

        customerService.addUser(user.getEmail(),user.getPassword());

        return "redirect:/registration?success";
    }
}
