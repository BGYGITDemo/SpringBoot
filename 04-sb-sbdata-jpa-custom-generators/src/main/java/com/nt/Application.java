package com.nt;



import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.OrderDetailsEntity;
import com.nt.reository.OrderDetailsRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	 
		OrderDetailsRepo repo = ctxt.getBean(OrderDetailsRepo.class);
		
		OrderDetailsEntity entity = new OrderDetailsEntity();
		entity.setOrderBy("GREY");
		entity.setOrderPlaceDate(new Date());
		
		OrderDetailsEntity savedEntity = repo.save(entity);
		
		System.out.println("RECORD SAVED::" +savedEntity);
		//repo.deleteById("OD1");
		
		
		 System.out.println("total record::"+repo.count());
		List<OrderDetailsEntity> list = repo.findAll();
		list.forEach(o -> {
			System.out.println(o);
		});
		ctxt.close();
	}

}
