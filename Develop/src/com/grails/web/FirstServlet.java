package com.grails.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private static final String userId="deva",pass="neva";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter write=response.getWriter();
		
		String id=request.getParameter("user");
		String pw=request.getParameter("pass");
		
	
	/*	String pnum = request.getParameter("P.O. Number");
		String supp = request.getParameter("Supplier");
		String ddate = request.getParameter("Due Date");
		String pstat = request.getParameter("P.O.Status");
		String item = request.getParameter("Item(s)");
		String sfrom = request.getParameter("*Ship From");
		String sto = request.getParameter("Ship To");
		String trans = request.getParameter("Trans Resp");*/
		
		if(userId.equalsIgnoreCase(id))
		{
			if(pass.equalsIgnoreCase(pw))
			{
				response.sendRedirect("New1.jsp");
			}
			else
				write.println("Wrong Password. try to give right one ");
		 // request.getRequestDispatcher("/FirstJSP.jsp").forward(request, response);
		}
		
		
		
	}
	
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		doGet(request, response);
	}
}
