package JavaEEHelloWorld_p1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		System.out.println("welcome to the servlets");
		String user=req.getParameter("userid");
		String pass=req.getParameter("password");
		
		System.out.println("username is: "+user);
		System.out.println("username is: "+pass);
		
		Verification obj=new Verification();
		boolean output=obj.isValid(user, pass);
		
		PrintWriter out=res.getWriter();
		
		if(output==true) {
			out.println("<h1>valid!!!</h1>");
		}
		else {
			out.println("invalid!!!");
		}
	}
}     