package de.thb.pricely.security;
/*
 * From: Example Spring Boot Authentication by Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */

import de.thb.pricely.repository.UserRepository;
import de.thb.pricely.security.authority.UserAuthority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


import java.util.List;

@AllArgsConstructor
public class MyUserDetailsService implements UserDetailsService {
	
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	
    	MyUserDetails myUserDetails = userRepository.findByEmail(username)
    			.map(user -> {
    				return MyUserDetails.builder()
    						.username(user.getEmail())
    	                    .password(user.getPassword())
    	                    .authorities(List.of(new UserAuthority()))
    	                    .enabled(user.isEnabled())
    	                    .accountNonExpired(true)
    	                    .accountNonLocked(true)
    	                    .credentialsNonExpired(true)
    						.build();
    			})
    			.orElseThrow(() -> new UsernameNotFoundException("User not found!"));
    	
    	return myUserDetails;
    }
}
