package p1;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginSevlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		String username=req.getParameter("username");
		String password =req.getParameter("password");
		
		String validUser="admin";
		String validPassword="12345";
		
		if(username.equals(validUser)&&password.equals(validPassword)) {
			 out.println("<h2>Login Successful!</h2>");
	            out.println("<p>Welcome, " + username + "</p>");
		}
		else {
			out.println("<h2>Invalid Username or Password!</h2>");
			out.println("<a href='login.html'>Try Again</a>");
		}
		
		
	}
	
}