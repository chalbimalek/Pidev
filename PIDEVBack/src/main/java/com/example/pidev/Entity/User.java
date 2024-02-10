package com.example.pidev.Entity;

import com.example.pidev.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;
  private String password;
  private UserRole userRole;
}
