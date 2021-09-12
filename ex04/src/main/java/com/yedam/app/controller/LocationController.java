package com.yedam.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.app.service.LocationService;

@Controller
@RequestMapping("/loc/*")
public class LocationController {
	@Autowired
	LocationService service;

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("list", service.getList());
		return "location/list";
	}
}
