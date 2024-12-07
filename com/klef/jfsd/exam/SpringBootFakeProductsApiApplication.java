package com.klef.jfsd.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFakeProductsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFakeProductsApiApplication.class, args);
		System.out.println("SB is running");
	}

}
