package io.akaitsuki.microservice.accountservice;

import io.akaitsuki.microservice.accountservice.domain.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by jiachiliu on 1/6/18.
 */
@RestController
public class AccountController {

    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable String id) {
        Account account = new Account();
        account.setAccountId(id);
        account.setCreatedDate(new Date());
        return account;
    }
}
