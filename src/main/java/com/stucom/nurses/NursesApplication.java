package com.stucom.nurses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NursesApplication.class, args);
		hello();
	}

	public static void hello() {
		System.out.println("Hello world");
	}

}
