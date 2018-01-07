package io.akaitsuki.microservice.accountservice.client.userservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("UserService")
public interface UserServiceClient {
    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    UserDTO getUserById(@PathVariable("id") String id);
}
