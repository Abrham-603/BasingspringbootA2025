package com.example.basingspringboota2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BasingspringbootA2025Application {
    public static void main(String[] args) {
        SpringApplication.run(BasingspringbootA2025Application.class, args);
    }
}
