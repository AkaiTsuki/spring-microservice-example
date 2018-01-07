package io.akaitsuki.microservice.edgeservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
@Configuration
@EnableSwagger2
public class GatewaySwaggerResourcesProvider implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<SwaggerResource>();
        resources.add(swaggerResource("AccountService", "/accountservice/v2/api-docs", "2.0"));
        resources.add(swaggerResource("UserService", "/userservice/v2/api-docs", "2.0"));
        return resources;

    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
