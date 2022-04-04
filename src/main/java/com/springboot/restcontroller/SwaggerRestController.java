package com.springboot.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerRestController {
	
	@GetMapping("/user/{userId}")
	public String getName(@PathVariable	Integer id) {
		if(id == 100) {
			return "Raju";
		}else if(id == 101) {
			return "Rani";
		}
		return "No user Found";
	}

}
