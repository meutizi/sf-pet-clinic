package com.me.sfpetclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {

	@RequestMapping({"", "/", "index", "index.html"})
	public String index() {
		return "index";
	}

}
