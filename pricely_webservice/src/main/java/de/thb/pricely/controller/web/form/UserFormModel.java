package de.thb.pricely.controller.web.form;
/*
 * Form Model: User
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
public class UserFormModel {
    @NotEmpty
    @NotNull
    private String email;
    @NotEmpty
    @NotNull
    private String password;

    private boolean enabled;
}
