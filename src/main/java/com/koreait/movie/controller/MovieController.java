package com.koreait.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
}
