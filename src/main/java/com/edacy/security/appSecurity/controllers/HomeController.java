package com.edacy.security.appSecurity.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by macbookpro on 10/24/18.
 */

@RestController
@RequestMapping("/hello")
public class HomeController {

    @GetMapping
    public ResponseEntity<String> hello(){

        return new ResponseEntity<String>(" Hello Edacy", HttpStatus.OK);
        
    }
}
