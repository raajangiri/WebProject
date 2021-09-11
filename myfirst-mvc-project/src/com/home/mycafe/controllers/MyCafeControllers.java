package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class MyCafeControllers {
	
	@RequestMapping("/cafe")
	// to return welcome-page
	public String showWelcomePage()
	{

		return"welcome-page";
	}

	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request,Model model)
	{
		String valueFromUser=request.getParameter("foodtype");
	model.addAttribute("inputfromuser",valueFromUser);
		
		return "processOrder";
	}
}
