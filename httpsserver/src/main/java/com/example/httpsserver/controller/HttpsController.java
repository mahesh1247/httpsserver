package com.example.httpsserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

	@GetMapping("/access")
	public String getMessage() {
		return "Hello World";
	}
}
