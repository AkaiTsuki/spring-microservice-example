package io.akaitsuki.microservice.userservice.controller;

import io.akaitsuki.microservice.userservice.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiachiliu on 1/6/18.
 */
@RestController
public class UserController {
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return new User(id, "firstName", "lastName");
    }
}
