package de.thb.pricely.configuration;
/*
 * From: Example Spring Boot Authentication by Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import de.thb.pricely.repository.UserRepository;
import de.thb.pricely.security.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfiguration {
	
	@Autowired
	private UserRepository userRepository;
	
    @Bean
    public org.springframework.security.core.userdetails.UserDetailsService userDetailsService() {
        return new MyUserDetailsService(userRepository);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
