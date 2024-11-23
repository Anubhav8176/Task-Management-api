package com.anucodes.authservice.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCredDto {
    String name;
    String username;
    String password;
    String email;
    String phoneNumber;
}
