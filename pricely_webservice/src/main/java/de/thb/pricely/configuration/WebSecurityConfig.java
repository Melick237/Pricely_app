package de.thb.pricely.configuration;
/*
 * From: Example Spring Boot Authentication by Ilonka Wolpert M.Sc. / Dipl-Inf (FH) Stefan Pratsch M.Sc.
 * */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private UserDetailsService userDetailsService;
    
    @Override
    protected UserDetailsService userDetailsService() {
        return userDetailsService;
    }
    
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//Only the add items to wish list function need to log in first!
		http
			.authorizeRequests()
				.antMatchers("/css/**", "/webjars/**", "/bootstrap/**", "/js/**", "/img/**", "/favicon.ico", "/lib/**","/register").permitAll()
				.antMatchers("/", "/index","/about","/categories/**","/contact","/product_types/**","/products/**","/registration","/search_result/**").permitAll()
				.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.permitAll()
				.defaultSuccessUrl("/")
			.and()
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/").permitAll();

	}

}
