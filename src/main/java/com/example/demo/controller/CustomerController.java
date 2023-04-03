package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	
//	@Autowired
//	CustomerService cService;
//	@RequestMapping("/")
//	public ModelAndView indexView()
//	{
//		ModelAndView mv = new ModelAndView("index");
//		return mv;
//	}
//	
//@RequestMapping("/customerlogin")
//public ModelAndView indexview1()
//{
//	ModelAndView mv = new ModelAndView("customerlogin");
//	mv.addObject("errmsg", "");
//	return mv;
//}
//
//@RequestMapping("/customerregis")
//public ModelAndView indexview2(customer c)
//{
//	
//	ModelAndView mv = new ModelAndView("customerregis");
//	
//	return mv;
//}
//@RequestMapping("/registringcustomer")
//public ModelAndView customerRegister(customer c)
//{
//	cService.createCustomer(c);
//	ModelAndView mv = new ModelAndView("customerlogin");
//	return mv;	
//}
//
//@RequestMapping("/cLogin")
//public ModelAndView customerLogin(String email,String password)
//{
//	boolean result=cService.login(email,password);
//	if (result==true) {
//		ModelAndView mv = new ModelAndView("customerhome");
//		return mv;
//	}
//	else {
//		ModelAndView mv = new ModelAndView("customerlogin");
//		mv.addObject("errmsg", "Invalid Username or Password");
//		return mv;
//	}
//}
//
//
//@RequestMapping("/chome")
//public ModelAndView customerHome()
//{
//	ModelAndView mv = new ModelAndView("customerhome");
//	return mv;
//}
}

