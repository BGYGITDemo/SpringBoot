package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;

@SpringBootApplication
public class LombokProjApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(LombokProjApplication.class, args);
		
		Employee e=new Employee();
		e.setEname("ramesh");
		e.setEsal(3.5);
		e.setJob("se");
		
		System.out.println(e.getEname());
		System.out.println(e.getEsal());
		System.out.println(e.getJob());
	}

}
             