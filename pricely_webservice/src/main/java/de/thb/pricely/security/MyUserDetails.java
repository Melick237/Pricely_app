package de.thb.pricely.security;
/*
 * From: Example Spring Boot Authentication by Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Value
@Builder(toBuilder = true)
@ToString
@AllArgsConstructor
public class MyUserDetails implements UserDetails {
	private final String username;
	@ToString.Exclude
	private final String password;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;
	private final Collection<? extends GrantedAuthority> authorities;
}
