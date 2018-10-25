package com.edacy.security.appSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by macbookpro on 10/24/18.
 */
public class SunuAppProvider extends DaoAuthenticationProvider {

    @Autowired
    private SecurityService securityService;

    public Authentication authenticate(Authentication authentication) {

        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;


        String name = auth.getName();
        String password = auth.getCredentials()
                .toString();

        UserDetails user = securityService.loadUserByUsername(name);

        if(user == null){
            //faire un truc ici

            throw  new BadCredentialsException("User and password dont match");
        }

        return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
    }

}
