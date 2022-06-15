package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//add the @Controller annotation to tell Spring that this class acts as a controller
@Controller
public class HomeController {
	
	//defining a controller method
	@RequestMapping("/")
	public String showPage() {
		//put the name of the page that will be shown, but without the prefix and suffix
		return "main-menu";
	}

}
