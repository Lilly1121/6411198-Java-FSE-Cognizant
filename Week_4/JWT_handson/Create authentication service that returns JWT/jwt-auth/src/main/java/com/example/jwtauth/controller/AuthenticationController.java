package com.example.jwtauth.controller;

import com.example.jwtauth.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> generateToken(Principal principal) {
        String token = jwtUtil.generateToken(principal.getName());
        return Map.of("token", token);
    }
}
