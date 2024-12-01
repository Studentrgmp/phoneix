package com.Phoneix.controller;

// file:///C:/Users/SRI%20BALAJI/Desktop/Web/tailwind%20css/html/webpage.htm

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Phoneix.dao.PhoneixDao;
import com.Phoneix.dto.Phoneix;

@WebServlet("/update")
public class Update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String Password;
		String Email = req.getParameter("Email");
		String New_Password = req.getParameter("New_Password");
		String Confirm_Password = req.getParameter("Confirm_Password");
		PhoneixDao dao = new PhoneixDao();

		Phoneix phoneix = (Phoneix) dao.findById(Email);

		String FN = phoneix.getFrist_Name();
		String LN = phoneix.getLast_Name();
		String Address = phoneix.getAddress();

		if (New_Password.equals(Confirm_Password)) {
			Password = New_Password;
			phoneix.setPassword(Password);
			phoneix.setAddress(Address);
			phoneix.setEmail(Email);
			phoneix.setFrist_Name(FN);
			phoneix.setLast_Name(LN);
			dao.update(phoneix);
			System.out.println(FN + " " + LN + " " + Email + " " + Password + " " + Address);
			resp.sendRedirect("login.html");
		} else {
			resp.getWriter().print(
					"Please re-enter your password in the 'Confirm Password' field to ensure it matches the password you just created.");
		}
	}
}
