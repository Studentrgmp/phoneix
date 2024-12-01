package com.Phoneix.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Phoneix.dao.PhoneixDao;

@WebServlet("/Login")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email= req.getParameter("email");
		String password=req.getParameter("password");
		
		System.out.println(email+password);
		PhoneixDao dao=new PhoneixDao();
		Object r = dao.findById(email,password);
		 if(r.equals("")) {
			 resp.sendRedirect("invalid.html");	 
		 }
		 else {
			 resp.sendRedirect("Home.html");
		 }
	}
}
