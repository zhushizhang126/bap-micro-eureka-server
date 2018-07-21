package com.supcon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BapMicroEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BapMicroEurekaServerApplication.class, args);
	}
}
