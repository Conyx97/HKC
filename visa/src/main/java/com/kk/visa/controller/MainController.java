package com.kk.visa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kk.visa.model.MainModel;
import com.kk.visa.service.MainService;

import jakarta.annotation.Resource;







@Controller
@RequestMapping("/")

public class MainController {
	@Resource
	MainService mainService;
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	
	@GetMapping("/index")
	public String MainController1() {
		return "index";
	}

	@GetMapping("/AdminLogin")
	public String Admin() {
		return "AdminLogin";
	}

	@GetMapping("/DataList")
	public String DataList() {
		return "DataList";
	}
	
	
	@PostMapping("/index")
		public String goToIndex(MainModel mainModel,Model model){
			mainService.insert(mainModel);
			
		return "index";
			
		
	}
	
	@PostMapping("/AdminLogin")
	public String Adminlogin(){
	
	return "AdminLogin";
		
	
}

	@PostMapping("/home")
	public String home1(){
	
	return "home";
		
	
}
	@PostMapping("/DataList")
	public String Datalist(){
	
	return "DataList";
		
	
}
	
	
	
	
	

	
	

}
