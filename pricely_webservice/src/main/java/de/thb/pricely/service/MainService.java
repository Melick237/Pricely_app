package de.thb.pricely.service;
/*
 * Service: Category, Product type, Product, User
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Service Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import de.thb.pricely.entity.Category;
import de.thb.pricely.entity.Product;
import de.thb.pricely.entity.Product_type;
import de.thb.pricely.entity.User;
import de.thb.pricely.repository.CategoryRepository;
import de.thb.pricely.repository.ProductRepository;
import de.thb.pricely.repository.Product_typeRepository;
import de.thb.pricely.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MainService {

    private final CategoryRepository categoryRepository;
    private final Product_typeRepository product_typeRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }
    public Optional<Category> getCategoryById(long id) {
        return categoryRepository.findById(id);
    }

    public Category addCategory(String name, String description) {
        return categoryRepository.save(Category.builder()
                .name(name)
                .description(description)
                .build());
    }

    public List<Product_type> getAllTypes() {
        return (List<Product_type>) product_typeRepository.findAll(); }


    public Optional<Product_type> getTypeById(long id) {
        return product_typeRepository.findById(id);
    }
    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }


    public User addUser(String email, String password) {
        return userRepository.save(User.builder()
                .email(email)
                .password("{noop}"+password)
                .enabled(true)
                .build());
    }
    public Optional<User> findByEmail(String email){ return userRepository.findByEmail(email);}

    public List<Product> listAll(String keyword){
           if (keyword != null){
               return productRepository.search(keyword);
           }

           return (List<Product>)productRepository.findAll();

    }

    public List<Product_type> getAllByCategoryId(Long id)
    {
        Optional<Category> category = this.getCategoryById(id);

        return category.map(product_typeRepository::findByCategory).orElse(null);

    }

}
