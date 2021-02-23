package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entities.ContactDtlsEntity;
import com.nt.repository.ContactDtlsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
	   
		ContactDtlsRepository dtlsRepo = ctxt.getBean(ContactDtlsRepository.class);
	
		//System.out.println("Class Name::" + dtlsRepo.getClass().getName());
		
	/*	List<String> names = dtlsRepo.getAllContactNames();
		names.forEach(name -> {
			System.out.println(name);
		});*/
		
		
		/*System.out.println("Table Count::" +dtlsRepo.count());
		List<ContactDtlsEntity> list = dtlsRepo.getAllContactStartsWithSChar();
		list.forEach(c -> {
			System.out.println(c);
		});*/
		
		//System.out.println(dtlsRepo.findByContactName("CHARLES"));
		//System.out.println(dtlsRepo.findByContactNumber(9532302184l));
		  //System.out.println("NAME ::" + dtlsRepo.getContactNameByContactId("C103"));
		
		
//		ContactDtlsEntity entity = dtlsRepo.findByContactNameAndContactNumber("SMITH",9532302184l);
//		System.out.println(entity);
		
/*		Optional<ContactDtlsEntity> findById = dtlsRepo.findById("C104");
		if(findById.isPresent()) {
		 System.out.println(findById.get());
		}
		else {
			System.out.println("record not found ...");
		}   */
		// dtlsRepo.deleteById("C106");
		
/*		Iterable<ContactDtlsEntity> findAll = dtlsRepo.findAll();
		for(ContactDtlsEntity e : findAll) {
			System.out.println(e);
		}*/

		 
//		 
//	ContactDtlsEntity entity = new ContactDtlsEntity();
//	entity.setContactId("C107");
//    entity.setContactName("CEDRONE");
//    entity.setContactNumber(9450523380l);
//    dtlsRepo.save(entity);

    }

}
