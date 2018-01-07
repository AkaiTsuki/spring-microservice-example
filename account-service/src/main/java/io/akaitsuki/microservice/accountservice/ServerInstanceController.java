package io.akaitsuki.microservice.accountservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jiachiliu on 1/6/18.
 * <p>
 * Controller to retrieve service instances from discovery service
 */
@RestController
public class ServerInstanceController {

    private final DiscoveryClient discoveryClient;

    @Autowired
    public ServerInstanceController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/services/{app}")
    public List<ServiceInstance> getServiceInstances(@PathVariable String app) {
        return discoveryClient.getInstances(app);
    }
}
