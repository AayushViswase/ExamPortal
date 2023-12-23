package com.ExamPortal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ExamPortal.Model.User;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Staring code");
		User user = new User();

	}

}
