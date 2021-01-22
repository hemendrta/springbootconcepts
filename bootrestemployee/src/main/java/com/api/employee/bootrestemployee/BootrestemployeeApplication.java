package com.api.employee.bootrestemployee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class BootrestemployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootrestemployeeApplication.class, args);
	}

	@GetMapping("/")
	public String getHomePage(Model model){
		String str="hemendra singh chouhan";
		
		List<String> names=new ArrayList<String>();
		names.addAll(List.of("Hemendra Singh Chouhan", "Aditi Gupta Chouhan", "Nisha Singh Chouhan", "Subhash Singh Chouhan"));
		model.addAttribute("names", names);
		model.addAttribute("name", str);
		model.addAttribute("value", false);
		model.addAttribute("designation", "Trainer");
		
		List<String> list = List.of("Hemendra", "Subhash", "Nisha", "Aditi");
		model.addAttribute("list", list);
		
		return "index";

	}

}
