package com.api.employee.bootrestemployee.validation;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.api.employee.bootrestemployee.entities.FormData;

@Controller
public class FormValidation {

	@RequestMapping(path = "/getFormPage", method = RequestMethod.GET)
	public ModelAndView getFormPage(Model model) {
		System.out.println("Welcome");
		ModelAndView modelAndView = new ModelAndView();
		model.addAttribute("formData", new FormData());
		modelAndView.setViewName("form");
		return modelAndView;

	}

	// processing form-data

	@PostMapping("/submitForm")
	public ModelAndView submitForm(@Valid @ModelAttribute("formData") FormData formData, BindingResult bindingResult) {

		ModelAndView modelAndView = new ModelAndView();
		
		if(bindingResult.hasErrors()) {
			
			System.out.println("Error");
			modelAndView.setViewName("form");
		}else {
			System.out.println("No Field Error");
			modelAndView.setViewName("success");
			
		}
		
	
		
		return modelAndView;
	}

}
