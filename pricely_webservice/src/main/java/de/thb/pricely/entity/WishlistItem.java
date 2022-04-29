package de.thb.pricely.entity;
/*
 * Entity: Wish List Item
 * Autor: Chin-Wen,Kao
 * Datum: 18.01.2022
 * Reference: Example Entity Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "wishlist_item")
public class WishlistItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private User user;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
}
