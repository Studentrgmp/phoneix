package com.Phoneix.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Phoneix.dao.PhoneixDao;
import com.Phoneix.dto.Phoneix;

@WebServlet("/singup")
public class CreateAccount extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String password;
		String Frist_Name = req.getParameter("Frist_Name");
		String Last_Name = req.getParameter("last_Name");
		String Email = req.getParameter("email");
		String Address = req.getParameter("address");
		String Create_Password = req.getParameter("Create_Password");
		String Confirm_Password = req.getParameter("Confirm_Password");

		Phoneix phoneix=new Phoneix();
		PhoneixDao dao=new PhoneixDao();
		Object bl=dao.findById(Email);
		if(bl.equals("")) {
			if(Create_Password.equals(Confirm_Password)) {
				password=Create_Password;
				phoneix.setFrist_Name(Frist_Name);
				phoneix.setLast_Name(Last_Name);
				phoneix.setPassword(password);
				phoneix.setAddress(Address);
				phoneix.setEmail(Email);
				System.out.println(Confirm_Password+" "+Create_Password);
				dao.insert(phoneix);
				resp.sendRedirect("login.html");
			}
			else {
				resp.sendRedirect("mismatch.html");
			}
		}
		else {
			resp.sendRedirect("user.html");
		}		
	}

}
