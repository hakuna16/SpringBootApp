package com.rituj.rangeservicevalidation.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
		@RequestMapping("/")
		public String hello() {
			return "Welcome To spring boot Application";
		}
	}
