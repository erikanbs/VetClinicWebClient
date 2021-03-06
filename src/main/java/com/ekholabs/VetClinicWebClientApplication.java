package com.ekholabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class VetClinicWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(VetClinicWebClientApplication.class, args);
	}
}
