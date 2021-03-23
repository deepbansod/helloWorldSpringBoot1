package com.example.helloWorldSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
public class bookController {
	@GetMapping("/book")  
	private String getAllBooks()   
	{  
	return "success";  
	}  
}
