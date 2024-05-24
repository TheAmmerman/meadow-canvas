package com.techelevator.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/private")
@CrossOrigin
@PreAuthorize("isAuthenticated()")
public class PrivateController {

    @GetMapping("/hello")
    public String getHelloMessage(Principal principal) {
        return "Hello, " + principal.getName() + " !";
    }
}
