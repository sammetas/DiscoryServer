package com.samm.DiscoryServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoryServerApplication.class, args);
	}

}
