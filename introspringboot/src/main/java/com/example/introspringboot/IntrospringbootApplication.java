package com.example.introspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.example.introspringboot"})

public class IntrospringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(IntrospringbootApplication.class, args);
    }

}
