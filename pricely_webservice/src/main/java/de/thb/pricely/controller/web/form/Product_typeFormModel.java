package de.thb.pricely.controller.web.form;
/*
 * Form Model: Product Type
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

public class Product_typeFormModel {
    @NotEmpty
    @NotNull
    private String name;
    private String url;
    private String description;
    private float cheapest;
}
