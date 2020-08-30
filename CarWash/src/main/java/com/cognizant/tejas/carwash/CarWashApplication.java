package com.cognizant.tejas.carwash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.cognizant.tejas.carwash.dbconfig","com.cognizant.tejas.carwash.Model","com.cognizant.tejas.carwash.Service","com.cognizant.tejas.carwash.Controller"})
public class CarWashApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarWashApplication.class, args);
	}

}
