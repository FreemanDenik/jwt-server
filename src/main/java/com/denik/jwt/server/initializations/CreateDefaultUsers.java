package com.denik.jwt.server.initializations;

import com.denik.jwt.server.entities.Role;
import com.denik.jwt.server.entities.User;
import com.denik.jwt.server.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.*;

@Component
@Transactional
public class CreateDefaultUsers {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public CreateDefaultUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Bean("CreateDefaultUsers")
    public void createDefaultUsers(){
        User user =  User.builder()
                .login("my_login")
                .email("user@mail.ru")
                .roles(Set.of(Role.USER, Role.ADMIN))
                .password(passwordEncoder.encode("123"))
                .build();
        userRepository.save(user);

    }
}
