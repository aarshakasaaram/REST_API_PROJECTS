package com.web_service.data_entry.controller;

//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controllers {
	@RequestMapping("/users")
    @ResponseBody
	public String responseBody() {
		return "PremSai";
		}
	


}
