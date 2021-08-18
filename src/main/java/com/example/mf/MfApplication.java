package com.example.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class MfApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "MF");
        SpringApplication.run(MfApplication.class, args);
    }

}
