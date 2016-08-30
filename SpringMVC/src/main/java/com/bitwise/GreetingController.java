package com.bitwise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	 @RequestMapping(value = "/greeting", method = RequestMethod.GET)
	 @ResponseBody 
	 public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "greeting";
	   }
       
    }
    


