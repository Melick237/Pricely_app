package de.thb.pricely.entity;
/*
 * Entity: Product
 * Autor: Chin-Wen,Kao
 * Datum: 18.01.2022
 * Reference: Example Entity Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String photourl;
    private String link;
    private int available;
    private int rating;
    private float price;
    private float weight;

    @ManyToOne
    private Product_type product_type;
    @ManyToOne
    private Provider provider;

    public Product clone() {
        Product newProduct = new Product();
        newProduct.setName(this.name);
        newProduct.setId(this.id);
        newProduct.setDescription(this.description);
        newProduct.setPhotourl(this.photourl);
        newProduct.setAvailable(this.available);
        newProduct.setLink(this.link);
        newProduct.setProvider(this.provider);
        newProduct.setProduct_type(this.product_type);
        newProduct.setRating(this.rating);
        newProduct.setPrice(this.price);
        newProduct.setWeight(this.weight);
        return newProduct;
    }
}
