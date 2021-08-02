package com.guptakh.gcp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GcpDockerBuildApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws InterruptedException {
		System.out.println("The application started");
		Thread.sleep(5000);
	}

}
