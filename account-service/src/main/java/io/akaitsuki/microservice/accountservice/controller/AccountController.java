package io.akaitsuki.microservice.accountservice.controller;

import io.akaitsuki.microservice.accountservice.client.userservice.UserDTO;
import io.akaitsuki.microservice.accountservice.client.userservice.UserServiceClient;
import io.akaitsuki.microservice.accountservice.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by jiachiliu on 1/6/18.
 */
@RestController
public class AccountController {

    @Autowired
    private UserServiceClient userServiceClient;

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable String id) {
        UserDTO user = userServiceClient.getUserById(id);
        Account account = new Account();
        account.setAccountId(id);
        account.setCreatedDate(new Date());
        account.setUser(user);
        return account;
    }
}
