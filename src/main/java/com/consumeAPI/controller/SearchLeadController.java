package com.consumeAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.consumeAPI.dto.Lead;

@Controller
public class SearchLeadController {
	
	@Autowired
	RestClint restClint;

	@RequestMapping("/search")
	public String viewSerchLeadPage() {
		return "search";
	}
	
	@RequestMapping("/searchById")
	public String searchById(@RequestParam("id") int id, Model model) {
		Lead leadInfo = restClint.getLeadInfo(id);
		model.addAttribute("leads", leadInfo);
		return "lead_info";
	}
}
