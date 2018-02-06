package com.mkdika.springbootdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@SpringBootApplication
@Import(SpringDataRestConfiguration.class)
public class SpringBootDataRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataRestApplication.class, args);
    }
}
