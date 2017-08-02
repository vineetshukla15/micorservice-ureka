package com.vineet.urekaserver.micorserviceureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicorserviceUrekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicorserviceUrekaApplication.class, args);
	}
}
