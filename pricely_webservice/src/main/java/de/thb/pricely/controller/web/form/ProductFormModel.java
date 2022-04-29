package de.thb.pricely.controller.web.form;
/*
 * Form Model: Product
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Form Model Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductFormModel {
    @NotEmpty
    @NotNull
    private String name;
    private String description;
    private String photourl;
    private String link;
    private int available;
    private int rating;
    private float price;
    private float weight;
}
