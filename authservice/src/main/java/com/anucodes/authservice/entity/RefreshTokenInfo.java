package com.anucodes.authservice.entity;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import java.time.LocalDateTime;

public class RefreshTokenInfo {

    Integer tokenId;
    String token;
    LocalDateTime expiration;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserCred userCred;

}
