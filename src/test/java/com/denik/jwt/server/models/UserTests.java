package com.denik.jwt.server.models;

import com.denik.jwt.server.entities.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UserTests {
    @Test
    public void UserTestEquals() {
        User user = User.builder()
                .login("login")
                .build();
        User user1 = User.builder()
                .login("login")
                .build();
        User user2 = User.builder()
                .login("login1")
                .build();
        Assert.assertTrue(user.equals(user1));
        Assert.assertTrue(user1.equals(user));
        Assert.assertFalse(user.equals(user2));
        Assert.assertFalse(user2.equals(user));
    }

    @Test
    public void UserTestSet() {
        Set<User> userSets = new HashSet<>();

        userSets.addAll(
                Arrays.asList(
                        User.builder()
                                .login("login")
                                .build(),
                        User.builder()
                                .login("login2")
                                .build(),
                        User.builder()
                                .login("login3")
                                .build()
                )
        );
        Assert.assertTrue(userSets.stream().anyMatch(u -> u.getLogin().equals("login2")));
    }
}
