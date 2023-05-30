package com.hongik.oven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.hongik.oven.repository")
@EntityScan("com.hongik.oven.domain")
public class OvenApplication {

	public static void main(String[] args) {
		SpringApplication.run(OvenApplication.class, args);
	}


}

