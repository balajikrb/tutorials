package com.balaji.tutorials.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.balaji.tutorials.nullpointer.Example;

@SpringBootApplication
public class BannerDemo {
	public static void main(String[] args) {

		SpringApplication.run(Example.class, args);
		System.out.println("###### Spring Boot - Banner demo ######");
		System.out.println("#######################################");
	}
}
