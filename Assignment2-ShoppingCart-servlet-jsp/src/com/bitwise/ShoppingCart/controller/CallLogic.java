package com.bitwise.ShoppingCart.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.shoppingcart.Model.PetList;

/**
 * Servlet implementation class CallLogic
 */
@WebServlet("/CallLogic")
public class CallLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CallLogic() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		PetList Lc = new PetList((String)session.getAttribute("pet"));
		
		ArrayList list = Lc.getPet();
		session.setAttribute("slist",list);
		RequestDispatcher finalview = request.getRequestDispatcher("/View.jsp");
		finalview.forward(request, response);
		}
	

}
