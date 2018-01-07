package io.akaitsuki.microservice.accountservice.domain;

import io.akaitsuki.microservice.accountservice.client.userservice.UserDTO;

import java.util.Date;

/**
 * Created by jiachiliu on 1/6/18.
 */
public class Account {
    private String accountId;
    private Date createdDate;
    private UserDTO user;

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
