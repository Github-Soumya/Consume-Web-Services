package com.consumeAPI.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.consumeAPI.dto.Lead;

@Component
public class RestClint {
	
	public Lead getLeadInfo(int id) {
		RestTemplate restTemp = new RestTemplate();
		Lead lead = restTemp.getForObject("http://localhost:8080/api/leads/lead/"+id, Lead.class);
		return lead;
	}
	
}
