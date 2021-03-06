package com.depanker;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class BootAdminUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAdminUiApplication.class, args);
	}
}
