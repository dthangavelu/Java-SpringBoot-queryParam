package com.gmail.devi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QueryCounter {
	
	@GetMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
		System.out.println("search query: " + searchQuery);
		if(searchQuery == null) {
			model.addAttribute("userQuery", "Human");
		}else {
			model.addAttribute("userQuery", searchQuery);
		}
		
		return "index";
	}

}
