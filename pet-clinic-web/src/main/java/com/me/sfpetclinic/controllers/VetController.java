package com.me.sfpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import com.me.sfpetclinic.services.VetService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@RequestMapping("/vets")
@Controller
public class VetController {

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		this.vetService = vetService;
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping({"", "/", "/index", "/index.html" })
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
