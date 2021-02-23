package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entities.CustomerDtlsEntity;
import com.nt.repository.CustomerDtlsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	
	CustomerDtlsRepo repo = ctxt.getBean(CustomerDtlsRepo.class);
	
	CustomerDtlsEntity entity = new CustomerDtlsEntity();

	 entity.setCustomerName("NICKK");
	 entity.setCustomerEmail("NICKK123@gmail.com");
	
     CustomerDtlsEntity savedEntity = repo.save(entity);
	 System.out.println("SAVED RECORD::" + savedEntity);
	
	List<CustomerDtlsEntity> list = repo.findAll();
    list.forEach(c -> {
    	System.out.println(c);
    });
	ctxt.close();
	}

	
}
