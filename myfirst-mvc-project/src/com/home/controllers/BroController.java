package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class BroController {
	

	
	@RequestMapping("/cricket")
	public String giveCricket()
	{
		
		 //return"/WEB-INF/view/MRF-Cricketbat.jsp";  this can be done but this is old method  . 
		return"MRF-Cricketbat";
	}

}
