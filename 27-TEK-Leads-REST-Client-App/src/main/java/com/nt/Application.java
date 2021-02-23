package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.response.CurrencyResponse;
import com.nt.service.CurrencyService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		
	CurrencyService service = ctxt.getBean(CurrencyService.class);
	CurrencyResponse currencyCost = service.getCurrencyCost("USD", "INR");
	System.out.println(currencyCost);
	}

}
