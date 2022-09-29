package com.denik.jwt.server.services;

import com.denik.jwt.server.entities.AuthUser;
import io.jsonwebtoken.Claims;
import lombok.NonNull;

public interface JwtProvider {
    String generateAccessToken(@NonNull AuthUser authUser);
    String generateRefreshToken(@NonNull AuthUser authUser);
    boolean validateAccessToken(@NonNull String accessToken);
    boolean validateRefreshToken(@NonNull String refreshToken);
    Claims getAccessClaims(@NonNull String token);
    Claims getRefreshClaims(@NonNull String token);
}
