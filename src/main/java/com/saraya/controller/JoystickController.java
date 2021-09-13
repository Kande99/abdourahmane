package com.saraya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.saraya.model.JoystickService;

@Controller
public class JoystickController {
	@Autowired
	JoystickService js;
	@RequestMapping(value="/list-joystick", method=RequestMethod.GET)
	public String showList(ModelMap model) {
	  model.addAttribute("joysticks", js.getAllJoysticks());
		return "joystickList";
	}
	
	@RequestMapping(value="/add-joystick", method=RequestMethod.GET)
	public String addJoystickForm() {
	  
		return "addJoystick";
	}
	
	@RequestMapping(value="/add-joystick", method=RequestMethod.POST)
	public String joystickAdded(ModelMap model, @RequestParam int year,
			@RequestParam String make, @RequestParam String mode,
			@RequestParam String picture) {
	  js.addJoystick(year, make, mode, picture);
		return "redirect:/list-joystick";
	}
	
	@RequestMapping(value="/delete-joystick", method=RequestMethod.GET)
	public String DeleteList(ModelMap model, 
			@RequestParam int id) {
	  js.removeJoystick(id);
	  model.clear();
		return "redirect:/list-joystick";
	}
	
	
}