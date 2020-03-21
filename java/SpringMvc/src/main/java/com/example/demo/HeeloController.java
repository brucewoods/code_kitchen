package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeeloController {
	
	@RequestMapping("/")
     public String index() {
    	 
		  return "Greeting from Spring Bott!";
     }
}
