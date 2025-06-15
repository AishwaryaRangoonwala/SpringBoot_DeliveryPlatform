package com.aishwarya.SpringBoot_DeliveryPlatform;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeliveryPlatformApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDeliveryPlatformApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("********** DELIVERY PLATFORM **********");
	}
}
