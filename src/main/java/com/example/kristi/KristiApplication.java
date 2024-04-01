package com.example.kristi;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KristiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KristiApplication.class, args);
	}
	@Bean
    public ApplicationRunner printHelloWorld() {
        return args -> System.out.println("Hello World!");
    }

}
