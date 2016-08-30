package com.bitwise;


import java.security.Principal;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bitwise.service.IProductService;
 
@Controller
public class LoginController {

	@Autowired IProductService iproductservice;
	ArrayList<String> al=new ArrayList();
 
@RequestMapping(value="/main", method = RequestMethod.GET)
public String printWelcome(ModelMap model, Principal principal ) {
 
String name = principal.getName();
model.addAttribute("username", name);
return "main_page";
 
}
 
@RequestMapping(value="/login", method = RequestMethod.GET)
public String login(ModelMap model) {
 
return "login_page";
 
}
 
@RequestMapping(value="/loginError", method = RequestMethod.GET)
public String loginError(ModelMap model) {
model.addAttribute("error", "true");
return "login_page";
 
}

@RequestMapping(value="/product", method = RequestMethod.POST)
public String getProduct(ProductBean productbean,ModelMap model) {
model.addAttribute("pet", productbean.getCategory());
al.add(productbean.getCategory());
return "view";
 
}

@RequestMapping(value="/Add",method = RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView addProduct(ModelMap model,HttpSession session) {
	
	//System.out.println(al);
	session.setAttribute("cp", al);
	return new org.springframework.web.servlet.ModelAndView("Cart", "ProductList", al);
}

@RequestMapping(value="/buy")
public org.springframework.web.servlet.ModelAndView getPrice(ProductBean productbean,ModelMap model,HttpSession session) {
	if (session.isNew()) {
		String msg = "Login first";
		return new org.springframework.web.servlet.ModelAndView( "error","msg",msg);
	}
	
		session.getAttribute("cp");
		double amount=iproductservice.productprice(al);
		//System.out.println("In controller amount="+amount);
		return new org.springframework.web.servlet.ModelAndView("Buy", "Total", amount);
	
	
}

@RequestMapping(value="/remove",method = RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView removeProduct(ModelMap model,HttpSession session,HttpServletRequest req) {
	
	
	
	for (String string : req.getParameterValues("cpd")) {
		
		al.remove(string);
	};
	
	return new org.springframework.web.servlet.ModelAndView("Cart", "ProductList", al);
}

@RequestMapping(value="/logout", method = RequestMethod.GET)
public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null){    
        new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    return "redirect:/login?logout";
}



}
