package com.anucodes.authservice.repository;

import com.anucodes.authservice.entity.UserCred;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserCred, String> {
}
