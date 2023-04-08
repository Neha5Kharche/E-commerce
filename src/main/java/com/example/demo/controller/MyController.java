package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

import com.example.demo.model.customer;
import com.example.demo.model.vendor;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProductCategoryService;
import com.example.demo.service.ProductService;

import com.example.demo.service.VendorService;

import jakarta.servlet.http.HttpServletRequest;

@Controller

public class MyController {
	@Autowired
	VendorService vService;
	@Autowired
	CustomerService cService;
	@Autowired
	ProductCategoryService productCategoryService;
	@Autowired
	ProductService productService;

	
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
public ModelAndView vendorHome(HttpServletRequest req)
{
  ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
  req.setAttribute("pcArray", pc);
	ModelAndView mv = new ModelAndView("vendorhome");
  	mv.addObject("pc", pc);
	return mv;
}

@RequestMapping("/ProductDetails")
public ModelAndView productDetailsHome(HttpServletRequest req)
{
  ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
  req.setAttribute("pcArray", pc);
	ModelAndView mv = new ModelAndView("viewproduct");
  	mv.addObject("pc", pc);
	return mv;
}



@RequestMapping("/clients")
public ModelAndView clientsView()
{
	ModelAndView mv = new ModelAndView("clients");
	return mv;
}
@RequestMapping("/contact")
public ModelAndView contactView()
{
	ModelAndView mv = new ModelAndView("contact");
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


@RequestMapping("/chome")
public ModelAndView customerHome()
{
	ModelAndView mv = new ModelAndView("customerhome");
	return mv;
}

@RequestMapping("/adminlogin")
public ModelAndView adminloginview()
{
	ModelAndView mv = new ModelAndView("adminlogin");
	mv.addObject("errmsg", "");
	return mv;

}

@RequestMapping("/addproduct")
public ModelAndView addproductView(HttpServletRequest req)
{
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
	  req.setAttribute("pcArray", pc);
	ModelAndView mv = new ModelAndView("addproduct");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
	return mv;
}

@RequestMapping("/creatingProduct")
public ModelAndView createproductview(Product product)
{
	productService.addProduct(product);
	ModelAndView mv = new ModelAndView("addproduct");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "Product Create Successfully!!!");
	return mv;
}



@RequestMapping("/editproduct")
public ModelAndView editproductView()
{
	ModelAndView mv = new ModelAndView("editproduct");
	
	return mv;
}

@RequestMapping("/addservice")
public ModelAndView addserviceview()
{
	ModelAndView mv = new ModelAndView("addservice");
	mv.addObject("errmsg", "");
	return mv;
}

@RequestMapping("/addservicecategory")
public ModelAndView addservicecategoryview()
{
	ModelAndView mv = new ModelAndView("addservicecategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
	return mv;
}


@RequestMapping("/addproductcategory")
public ModelAndView addproductcategoryview()
{
	ModelAndView mv = new ModelAndView("addproductcategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
	return mv;
}

@RequestMapping("/creatingProductCategory")
public ModelAndView createproductcategoryview(ProductCategory productCategory)
{
	productCategoryService.addProductCategory(productCategory);
	
	ModelAndView mv = new ModelAndView("addproductcategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "ProductCategory Create Successfully!!!");
	return mv;
}


@RequestMapping("/fq")
public ModelAndView fqview()
{
	ModelAndView mv = new ModelAndView("fq");
	mv.addObject("errmsg", "");
    return mv;
}
@RequestMapping("/help")
public ModelAndView helpview()
{
	ModelAndView mv = new ModelAndView("help");
	mv.addObject("errmsg", "");
    return mv;
}
@RequestMapping("/adminresolvehelp")
public ModelAndView adminresolvehelpview()
{
	ModelAndView mv = new ModelAndView("adminresolvehelp");
	mv.addObject("errmsg", "");
    return mv;
}

@RequestMapping("/productcategory")
public ModelAndView productcategoryview()
{
	ModelAndView mv = new ModelAndView("productcategory");
    return mv;
}
@RequestMapping("/newfashion")
public ModelAndView newfashionview()
{
	ModelAndView mv = new ModelAndView("newfashion");
    return mv;
}
@RequestMapping("/clothing")
public ModelAndView clothingview()
{
	ModelAndView mv = new ModelAndView("clothing");
    return mv;
}
@RequestMapping("/watches")
public ModelAndView watchesview()
{
	ModelAndView mv = new ModelAndView("watches");
    return mv;
}
@RequestMapping("/jackets")
public ModelAndView jacketsview()
{
	ModelAndView mv = new ModelAndView("jackets");
    return mv;
}
@RequestMapping("/accessories")
public ModelAndView accessoriesview()
{
	ModelAndView mv = new ModelAndView("accessories");
    return mv;
}
@RequestMapping("/viewproduct")
public ModelAndView viewproductview()
{
	ModelAndView mv = new ModelAndView("viewproduct");
    return mv;
}

@RequestMapping("/viewservice")
public ModelAndView viewserviceview()
{
	ModelAndView mv = new ModelAndView("viewservice");
    return mv;
}
@RequestMapping("/viewservicecategory")
public ModelAndView viewservicecategoryview()
{
	ModelAndView mv = new ModelAndView("viewservicecategory");
    return mv;
}
@RequestMapping("/nav")
public ModelAndView navview()
{
	ModelAndView mv = new ModelAndView("nav");
    return mv;
}


@RequestMapping("/vendorproducts")
public ModelAndView vendorproductsview(@RequestParam("pid") String pid,HttpServletRequest req)
{
	 ArrayList<Product> pc =	productService.getByProductCategory(pid);
	 req.setAttribute("productList", pc);
	 ModelAndView mv = new ModelAndView("vendorproducts");
	
	return mv;
}


}