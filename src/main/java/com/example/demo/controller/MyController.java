package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Cart;



import com.example.demo.model.Feedback;
import com.example.demo.model.Help;

import com.example.demo.model.Product;
import com.example.demo.model.ProductCategory;

import com.example.demo.model.ServiceCategory;
import com.example.demo.model.VendorServiceProvided;
import com.example.demo.model.customer;
import com.example.demo.model.vendor;
import com.example.demo.service.AdminService;
import com.example.demo.service.CartService;
import com.example.demo.service.CustomerService;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.HelpService;
import com.example.demo.service.ProductCategoryService;
import com.example.demo.service.ProductService;

import com.example.demo.service.ServiceCategoryService;
import com.example.demo.service.ServiceService;
import com.example.demo.service.VendorService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

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
	@Autowired
	CartService cartService;
	@Autowired
	HelpService helpService;
	@Autowired
	FeedbackService feedbackService;
	@Autowired
AdminService adService;
	

	
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
@RequestMapping("/adminlogin")
public ModelAndView hospitalloginView() {
	ModelAndView mv = new ModelAndView("adminlogin");
	mv.addObject("smsg", "");
	mv.addObject("emsg", "");
	mv.addObject("name", mv);
	return mv;
}
@RequestMapping("/loginCheck")
public ModelAndView loginCheckView(String userid, String password) {
	ModelAndView mv = new ModelAndView();
	if (adService.adminLoginCheck(userid, password)) {
		mv.addObject("userid",userid);

		mv.setViewName("adminhome");

		return mv;
	}

	else {
		
		mv.setViewName("adminlogin");
		mv.addObject("smsg", "");
		mv.addObject("emsg", "Invalid userid or password");
		return mv;
	}

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
		HttpSession session = req.getSession();
		session.setAttribute("user", email);
		ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryByVendors(email);
		  req.setAttribute("pcArray", pc);
		  ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryByVendors(email);
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
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("pcArray", pc);
	  ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("vendorhome");
  	mv.addObject("pc", pc);
  	mv.addObject("sc", sc);
	return mv;
}

@RequestMapping("/ProductDetails")
public ModelAndView productDetailsHome(HttpServletRequest req)
{
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("pcArray", pc);
	ModelAndView mv = new ModelAndView("viewproduct");
  	mv.addObject("pc", pc);
	return mv;
}


@RequestMapping("/ServiceDetails")
public ModelAndView serviceDetailsHome(HttpServletRequest req)
{
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryByVendors(req.getSession().getAttribute("user").toString());
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
public ModelAndView customerLogin(@RequestParam("cEmail")String email,String cPassword,HttpServletRequest req)
{
	boolean result=cService.login(email,cPassword);
	if (result==true) {
		ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
		  req.setAttribute("pcArray", pc);
		  ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryList();
		  req.setAttribute("scArray", sc);
		HttpSession session = req.getSession();
		session.setAttribute("user", email);
		
		customer c = cService.getByEmail(email);
		session.setAttribute("cName",c.getCfirstname()+" "+c.getClastname());
		ModelAndView mv = new ModelAndView("customerhome");
		mv.addObject("customer", c);
		return mv;
	}
	else {
		ModelAndView mv = new ModelAndView("customerlogin");
		mv.addObject("errmsg", "Invalid Username or Password");
		return mv;
	}
}


@RequestMapping("/chome")
public ModelAndView customerhome(HttpServletRequest req)
{
  ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryList();
  req.setAttribute("pcArray", pc);
  ArrayList<ServiceCategory> sc =	serviceCategoryService.getServiceCategoryList();
  req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("customerhome");
  	mv.addObject("pc", pc);
  	mv.addObject("sc", sc);
	return mv;
}
@RequestMapping("/clogout")
public ModelAndView customerLogout(HttpServletRequest req)
{
	HttpSession session = req.getSession();
	session.invalidate();
	
	ModelAndView mv = new ModelAndView("customerlogin");
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
@RequestMapping("/customerservices")
public ModelAndView customerservicesview(@RequestParam("sid") String sid,String sName,HttpServletRequest req)
{
	 ArrayList<ServiceCategory> scArray =	serviceCategoryService.getServiceCategoryList();
	  req.setAttribute("scArray", scArray);
	 ArrayList<VendorServiceProvided> sc =	serviceService.getByServiceCategory(sid);
	 req.setAttribute("serviceList", sc);
	 
	 ModelAndView mv = new ModelAndView("customerservices");
	 mv.addObject("sName", sName);
	return mv;
}
@RequestMapping("/customerViewAllProducts")
public ModelAndView customerViewAllProductsView(HttpServletRequest req)
{
	 ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
	  req.setAttribute("pcArray", pcArray);
	 ArrayList<Product> pc =	productService.getProductList();
	 req.setAttribute("productList", pc);
	 
	 
	 
	 ModelAndView mv = new ModelAndView("cviewallproducts");
	 
	return mv;
}
@RequestMapping("/cProductDetails")
public ModelAndView customerProductDetailsView(HttpServletRequest req,String pid)
{
//	 ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
//	  req.setAttribute("pcArray", pcArray);
//	 ArrayList<Product> pc =	productService.getProductList();
//	 req.setAttribute("productList", pc);
	
	Product productDetails = productService.getById(new Long(pid));
	req.setAttribute("productDetails", productDetails);
	 
	 ModelAndView mv = new ModelAndView("viewdetails");
	 
	return mv;
}
@RequestMapping("/customerViewAllServices")
public ModelAndView customerViewAllServicesView(HttpServletRequest req)
{
	 ArrayList<ServiceCategory> scArray =	serviceCategoryService.getServiceCategoryList();
	  req.setAttribute("scArray", scArray);
	 ArrayList<VendorServiceProvided> sc =	serviceService.getServiceList();
	 req.setAttribute("serviceList", sc);
	 
	 
	 
	 ModelAndView mv = new ModelAndView("cviewallservices");
	 
	return mv;
}
@RequestMapping("/cServiceDetails")
public ModelAndView customerServiceDetailsView(HttpServletRequest req,String sid)
{

	
	VendorServiceProvided serviceDetails = serviceService.getById(new Long(sid));
	req.setAttribute("serviceDetails", serviceDetails);
	 
	 ModelAndView mv = new ModelAndView("viewservicedetails");
	 
	return mv;
}

@RequestMapping("/cart")
public ModelAndView cartview(HttpServletRequest req,String cid)
{
	ArrayList<Cart> cartProduct = cartService.getCartProductByCustomer(cid);
	req.setAttribute("cartProduct", cartProduct);
	ModelAndView mv = new ModelAndView("cart");
    return mv;
}

@RequestMapping("/addCart")
public ModelAndView addToCartView(HttpServletRequest req,String pid,String cid)
{
	
	String customerId = cid;
	Product product = productService.getById(new Long(pid));
	System.out.println(product);
	cartService.addToCart(product,customerId);	
	ModelAndView mv = new ModelAndView("cartsuccess");
	mv.addObject("cid", cid);
	return mv;
}


@RequestMapping("/remove")
public ModelAndView removeFromCart(String cartId,HttpServletRequest req)
{
	cartService.removeCartItem(new Long(cartId));
	ArrayList<Cart> cartProduct = cartService.getCartProductByCustomer(req.getSession().getAttribute("user").toString());
	req.setAttribute("cartProduct", cartProduct);
	ModelAndView mv = new ModelAndView("cart");
    return mv;
}

@RequestMapping("/clearCart")
public ModelAndView clearCar(HttpServletRequest req)
{
	cartService.clearCart();
	ArrayList<Cart> cartProduct = cartService.getCartProductByCustomer(req.getSession().getAttribute("user").toString());
	req.setAttribute("cartProduct", cartProduct);
	ModelAndView mv = new ModelAndView("cart");
    return mv;
}



@RequestMapping("/spurchase")
public ModelAndView purchaseview(HttpServletRequest req,String sid,String cid)
{
	VendorServiceProvided service = serviceService.getById(new Long(sid));
	ModelAndView mv = new ModelAndView("spurchase");
	mv.addObject("service", service);
    return mv;
}

@RequestMapping("/addproduct")
public ModelAndView addproductView(HttpServletRequest req)
{
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryByVendors(req.getSession().getAttribute("user").toString());
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
	ModelAndView mv = new ModelAndView("productsuccess");
	mv.addObject("product", product);
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "Product Create Successfully!!!");
	return mv;
}
@RequestMapping("/addservice")
public ModelAndView addserviceView(HttpServletRequest req)
{
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryByVendors(req.getSession().getAttribute("user").toString());
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
	ModelAndView mv = new ModelAndView("servicesuccess");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "Service Create Successfully!!!");
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
	
	ModelAndView mv = new ModelAndView("productcategorysuccess");
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
	ModelAndView mv = new ModelAndView("servicecategorysuccess");
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
public ModelAndView helpview(HttpServletRequest request)
{
	List<Help> queryList = helpService.getqueryBycustomerId(request.getSession().getAttribute("user").toString());
	System.out.println(queryList);
	request.setAttribute("ql", queryList);
	ModelAndView mv = new ModelAndView("help");
	mv.addObject("successMsg", "");
    return mv;
}


@RequestMapping("/filter")
public ModelAndView productcategoryview(HttpServletRequest req)
{
ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
req.setAttribute("pcArray", pcArray);
System.out.println("424");
System.out.println(pcArray);
ArrayList<Product> pc =	productService.getProductList();
req.setAttribute("productList", pc);
ModelAndView mv = new ModelAndView("filter");
return mv;
}
@RequestMapping("/sfilter")
public ModelAndView servicecategoryview(HttpServletRequest req)
{
ArrayList<ServiceCategory> scArray =	serviceCategoryService.getServiceCategoryList();
req.setAttribute("scArray", scArray);
System.out.println("424");
System.out.println(scArray);
ArrayList<VendorServiceProvided> sc =	serviceService.getServiceList();
req.setAttribute("serviceList", sc);
ModelAndView mv = new ModelAndView("sfilter");
return mv;
}

@RequestMapping("/postQuery")
public ModelAndView postQuery(Help helpQuery,HttpServletRequest request)

{

	List<Help> queryList = helpService.getqueryBycustomerId(request.getSession().getAttribute("user").toString());
	System.out.println(queryList);
	request.setAttribute("ql", queryList);
	helpService.postQuery(helpQuery);
	ModelAndView mv = new ModelAndView("help");
	mv.addObject("successfullymsg", "Query raised successfully!!!");
	return mv;
}
@RequestMapping("/adminresolvehelp")
public ModelAndView adminresolvehelpview(HttpServletRequest request,String cid,String query,Long queryId)
{
	List<Help> queryList = helpService.getQuerys();
	System.out.println(queryList);
	request.getSession().setAttribute("ql", queryList);
	ModelAndView mv = new ModelAndView("adminresolvehelp");
	mv.addObject("cid", cid);
	mv.addObject("query", query);
	mv.addObject("queryId", queryId);

    return mv;
}


@RequestMapping("/applyFilter")
public ModelAndView applyFiterView(HttpServletRequest request)
{ 
	
	String pNames[] = request.getParameterValues("productname");
	
	List<String> queryFilterProducyBy = new ArrayList<>();
	for(String pName:pNames)
	{
		queryFilterProducyBy.add(pName);
	}
	System.out.println(queryFilterProducyBy);
	ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
	request.setAttribute("pcArray", pcArray);
	ArrayList<Product> filterList =	productService.getFilterByproduct(queryFilterProducyBy);
	request.setAttribute("productList", filterList);
	System.out.println("449"+filterList);
	ModelAndView mv = new ModelAndView("cviewallproducts");
	 
	return mv;
}

@RequestMapping("/applySFilter")
public ModelAndView applySFiterView(HttpServletRequest request)
{ 
	
	String sNames[] = request.getParameterValues("servicename");
	
	List<String> queryFilterServiceBy = new ArrayList<>();
	for(String sName:sNames)
	{
		queryFilterServiceBy.add(sName);
	}
	System.out.println(queryFilterServiceBy);
	ArrayList<ServiceCategory> scArray =	serviceCategoryService.getServiceCategoryList();
	request.setAttribute("scArray", scArray);
	ArrayList<VendorServiceProvided> filterList =	serviceService.getFilterByservice(queryFilterServiceBy);
	request.setAttribute("serviceList", filterList);
	System.out.println("449"+filterList);
	ModelAndView mv = new ModelAndView("cviewallservices");
	 
	return mv;
}


@RequestMapping("/solution")
public ModelAndView solutionView(Long queryId,String query,String solution)
{
	helpService.updateSolution(queryId, solution);
	ModelAndView mv = new ModelAndView("adminresolvehelp");
	return mv;
}

@RequestMapping("/feedback")
public ModelAndView feedbackview()
{
	ModelAndView mv = new ModelAndView("feedback");
	mv.addObject("successMsg", "");
    return mv;
}
@RequestMapping("/postFeedback")
public ModelAndView postFeedback(Feedback feedback)
{
	System.out.println(feedback);
	feedbackService.postFeedback(feedback);
	
	ModelAndView mv = new ModelAndView("feedback");
	mv.addObject("successfullymsg", "Thanks for your feedback!!");
	return mv;
}
@RequestMapping("/adminfeedback")
public ModelAndView adminfeedbackView(HttpServletRequest request)
{
	List<Feedback> feedbackList = feedbackService.getFeedbacks();
	
	request.setAttribute("f", feedbackList);
	System.out.println();
	ModelAndView mv = new ModelAndView("adminfeedback");
	
    return mv;
	
}



@RequestMapping("/viewproductcategorys")
public ModelAndView newfashionview(HttpServletRequest req)
{
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("pcArray", pc);
	
	ModelAndView mv = new ModelAndView("viewproductcategorys");
    return mv;
}
@RequestMapping("/viewservicecategorys")
public ModelAndView newserviceview(HttpServletRequest req)
{
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("viewservicecategorys");
    return mv;
}

@RequestMapping("/viewproducts")
public ModelAndView productsview(HttpServletRequest req )
{
	String vid = req.getSession().getAttribute("user").toString();
	 ArrayList<ProductCategory> pcArray =	productCategoryService.getProductCategoryList();
	 req.setAttribute("pcArray", pcArray);
	 ArrayList<Product> pc =	productService.getByProduct(vid);
	 req.setAttribute("productList", pc);
	 
	 ModelAndView mv = new ModelAndView("viewproducts");
	
	   return mv;
}
@RequestMapping("/viewservices")
public ModelAndView serviceview(HttpServletRequest req)
{
	String vid = req.getSession().getAttribute("user").toString();
	ArrayList<ServiceCategory> scArray =	serviceCategoryService.getServiceCategoryList();
	req.setAttribute("scArray", scArray);
	
	ArrayList<VendorServiceProvided> sc =	serviceService.getByService(vid);
	 req.setAttribute("serviceList", sc);
	ModelAndView mv = new ModelAndView("viewservices");
    return mv;
}




@RequestMapping("/vendorproducts")
public ModelAndView vendorproductsview(@RequestParam("pid") String pid,String cName,HttpServletRequest req)
{
	String vid = req.getSession().getAttribute("user").toString();
	ArrayList<ProductCategory> pc =	productCategoryService.getProductCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("pcArray", pc);
	 ArrayList<Product> product =	productService.getByProductCategory(pid,vid);
	 req.setAttribute("productList", product);
	 
	 ModelAndView mv = new ModelAndView("vendorproducts");
	 mv.addObject("cName", cName);
	   return mv;
}




@RequestMapping("/vendorservices")
public ModelAndView vendorservicesView(@RequestParam("sid") String sid,String sName,HttpServletRequest req)
{
	String vid = req.getSession().getAttribute("user").toString();
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryByVendors(req.getSession().getAttribute("user").toString());
	  req.setAttribute("scArray", sc);
	ArrayList<VendorServiceProvided> service = serviceService.getByServiceCategory(sid,vid);
	req.setAttribute("serviceList", service);
	
	ModelAndView mv = new ModelAndView("vendorservices");
	mv.addObject("sName", sName);
	return mv;
}



@RequestMapping("/editproducts")
public ModelAndView editproductsview(Long pid)
{
	Product productDetails = productService.getByProductId(pid);
	ModelAndView mv = new ModelAndView("editproducts");
	mv.addObject("productDetails", productDetails);
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
    return mv;
}

@RequestMapping("/updateproducts")
public ModelAndView updateproductsview(Long productId,String productPrice,String productStatus,String productDescription)
{
	 productService.updateProductDetails(productId, productPrice, productStatus, productDescription);
	ModelAndView mv = new ModelAndView("editproducts");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "Product Updated Successfully!!!");
	
    return mv;
}
@RequestMapping("/editproductcategory")
public ModelAndView editproductcategoryView(Long pid)
{
	ProductCategory productCategory = productCategoryService.getByProductCategoryId(pid);
	ModelAndView mv = new ModelAndView("editproductcategory");
	mv.addObject("productCategory", productCategory);
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
    return mv;
}

@RequestMapping("/updateproductcategories")
public ModelAndView updateproductcategoriesview(Long productCategoryId,String productCategoryName,String productCategoryIcon,String productCategoryImage)
{
	 productCategoryService.updateProductCategoryDetails(productCategoryId, productCategoryName, productCategoryIcon, productCategoryImage);
	ModelAndView mv = new ModelAndView("editproductcategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "ProductCategory Updated Successfully!!!");
	
    return mv;
}
@RequestMapping("/editservicecategory")
public ModelAndView editservicecategoryView(Long sid)
{
	ServiceCategory serviceCategory = serviceCategoryService.getByServiceCategoryId(sid);
	ModelAndView mv = new ModelAndView("editservicecategory");
	mv.addObject("serviceCategory", serviceCategory);
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
    return mv;
}

@RequestMapping("/updateservicecategories")
public ModelAndView updateservicecategoriesview(Long serviceCategoryId,String serviceCategoryName,String serviceCategoryImage)
{
	 serviceCategoryService.updateServiceCategoryDetails(serviceCategoryId, serviceCategoryName, serviceCategoryImage);
	ModelAndView mv = new ModelAndView("editservicecategory");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "ServiceCategory Updated Successfully!!!");
	
    return mv;
}


@RequestMapping("/editservices")
public ModelAndView editservicesview(Long sid)
{
	VendorServiceProvided serviceDetails = serviceService.getByServiceId(sid);
	ModelAndView mv = new ModelAndView("editservices");
	mv.addObject("serviceDetails", serviceDetails);
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "");
    return mv;
}

@RequestMapping("/updateservices")
public ModelAndView updateservicesview(Long serviceId,String servicePrice,String serviceStatus,String serviceDescription)
{
	 serviceService.updateServiceDetails(serviceId, servicePrice, serviceStatus, serviceDescription);
	ModelAndView mv = new ModelAndView("editservices");
	mv.addObject("errmsg", "");
	mv.addObject("successfullymsg", "Service Updated Successfully!!!");
	
    return mv;
}

@RequestMapping("/billgeneration")
public ModelAndView billgenerationview()
{
	ModelAndView mv = new ModelAndView("billgeneration");
    return mv;
}

@RequestMapping("/logout")
public ModelAndView vendorLogout(HttpServletRequest req)
{
	HttpSession session = req.getSession();
	session.invalidate();
	
	ModelAndView mv = new ModelAndView("vendorlogin");
	return mv;
	
}


@RequestMapping("/newfq")
public ModelAndView newfqView()
{
	ModelAndView mv = new ModelAndView("newfq");
	return mv;
}
@RequestMapping("/vendorheader")
public ModelAndView vendorheaderView()
{
	ModelAndView mv = new ModelAndView("vendorheader");
	return mv;
}
@RequestMapping("/adminhome")
public ModelAndView adminhomeView()
{
	ModelAndView mv = new ModelAndView("adminhome");
	return mv;
}
@RequestMapping("/adminhelp")
public ModelAndView adminhelpView(HttpServletRequest request)
{
	List<Help> queryList = helpService.getQuerys();
	
	request.setAttribute("ql", queryList);
	System.out.println();
	ModelAndView mv = new ModelAndView("adminhelp");
	
    return mv;
	
}

@RequestMapping("/adminhandle")
public ModelAndView adminhandleView(HttpServletRequest req)
{
	ArrayList<ProductCategory> pc = productCategoryService.getProductCategoryList();
	ArrayList<ServiceCategory> sc = serviceCategoryService.getServiceCategoryList();
	req.setAttribute("pcArray", pc);
	req.setAttribute("scArray", sc);
	ModelAndView mv = new ModelAndView("adminhandle");
	return mv;
}
}




