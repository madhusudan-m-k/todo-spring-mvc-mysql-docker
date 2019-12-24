/**
 * Security config class.
 */

package com.docker.todo.webapp.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Spring Security config class.
 * 
 * @author satya
 *
 */
@Configuration
@EnableWebSecurity
public class TodoSecurityConfig extends WebSecurityConfigurerAdapter {

    public TodoSecurityConfig() {

    }

    /**
     * global security method.
     * 
     * @param auth - authentication adapter.
     * @throws Exception - throws auth expection
     */
    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("todouser").password("{noop}dummy").roles("USER", "ADMIN");
        /*
         * and(). withUser("admin"). password("admin"). roles("USER", "ADMIN");
         */
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/login", "/h2-console/**").permitAll().antMatchers("/", "/*todo*/**")
                .access("hasRole('USER')").and().formLogin();
        http.csrf().disable();
        http.headers().frameOptions().disable();
    }
}
