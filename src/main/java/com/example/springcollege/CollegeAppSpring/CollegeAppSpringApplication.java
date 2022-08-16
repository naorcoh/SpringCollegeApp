package com.example.springcollege.CollegeAppSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.springcollege.CollegeAppSpring.repository")
@EntityScan("com.example.springcollege.CollegeAppSpring.model")
@EnableJpaAuditing(auditorAwareRef = "AuditAwareBean")
public class CollegeAppSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollegeAppSpringApplication.class, args);
	}

}
