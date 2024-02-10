package com.example.pidev.Service;

import com.example.pidev.DTO.SignupRequest;
import com.example.pidev.DTO.UserDTO;

public interface AuthService {

    UserDTO CreateConsumer(SignupRequest signupRequest);
    Boolean hasCustomerwithEmail(String email);
}
