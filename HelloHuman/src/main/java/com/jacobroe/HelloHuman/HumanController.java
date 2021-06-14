package com.jacobroe.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	@RequestMapping("/") //URL Query would be http://localhost:8080/?fname=Jacob&lname=Roe in browser
	public String greetingHuman(@RequestParam(required=false) String fname, @RequestParam(required=false) String lname) {
		
		String greeting = null;
		
		if(fname == null && lname == null) {
			greeting ="Hello Human!";
		}
		else if(lname == null) {
			greeting = "Hello " + fname;
		}
		else if(fname == null) {
			greeting = "Hello " + lname;
		}
		else {
			greeting = "Hello " + fname + " " + lname;
		}
		return greeting;
	}
}