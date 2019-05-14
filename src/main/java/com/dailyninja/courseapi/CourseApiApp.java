package com.dailyninja.courseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.dailyninja.*")
@EntityScan(basePackages = {"com.dailyninja.topic","com.dailyninja.course"})
@EnableJpaRepositories(basePackages = {"com.dailyninja.topic","com.dailyninja.course"})
@EnableAutoConfiguration
public class CourseApiApp {
	
	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);

	}

}
