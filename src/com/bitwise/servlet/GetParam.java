package com.bitwise.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class GetParam
 */
@WebServlet("/GetParam")
public class GetParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public GetParam() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   
	
			
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		//session.setMaxInactiveInterval(1*60);
		
		String name = request.getParameter("uname");
		String pass = request.getParameter("password");
		
			
		if (session!=null) {
			name=	(String) session.getAttribute("username");
			pass=   (String) session.getAttribute("password");
			System.out.println("session old");
			request.getRequestDispatcher("ViewProfile.jsp").forward(request, response);
		}
		
		else{
		
			
		session.setAttribute("username",name );
		session.setAttribute("password",pass );
		request.getRequestDispatcher("EducationInfo.jsp").forward(request, response);
		System.out.println("session new");
		
		
		
		
		}
	}
}


