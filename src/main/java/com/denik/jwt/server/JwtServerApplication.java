package com.denik.jwt.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class JwtServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtServerApplication.class, args);
    }

}
