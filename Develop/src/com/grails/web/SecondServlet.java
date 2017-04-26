package com.grails.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//	PrintWriter write=response.getWriter();
		
		Connection con=(Connection) Main.getConnection();
		PreparedStatement pstmt=null;
		String sqlQuery = "INSERT INTO data(supplier,duedate,postatus,priority,items,shipfrom,transresp,country,ponumber) VALUES (?, ?, ? ,? ,?, ?, ? ,? ,?)";
		
		
		try{
			pstmt = (PreparedStatement) con.prepareStatement(sqlQuery);
		}catch(SQLException e){
			System.out.println("Failed to create Prepared statement");
		}
		try {
			
			pstmt.setString(1, request.getParameter("designatedmode"));
			pstmt.setString(2, request.getParameter("duedate"));
			pstmt.setString(3, request.getParameter("status"));
			pstmt.setString(4, request.getParameter("priority"));
			pstmt.setString(5, request.getParameter("items"));
			pstmt.setString(6, request.getParameter("shipfrom"));
			pstmt.setString(7, request.getParameter("transresp"));
			pstmt.setString(8, request.getParameter("country"));
			pstmt.setString(9, request.getParameter("ponumber"));
			response.sendRedirect("nest");
		} catch (SQLException e) {
			System.out.println("Exception in setString");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("exception in executeupdate");
			// TODO Auto-generated catch block
			e.printStackTrace();
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
