package com.example.pidev.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {
    private String email;
    private String name;
    private String password;
}
