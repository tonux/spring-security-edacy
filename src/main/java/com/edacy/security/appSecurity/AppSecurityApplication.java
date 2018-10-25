package com.edacy.security.appSecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSecurityApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppSecurityApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Test App");
	}
}
