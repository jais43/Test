package com.bitwise.ShoppingCart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoginValidation
 */
/*@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/LoginValidation" }, servletNames = { "Login" })*/
public class LoginValidation implements Filter {

    /**
     * Default constructor. 
     */
    public LoginValidation() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter pw = response.getWriter();
		   response.setContentType("text/html");
		   
		   String user = request.getParameter("uname");
		   String pass = request.getParameter("passsword");
		   
			if(user.equals("jaspreet")&&pass.equals("admin@123"))  
				chain.doFilter(request, response);
			
			else
			{	  pw.println("Invalid username or password");
					pw.println("Try Agian....");
				   request.getRequestDispatcher("Login.jsp").include(request, response);
				 
			   
				}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
