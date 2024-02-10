package com.example.pidev.Controller;

import com.example.pidev.DTO.SignupRequest;
import com.example.pidev.DTO.UserDTO;
import com.example.pidev.Service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer (@RequestBody SignupRequest signupRequest) {
        if (authService.hasCustomerwithEmail(signupRequest.getEmail()))
            return new ResponseEntity<>( "Customer already exist with this email", HttpStatus. NOT_ACCEPTABLE);
        UserDTO createdCustomerDto = authService.CreateConsumer (signupRequest);
        if (createdCustomerDto== null) return new ResponseEntity<>( "Customer not created, Come again later", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<> (createdCustomerDto, HttpStatus.CREATED);
    }

}
