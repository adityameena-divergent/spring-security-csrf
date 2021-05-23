package com.divergentsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("home")
	public String home() {
		return "home.html";
	}
	
	@PostMapping("save")
	public String save(String uname) {
		System.out.println(uname);
		return "home.html";
	}
	
}
