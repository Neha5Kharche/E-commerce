package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.customer;
import com.example.demo.model.vendor;
import com.example.demo.service.CustomerService;
import com.example.demo.service.VendorService;

@Controller

public class MyController {
	@Autowired
	VendorService vService;
	@Autowired
	CustomerService cService;
	
	@RequestMapping("/")
	public ModelAndView indexView()
	{
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
@RequestMapping("/vendorlogin")
public ModelAndView vendorloginview()
{
	ModelAndView mv = new ModelAndView("vendorlogin");
	return mv;
}

@RequestMapping("/vendorregis")
public ModelAndView vendorregisView(vendor v)
{
	
	ModelAndView mv = new ModelAndView("vendorregis");
	
	return mv;
}
@RequestMapping("/registringvendor")
public ModelAndView vendorRegister(vendor v)
{
	System.out.println(v);
	vService.createVendor(v);
	ModelAndView mv = new ModelAndView("vendorlogin");
	return mv;
	
}

@RequestMapping("/vLogin")
public ModelAndView vendorLogin(String email,String password)
{
	boolean result=vService.login(email,password);
	if (result==true) {
		ModelAndView mv = new ModelAndView("vendorhome");
		return mv;
	}
	else {
		ModelAndView mv = new ModelAndView("vendorlogin");
		return mv;
	}
}


@RequestMapping("/vhome")
public ModelAndView vendorHome()
{
	ModelAndView mv = new ModelAndView("vendorhome");
	return mv;
}

@RequestMapping("/customerlogin")
public ModelAndView customerloginview()
{
	ModelAndView mv = new ModelAndView("customerlogin");
	mv.addObject("errmsg", "");
	return mv;
}

@RequestMapping("/customerregis")
public ModelAndView customerregisview(customer c)
{
	
	ModelAndView mv = new ModelAndView("customerregis");
	
	return mv;
}
@RequestMapping("/registringcustomer")
public ModelAndView customerRegister(customer c)
{
	cService.createCustomer(c);
	ModelAndView mv = new ModelAndView("customerlogin");
	return mv;	
}

@RequestMapping("/cLogin")
public ModelAndView customerLogin(String email,String password)
{
	boolean result=cService.login(email,password);
	if (result==true) {
		ModelAndView mv = new ModelAndView("customerhome");
		return mv;
	}
	else {
		ModelAndView mv = new ModelAndView("customerlogin");
		mv.addObject("errmsg", "Invalid Username or Password");
		return mv;
	}
}


@RequestMapping("/customerhome")
public ModelAndView customerhomeView()
{
	ModelAndView mv = new ModelAndView("customerhome");
	return mv;
}

@RequestMapping("/addproduct")
public ModelAndView addproductView()
{
	ModelAndView mv = new ModelAndView("addproduct");
	return mv;
}

@RequestMapping("/productcategory")
public ModelAndView productcategoryView()
{
	ModelAndView mv = new ModelAndView("productcategory");
	return mv;
}
@RequestMapping("/addproductcategory")
public ModelAndView addproductcategoryView()
{
	ModelAndView mv = new ModelAndView("addproductcategory");
	return mv;
}

@RequestMapping("/grocery")
public ModelAndView groceryView()
{
	ModelAndView mv = new ModelAndView("grocery");
	return mv;
}

@RequestMapping("/beautyproducts")
public ModelAndView beautyproductsView()
{
	ModelAndView mv = new ModelAndView("beautyproducts");
	return mv;
}
@RequestMapping("/kitchenproducts")
public ModelAndView kitchenproductsView()
{
	ModelAndView mv = new ModelAndView("kitchenproducts");
	return mv;
}
@RequestMapping("/editproduct")
public ModelAndView editproductView()
{
	ModelAndView mv = new ModelAndView("editproduct");
	return mv;
}
@RequestMapping("/servicecategory")
public ModelAndView servicecategoryView()
{
	ModelAndView mv = new ModelAndView("servicecategory");
	return mv;
}

}
