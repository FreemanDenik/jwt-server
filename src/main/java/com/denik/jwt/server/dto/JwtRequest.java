package com.denik.jwt.server.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JwtRequest {

    private String login;
    private String password;

}
