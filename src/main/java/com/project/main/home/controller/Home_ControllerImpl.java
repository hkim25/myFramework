package com.project.main.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.main.home.service.Home_Service;

@Controller
public class Home_ControllerImpl implements Home_Controller{
	
	@Autowired 
	Home_Service main_Service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("start initializing...");
		return "home/home";
	}
	
	
	
}
