package com.tesco.rangeservicevalidation.main.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@RequestMapping(value = "/mgps/{name}" )
	public String getAllRangeGroups (@PathVariable("name") String name){
		
		String msg = String.format("%s is years old", name);
		
		return msg;
		
	}
}
