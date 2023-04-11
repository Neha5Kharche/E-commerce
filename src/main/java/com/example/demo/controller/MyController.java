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
import com.example.demo.model.ServiceCategory;
import com.example.demo.model.VendorServiceProvided;
import com.example.demo.model.customer;
import com.example.demo.model.vendor;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProductCategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ServiceCategoryService;
import com.example.demo.service.ServiceService;
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
	@Autowired
	ServiceCategoryService serviceCategoryService;
	@Autowired
	ServiceService serviceService;
	

	
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
	mv.addObject("errmsg","");
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
public ModelAndView vendorLogin(@RequestParam("vEmail")String email,String vPassword,HttpServletRequest req)
{
	boolean result=vService.login(email,vPassword);
	if (result==true) {
		ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
		  req.setAttribute("pcArray", pc);
		  ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryList();
		  req.setAttribute("scArray", sc);
		ModelAndView mv = new ModelAndView("vendorhome");
		return mv;
	}
	else {
		ModelAndView mv = new ModelAndView("vendorlogin");
		mv.addObject("errmsg", "Invalid Username or Password");
		return mv;
	}
}


@RequestMapping("/vhome")
public ModelAndView vendorHome(HttpServletRequest req)
{
  ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
  req.setAttribute("pcArray", pc);
  ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryList();
  req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("vendorhome");
  	mv.addObject("pc", pc);
  	mv.addObject("sc", sc);
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


@RequestMapping("/ServiceDetails")
public ModelAndView serviceDetailsHome(HttpServletRequest req)
{
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryList();
	req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("viewservice");
	mv.addObject("sc", sc);
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
@RequestMapping("/addservice")
public ModelAndView addserviceView(HttpServletRequest req)
{
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryList();
	req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("addservice");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
	return mv;
}
@RequestMapping("/creatingService")
public ModelAndView createserviceView(VendorServiceProvided vendorService)
{
	serviceService.addService(vendorService);
	ModelAndView mv = new ModelAndView("addservice");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "Service Create Successfully!!!");
	return mv;
}




@RequestMapping("/editproduct")

public ModelAndView editview()
{
	ModelAndView mv = new ModelAndView("editproduct");
	mv.addObject("errmsg", "");
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

@RequestMapping("/addservicecategory")
public ModelAndView addservicecategoryView()
{
	ModelAndView mv = new ModelAndView("addservicecategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
	return mv;
}
@RequestMapping("/creatingServiceCategory")
public ModelAndView createservicecategoryview(ServiceCategory serviceCategory)
{
	serviceCategoryService.addServiceCategory(serviceCategory);
	ModelAndView mv = new ModelAndView("addservicecategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "ServiceCategory create Successfully!!!");
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
@RequestMapping("/viewproductcategorys")
public ModelAndView newfashionview(HttpServletRequest req)
{
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
	req.setAttribute("pcArray", pc);
	ModelAndView mv = new ModelAndView("viewproductcategorys");
    return mv;
}
@RequestMapping("/viewservicecategorys")
public ModelAndView newserviceview(HttpServletRequest req)
{
	ArrayList<ServiceCategory> sc =	serviceCategoryService.getServiceCategoryList();
	req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("viewservicecategorys");
    return mv;
}

@RequestMapping("/viewproducts")
public ModelAndView productsview(HttpServletRequest req)
{
	 
	 ArrayList<Product> pc =	productService.getProductList();
	 req.setAttribute("productList", pc);
	 
	 ModelAndView mv = new ModelAndView("viewproducts");
	
	   return mv;
}
@RequestMapping("/viewservices")
public ModelAndView serviceview(HttpServletRequest req)
{
	ArrayList<VendorServiceProvided> sc =	serviceService.getServiceList();
	req.setAttribute("serviceList", sc);
	ModelAndView mv = new ModelAndView("viewservices");
    return mv;
}

@RequestMapping("/viewservicecategory")
public ModelAndView viewservicecategoryview()
{
	ModelAndView mv = new ModelAndView("viewservicecategory");
    return mv;
}



@RequestMapping("/vendorproducts")
public ModelAndView vendorproductsview(@RequestParam("pid") String pid,String cName,HttpServletRequest req)
{
	 ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
	  req.setAttribute("pcArray", pcArray);
	 ArrayList<Product> pc =	productService.getByProductCategory(pid);
	 req.setAttribute("productList", pc);
	 
	 ModelAndView mv = new ModelAndView("vendorproducts");
	 mv.addObject("cName", cName);
	   return mv;
}


@RequestMapping("/vendorservices")
public ModelAndView vendorservicesView(@RequestParam("sid") String sid,String sName,HttpServletRequest req)
{
	ArrayList<ServiceCategory> scArray = serviceCategoryService.getServiceCategoryList();
	req.setAttribute("scArray", scArray);
	ArrayList<VendorServiceProvided> sc = serviceService.getByServiceCategory(sid);
	req.setAttribute("serviceList", sc);
	
	ModelAndView mv = new ModelAndView("vendorservices");
	mv.addObject("sName", sName);
	return mv;
}
@RequestMapping("/customerproducts")
public ModelAndView customerproductsview(@RequestParam("pid") String pid,String cName,HttpServletRequest req)
{
	 ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
	  req.setAttribute("pcArray", pcArray);
	 ArrayList<Product> pc =	productService.getByProductCategory(pid);
	 req.setAttribute("productList", pc);
	 
	 ModelAndView mv = new ModelAndView("customerproducts");
	 mv.addObject("cName", cName);
	return mv;
}
@RequestMapping("/cuhome")
public ModelAndView cuHome(HttpServletRequest req)
{
  ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
  req.setAttribute("pcArray", pc);
	ModelAndView mv = new ModelAndView("cuhome");
  	mv.addObject("pc", pc);
	return mv;
}
@RequestMapping("/feedback")
public ModelAndView feedbackview()
{
	ModelAndView mv = new ModelAndView("feedback");
    return mv;
}
@RequestMapping("/editproducts")
public ModelAndView editproductsview(Long pid)
{
	Product productDetails = productService.getByProductId(pid);
	ModelAndView mv = new ModelAndView("editproducts");
	mv.addObject("productDetails", productDetails);
    return mv;
}

@RequestMapping("/updateproducts")
public ModelAndView updateproductsview(Long productId,String productPrice,String productStatus,String productDescription)
{
	 productService.updateProductDetails(productId, productPrice, productStatus, productDescription);
	ModelAndView mv = new ModelAndView("editproducts");
	
    return mv;
}
@RequestMapping("/editservices")
public ModelAndView editservicesview(Long sid)
{
	VendorServiceProvided serviceDetails = serviceService.getByServiceId(sid);
	ModelAndView mv = new ModelAndView("editservices");
	mv.addObject("serviceDetails", serviceDetails);
    return mv;
}

@RequestMapping("/updateservices")
public ModelAndView updateservicesview(Long serviceId,String servicePrice,String serviceStatus)
{
	 serviceService.updateServiceDetails(serviceId, servicePrice, serviceStatus);
	ModelAndView mv = new ModelAndView("editservices");
	
    return mv;
}
}