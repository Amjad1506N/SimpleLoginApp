package rafshun.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null,pass=null;
		RequestDispatcher rd=null;
		long pass1=0;
		pw=res.getWriter();
		res.setContentType("text/html");
		name=req.getParameter("uname");
		pass=req.getParameter("pass");
		pass1=Long.parseLong(pass);
		
		if(name=="Amjad" ||pass1==12345678) {
			rd=req.getRequestDispatcher("/view.html");
			rd.include(req,res);
		}else {
			pw.println("wrong user");
		}
		
		pw.println("<a href='login.html'>HOME</a>");
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req,res);
	}
	

}
