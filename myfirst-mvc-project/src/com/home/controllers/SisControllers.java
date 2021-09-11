package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SisControllers {
	

	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeup()
	{
		
		return"hi this your makeup ";
	}

}
