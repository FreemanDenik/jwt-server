package com.denik.jwt.server.repositories;

import com.denik.jwt.server.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
