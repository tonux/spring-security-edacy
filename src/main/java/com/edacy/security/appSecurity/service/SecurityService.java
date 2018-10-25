package com.edacy.security.appSecurity.service;

import com.edacy.security.appSecurity.models.User;
import com.edacy.security.appSecurity.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by macbookpro on 10/24/18.
 */

@Service
public class SecurityService implements UserDetailsService {


    private final UserRepo userRepo;


    @Autowired
    public SecurityService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Objects.requireNonNull(username);
        User user = userRepo.findByName(username).get();

        return user;
    }
}
