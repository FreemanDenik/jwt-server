package com.denik.jwt.server.services;

import com.denik.jwt.server.entities.AuthUser;
import com.sun.istack.NotNull;

import java.util.Optional;

public interface UserService {
    Optional<AuthUser> getByLogin(@NotNull String login);
}
