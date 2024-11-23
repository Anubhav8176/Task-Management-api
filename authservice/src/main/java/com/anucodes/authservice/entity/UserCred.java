package com.anucodes.authservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserCred {
    @Id
    private String userId;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
}
