package com.bitwise.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.DispatcherType;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class Filter
 */
/*@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/Filter" }, servletNames = { "GetParam" })*/
public class Filter implements javax.servlet.Filter {

    /**
     * Default constructor. 
     */
    public Filter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

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
