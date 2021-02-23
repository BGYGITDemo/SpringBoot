package com.nt.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nt.response.CurrencyResponse;

@Service
public class CurrencyService {
  
	String endpointUrl="https://tekleads-ce-api.cfapps.io/getCurrencyExchangeCost/from/{from}/to/{to}";
	
	public CurrencyResponse getCurrencyCost(String from, String to) {
	RestTemplate rt=new RestTemplate();
	
//	rt.getForEntity(endpointUrl, String.class, from, to);
	ResponseEntity<CurrencyResponse> resEntity =
			rt.getForEntity(endpointUrl, CurrencyResponse.class, from, to);
	
	if(resEntity!=null && resEntity.getStatusCode().value() == 200) {
		return resEntity.getBody();
	}
	return null;	
	
	}
}
