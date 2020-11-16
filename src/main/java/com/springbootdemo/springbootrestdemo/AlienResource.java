package com.springbootdemo.springbootrestdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@GetMapping("aliens")
	public String getAliens()
	{
		return "Retrieving Aliens";
	}

}
