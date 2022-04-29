package de.thb.pricely.entity;
/*
 * Entity: Product Type
 * Autor: Chin-Wen,Kao
 * Datum: 18.01.2022
 * Reference: Example Entity Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "product_type")
public class Product_type {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private String name;
    private String photourl;
    private String description;
    private float cheapest;
    @ManyToOne
    private Category category;
    @OneToMany(mappedBy = "product_type", fetch = FetchType.EAGER)
    private List<Product> product;
}
