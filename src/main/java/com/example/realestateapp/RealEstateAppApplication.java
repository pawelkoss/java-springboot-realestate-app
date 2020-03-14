package com.example.realestateapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RealEstateAppApplication {

	private BootStrap bootstrap;

	public RealEstateAppApplication(BootStrap bootStrap){
		this.bootstrap = bootStrap;
	}

	@PostConstruct
	public void init(){
		bootstrap.initializeRepository();
	}

	public static void main(String[] args) {
		SpringApplication.run(RealEstateAppApplication.class, args);
	}

}
