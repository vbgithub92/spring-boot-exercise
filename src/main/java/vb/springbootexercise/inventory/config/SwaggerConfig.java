package vb.springbootexercise.inventory.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("vb.springbootexercise.inventory.controllers"))
                .paths(regex("/inventory.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {

        return new ApiInfo(
                "Home Exercise Spring Boot REST API",
                "Release notes: Please note that this API was created to demonstrate the ability to learn and implement new technologies," +
                        " therefore it's not production ready," +
                        " to clarify, no exceptions are handled in this project and the logical validity of users input is not tested." +
                " Please enter the h2 database using the JDBC URL: jdbc:h2:~/test",
                "1.0",
                "Terms of service",
                new Contact("Vlad Beil", "www.linkedin.com/in/vladBeil", "vlad.bell92@gmail.com"),
                "Apache License Version 2.0", "https://www.apache.org/licesen.html", Collections.emptyList());
    }
}
