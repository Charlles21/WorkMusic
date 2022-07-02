package com.sony.album_sony;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AlbumSonyApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlbumSonyApplication.class, args);
	}
}
