package com.denik.jwt.server.repositories;

import com.denik.jwt.server.entities.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserRepository extends JpaRepository<AuthUser, Long> {
    Optional<AuthUser> findByLogin(String login);
}
