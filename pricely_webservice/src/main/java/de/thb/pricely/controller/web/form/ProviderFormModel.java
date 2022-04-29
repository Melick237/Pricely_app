package de.thb.pricely.controller.web.form;
/*
 * Form Model: Provider
 * Chin-Wen,Kao
 * 18.01.2022
 * Reference: Example Form Model Spring Boot Project JustNoteIt from Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProviderFormModel {
    @NotEmpty
    @NotNull
    private String name;
    @NotEmpty
    @NotNull
    private String logourl;
    @NotEmpty
    @NotNull
    private String link;
    @NotEmpty
    @NotNull
    private int rating;
}