package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Osoba;

@Controller
@RequestMapping("/api")
public class HomeContoller {
	@RequestMapping("/osoba")
	@ResponseBody
	public Osoba osoba() {
		Osoba o = new Osoba();
		return o;
	}
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello world";
	}

}
