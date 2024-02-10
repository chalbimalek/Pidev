package com.example.pidev.Service;

import com.example.pidev.DTO.SignupRequest;
import com.example.pidev.DTO.UserDTO;
import com.example.pidev.Entity.User;
import com.example.pidev.Repository.UserRepository;
import com.example.pidev.enums.UserRole;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceIMP implements AuthService {
    private final UserRepository userRepository;
@Transactional
    @Override
    public UserDTO CreateConsumer(SignupRequest signupRequest) {

        User user = new User();
        user.setName (signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword (signupRequest.getPassword());
        user.setUserRole (UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);
        UserDTO userDto = new UserDTO();
        userDto.setId(createdUser.getId());
        return userDto;
    }

    @Override
    public Boolean hasCustomerwithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }
}
