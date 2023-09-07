package com.conclusion.transparencyPortalService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TransparencyPortalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransparencyPortalServiceApplication.class, args);
    }

}
