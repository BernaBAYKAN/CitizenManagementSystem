package com.bernabaykan.citizenmanagementsystem;

import com.bernabaykan.citizenmanagementsystem.Service.CitizenService;
import com.bernabaykan.citizenmanagementsystem.Utility.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CitizenManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitizenManagementSystemApplication.class, args);
	}

}
