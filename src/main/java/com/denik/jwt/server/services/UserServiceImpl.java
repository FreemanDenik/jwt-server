package com.denik.jwt.server.services;

import com.denik.jwt.server.entities.User;
import com.denik.jwt.server.repositories.UserRepository;
import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public Optional<User> getByLogin(@NotNull String login) {
        return userRepository.findByLogin(login);
    }
}
