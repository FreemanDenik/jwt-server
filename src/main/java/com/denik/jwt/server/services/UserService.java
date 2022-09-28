package com.denik.jwt.server.services;

import com.denik.jwt.server.entities.User;
import com.sun.istack.NotNull;

import java.util.Optional;

public interface UserService {
    Optional<User> getByLogin(@NotNull String login);
}
