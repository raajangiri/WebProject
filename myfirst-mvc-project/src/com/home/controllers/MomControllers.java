package com.home.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomControllers {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar()
	{
		
		return"hi this is your sugar";
	}

}
