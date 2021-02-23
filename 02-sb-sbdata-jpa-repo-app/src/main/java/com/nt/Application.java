package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.nt.entities.ContactDtlsEntity;
import com.nt.repository.ContactDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	   
		ContactDtlsRepository dtlsRepo = ctxt.getBean(ContactDtlsRepository.class);
	 
		
		//List<ContactDtlsEntity> list = dtlsRepo.findAll();
		//List<ContactDtlsEntity> list = dtlsRepo.findAll(Sort.by("contactName").descending());
        
//totalPages=(totalRecords / pageSize)+((totalRecords % pageSize > 0)? 1 : 0)
		int pageSize=3;
		int PageNo=2;
		PageRequest pg = PageRequest.of(PageNo, pageSize);
		Page<ContactDtlsEntity> pageData = dtlsRepo.findAll(pg);
		
		int totalPages = pageData.getTotalPages();
	    System.out.println("Total Pages::" + totalPages);
		
	    
	   /* List<ContactDtlsEntity> list = pageData.getContent();
		list.forEach(c -> {
        	System.out.println(c);
        });*/
    }

}
