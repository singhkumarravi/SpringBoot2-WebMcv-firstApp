package com.olive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EmployeeController {

	@GetMapping("/info")
	public String show() {
		return"home";
	}
	
}
