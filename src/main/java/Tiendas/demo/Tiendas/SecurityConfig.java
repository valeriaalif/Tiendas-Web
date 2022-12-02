/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tiendas.demo.Tiendas;

import com.proyecto_grupo_3_VEDA.proyectoGrupo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;


public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private UserService userDetailsService;
    
      @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public UserService getUserService(){
        return new UserService();
    }
    
    @Bean
    DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
        daoAuthenticationProvider.setUserDetailsService(getUserService());
        return daoAuthenticationProvider;
    }
    
    @Bean
    public AuthenticationSuccessHandler appAuthenticationSuccessHandler(){
        return new com.proyecto_grupo_3_VEDA.proyectoGrupo3.AppAuthenticationSuccessHandler();
    }
    
    //constructor
    public SecurityConfig(UserService userPrincipalDetailsService){
        this.userDetailsService = userPrincipalDetailsService;
    }
    
    @Override
    public void configure(AuthenticationManagerBuilder auth){
        auth.authenticationProvider(authenticationProvider());
    }
    
}
