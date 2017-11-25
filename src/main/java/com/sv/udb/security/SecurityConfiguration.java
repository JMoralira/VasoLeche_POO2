package com.sv.udb.security;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired 
	DataSource datasource;
	
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(datasource)
		.usersByUsernameQuery("select nomb_usua, cont_usua, esta_usua from usuarios where nomb_usua = ?")
		.authoritiesByUsernameQuery("select nomb_usua, nomb_perm from usuarios, asignaciones, permisos where permisos.codi_perm=asignaciones.codi_perm and asignaciones.codi_usua = usuarios.codi_usua and usuarios.nomb_usua= ?");
		  System.out.println("ESTA DONDE SE HACEN LAS CONSULTAS");
	}
     
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.authorizeRequests()
        .antMatchers("/", "/home/").permitAll()
        .antMatchers("/permisos/**").access("hasRole('ROLE_ADMIN')")
        .antMatchers("/lotes/**").access("hasRole('	') or hasRole('ROLE_ADMIN')")
        .antMatchers("/entregas/**").access("hasRole('ROLE_GESTOR') or hasRole('ROLE_ADMIN')")
        .antMatchers("/escuelas/**").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_EDITOR')")
        .antMatchers("/asignaciones/**").access("hasRole('ROLE_ADMIN')")
        .antMatchers("/departamentos/**").access("hasRole('ROLE_EDITOR') or hasRole('ROLE_ADMIN')")
        .antMatchers("/usuarios/**").access("hasRole('ROLE_ADMIN')")
        .and().formLogin().loginPage("/home/login")
        .usernameParameter("nomb_usua").passwordParameter("cont_usua")
        .and().csrf()
        .and().exceptionHandling().accessDeniedPage("/home/denegado");
    }
}

