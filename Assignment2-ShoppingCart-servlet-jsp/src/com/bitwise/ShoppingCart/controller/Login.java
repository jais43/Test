package com.bitwise.ShoppingCart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(true);
		//session.setMaxInactiveInterval(1*60);
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("password");
		
			
		if (session.isNew()) {
			
			session.setAttribute("username",name );
			session.setAttribute("password",pass );
			System.out.println("new session");
			request.getRequestDispatcher("SelectProduct.jsp").forward(request, response);
			pw.println("new session");
		}
		
		else{
		name=	(String) session.getAttribute("username");
		pass=   (String) session.getAttribute("password");
		session.getAttribute("pet");
		pw.println("old session");
		request.getRequestDispatcher("View.jsp").forward(request, response);
		}
		
		
		
		
	}
	}


