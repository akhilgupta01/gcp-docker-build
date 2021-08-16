package com.guptakh.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GcpDockerBuildApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication application = new SpringApplicationBuilder()
				.sources(GcpDockerBuildApplication.class)
				.build();

		ConfigurableApplicationContext applicationContext = application.run(args);
		System.out.println("Starting sleep");
		Thread.sleep(2000);
		System.out.println("Out of sleep");
		int exitCode = SpringApplication.exit(applicationContext);
		System.exit(exitCode);
	}
}
