package com.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.Dao.loginDao;
@WebServlet("/login")
public class Login extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		
	String uname=	req.getParameter("uname");
	String pass=	req.getParameter("pass");
	
	//loginDao dao = new loginDao();
	
	if(uname.equals("akash")&pass.equals("12345")) {

	
		//if(dao.check(uname,pass)) {
			
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			res.sendRedirect("welcome.jsp");
			
		}
		else {
			res.sendRedirect("login.jsp");
		}
	} 
		
	}
	
	
	
	


