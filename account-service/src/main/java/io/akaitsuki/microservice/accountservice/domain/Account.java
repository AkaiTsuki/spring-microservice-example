package io.akaitsuki.microservice.accountservice.domain;

import java.util.Date;

/**
 * Created by jiachiliu on 1/6/18.
 */
public class Account {
    private String accountId;
    private Date createdDate;

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
