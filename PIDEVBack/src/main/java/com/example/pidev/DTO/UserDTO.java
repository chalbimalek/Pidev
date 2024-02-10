package com.example.pidev.DTO;

import com.example.pidev.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private long id;
    private String name;
    private String email;
    private UserRole userRole;





}
