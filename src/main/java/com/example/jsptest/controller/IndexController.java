package com.example.jsptest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	private final String applicationName;
	
    public IndexController(@Value("${application.name}") final String applicationName) {
		this.applicationName = applicationName;
	}



	@GetMapping
    public ModelAndView index() {
        final ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("title", applicationName);
        modelAndView.addObject("navbarTitle", applicationName);
        modelAndView.addObject("showSignUpButton", false);
        modelAndView.setViewName("pages/index");

        return modelAndView;
    }
}
