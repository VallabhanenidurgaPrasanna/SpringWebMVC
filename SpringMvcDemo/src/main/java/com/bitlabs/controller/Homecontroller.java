package com.bitlabs.controller;

import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.springMvcModel.Userclass;
import com.bitlabs.springmvcDao.UserDao;

@Controller
public class Homecontroller {

	@Autowired
	private UserDao dao;
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView MAV=new ModelAndView();
		MAV.addObject("name","Prasanna");
		MAV.setViewName("index");
		return MAV;
	}
	
//	@RequestMapping("/about")
//	public String about(Model model) {
//		model.addAttribute("name","prasanna");
//		model.addAttribute("id",101);
//		List<String>list=new ArrayList<String>();
//		list.add("prasanna");
//		list.add("bhagya");
//		model.addAttribute("Listofnames", list);
//		return "welcome";
//	}
	
//	@RequestMapping("/Adduser")
//	public String Adduser(@RequestParam("username") String username, @RequestParam("email") String email,
//			@RequestParam("password") String password,
//	          Model model) {
//		System.out.println(username);
//		System.out.println(email);
//		System.out.println(password);
//		model.addAttribute("username",username);
//		model.addAttribute("email", email);
//		model.addAttribute("password", password);
//		return "User";
//}
//	@RequestMapping("/Adduser")
//	public String Adduser(@RequestParam("username") String username, @RequestParam("email") String email,
//			@RequestParam("password") String password,
//	          Model model) {
//		Userclass obj=new Userclass();
//		obj.setUsername(username);
//		obj.setEmail(email);
//		obj.setPassword(password);
//		model.addAttribute("userc", obj);
//		return "User";
//		
//		
//	}
//	@RequestMapping("/Adduser")
//	public String Adduser(@ModelAttribute Userclass userclass, Model model) {
//		return "User";
//	}
	
	@RequestMapping("/Adduser")	
	public String Adduser(@ModelAttribute Userclass userclass, Model model) {
		System.out.println("home controller");
		this.dao.Adduser(userclass);
		return "success";
	}
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Userclass> list=this.dao.getAllUsers();
		model.addAttribute("userc",list);
		return "allUsers";
		
	}

	@RequestMapping("/delete/{id}")
		public String getAll(@PathVariable("id") int id) {
		this.dao.delete(id);
		return "success";
	}
	@RequestMapping("/update/{id}")
	public String getAll(@PathVariable("id") int id, Model model) {	
		Userclass uc=this.dao.getById(id);
		model.addAttribute("userc",uc);
		return "index1";
	}
}
