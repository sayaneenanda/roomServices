package com.example.roomServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoomServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomServicesApplication.class, args);
		//System.out.println("Hi");
	}

}
