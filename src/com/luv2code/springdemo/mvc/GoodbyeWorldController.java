package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoodbyeWorldController {

	//need a controller method to show the initial form
	@RequestMapping("/showGoodbyeForm")
	public String showGoodbyeForm() {
		return "goodbyeworld-form";
	}
	
	
	//once it's displayed, need a controller method to process the form
	@RequestMapping("/processGoodbyeForm")
	public String processForm() {
		return "goodbyeworld";
	}
	
	//add a new controller to read form data
	// and add data to the model
	
	
	@RequestMapping("/processFormThree")
	public String processFormVersionThree(
			@RequestParam("petName") String thePetName, Model model) { //Spring automatically stores the HTML data requested from the form into a variable
		
		
		//convert the data to uppercase
		thePetName = thePetName.toUpperCase();
		
		//create the message
		String result = " Wassup " + thePetName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "goodbyeworld";
	}
	
	
	
	
}
