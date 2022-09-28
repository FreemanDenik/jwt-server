package com.denik.jwt.server.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRefreshRequest {
    public String refreshToken;
}
