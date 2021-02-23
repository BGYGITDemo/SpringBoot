package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(DemoApplication.class, args);
		
		User user=new User();
		
		user.setId("PU147");
		user.setName("BAL GOVIND YADAV");
		user.setEmail("bgyadav0305@gmail.com");
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getEmail());
		ctxt.close();
	}

}
