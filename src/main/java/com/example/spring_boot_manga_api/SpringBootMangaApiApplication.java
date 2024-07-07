package com.example.spring_boot_manga_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootMangaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMangaApiApplication.class, args);
	}

}
