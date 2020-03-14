package com.example.realestateapp;

import com.example.realestateapp.utils.DataExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RealEstateAppApplication {

	private DataExample dataExample;

	public RealEstateAppApplication(DataExample dataExample){
		this.dataExample = dataExample;
	}

	@PostConstruct
	public void init(){
		dataExample.initializeRepository();
	}

	public static void main(String[] args) {
		SpringApplication.run(RealEstateAppApplication.class, args);
	}

}
