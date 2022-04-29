package de.thb.pricely.security.authority;
/*
 * From: Example Spring Boot Authentication by Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import org.springframework.security.core.GrantedAuthority;

public class UserAuthority implements GrantedAuthority {

    public final static String ROLE_USER = "ROLE_USER";

    @Override
    public String getAuthority() {
        return ROLE_USER;
    }

}
