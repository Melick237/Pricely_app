package de.thb.pricely.products.services;

import de.thb.pricely.products.entities.Category;
import de.thb.pricely.products.entities.Product;
import de.thb.pricely.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsWithCategory(Category category){
        return productRepository.findAllByCategoryEqualsOrderByPriceAsc(category);
    }

    public void save(Product product){
        if(product == null) throw new NullPointerException("Product should not be null");
        productRepository.save(product);
    }

    public Optional<Product> getProduct(Long id){
        if(id == null) throw new NullPointerException("id should not be null");
        return productRepository.findById(id);
    }

    public void deleteProduct(Long id){
        if(id == null) throw new NullPointerException("id should not be null");
        productRepository.deleteById(id);
    }
}
