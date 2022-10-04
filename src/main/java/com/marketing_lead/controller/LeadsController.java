package com.marketing_lead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeadsController {
	
	@RequestMapping("/createleads")
	public String createOneLead() {
	return"create_leads";
}
}
