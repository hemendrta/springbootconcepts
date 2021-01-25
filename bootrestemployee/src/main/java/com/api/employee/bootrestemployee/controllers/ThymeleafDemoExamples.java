package com.api.employee.bootrestemployee.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ThymeleafDemoExamples {

	@GetMapping("/getRequest")
	public ModelAndView getRequest() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("request");
		return modelAndView;
		
	}
	
}
