package com.denik.jwt.server.models;

import com.denik.jwt.server.entities.AuthUser;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AuthUserTests {
    @Test
    public void UserTestEquals() {
        AuthUser authUser = AuthUser.builder()
                .login("login")
                .build();
        AuthUser authUser1 = AuthUser.builder()
                .login("login")
                .build();
        AuthUser authUser2 = AuthUser.builder()
                .login("login1")
                .build();
        Assert.assertTrue(authUser.equals(authUser1));
        Assert.assertTrue(authUser1.equals(authUser));
        Assert.assertFalse(authUser.equals(authUser2));
        Assert.assertFalse(authUser2.equals(authUser));
    }

    @Test
    public void UserTestSet() {
        Set<AuthUser> authUserSets = new HashSet<>();

        authUserSets.addAll(
                Arrays.asList(
                        AuthUser.builder()
                                .login("login")
                                .build(),
                        AuthUser.builder()
                                .login("login2")
                                .build(),
                        AuthUser.builder()
                                .login("login3")
                                .build()
                )
        );
        Assert.assertTrue(authUserSets.stream().anyMatch(u -> u.getLogin().equals("login2")));
    }
}
