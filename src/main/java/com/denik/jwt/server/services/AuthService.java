package com.denik.jwt.server.services;

import com.denik.jwt.server.dto.JwtAuthentication;
import com.denik.jwt.server.dto.JwtRequest;
import com.denik.jwt.server.dto.JwtResponse;
import lombok.NonNull;

public interface AuthService {
    JwtResponse login(@NonNull JwtRequest authRequest);
    JwtResponse getAccessToken(@NonNull String refreshToken);
    JwtResponse refresh(@NonNull String refreshToken);
    JwtAuthentication getAuthInfo();
}
