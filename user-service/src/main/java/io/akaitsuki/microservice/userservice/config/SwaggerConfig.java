package io.akaitsuki.microservice.userservice.config;


import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.FileReader;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() throws Exception {
        MavenXpp3Reader reader = new MavenXpp3Reader();
        Model model = reader.read(new FileReader("pom.xml"));

        ApiInfo apiInfo = new ApiInfo(
                "Account Service Api Documentation",
                "Documentation automatically generated",
                model.getParent().getVersion(),
                null,
                new Contact("Jiachi Liu", "fakeurl.com", "jliu.fake.email@gmail.com"),
                null,
                null);

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.akaitsuki.microservice.userservice"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo);
    }
}
