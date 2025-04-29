package com.orders.system.authentication.auth_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orders.system.authentication.auth_api.dto.LoginRequestDTO;
import com.orders.system.authentication.auth_api.dto.RegisterRequestDTO;



@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequest) {
        return ResponseEntity.ok("Bem vindo $s e senha $s".formatted(loginRequest.userName(), loginRequest.password()));
    }

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody RegisterRequestDTO registerRequest) {
        var request = registerRequest.toString();
        var message = "Usuario $s cadastrado com sucesso: %s".formatted(registerRequest.userName(), request);
        return ResponseEntity.status(201).body(message); 
    }
    
}
