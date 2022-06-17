package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController { // to avoid "ambiguous mapping" you can add @RequestMapping to the @Controller, so the URL will be relative to the controller
	//so instead of going to website-name/method, you can go to website-name/controller/method

	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly";
	}
}
