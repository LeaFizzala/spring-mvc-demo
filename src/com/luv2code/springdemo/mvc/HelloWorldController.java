package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // that's the parent mapping
public class HelloWorldController {

	//need a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	//once it's displayed, need a controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//add a new controller to read form data
	// and add data to the model
	
	@RequestMapping("/processFormTwo")
	public String letsShoutGirl(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		//convert the data to uppercase
		theName = theName.toUpperCase();
		
		//create the message
		String result = " Yo " + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
//	@RequestMapping("/processFormThree")
//	public String processFormVersionThree(
//			@RequestParam("studentName") String theName, Model model) { //Spring automatically stores the HTML data requested from the form into a variable
//		
//		
//		//convert the data to uppercase
//		theName = theName.toUpperCase();
//		
//		//create the message
//		String result = " Wassup " + theName;
//		
//		//add message to the model
//		model.addAttribute("message", result);
//		
//		return "helloworld";
//	}
	
	
	
	
}
