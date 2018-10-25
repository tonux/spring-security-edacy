package com.edacy.security.appSecurity.repositories;

import com.edacy.security.appSecurity.models.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.util.Optionals;

import java.util.Optional;

/**
 * Created by macbookpro on 10/24/18.
 */
public interface UserRepo extends JpaRepository<User, Integer>{

    @Query (" select u from User u where u.username = ?1 ")
    Optional<User> findByName(String name);
}
