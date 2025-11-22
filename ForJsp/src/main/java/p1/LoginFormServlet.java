package p1;


import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginFormServlet extends HttpServlet{
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		VerificationLoginForm obj=new VerificationLoginForm();
		boolean output=obj.isValid(user, pass);
		
		PrintWriter out=resp.getWriter();
		
		
		
		
		
		
		if(output==true) {
			//resp.sendRedirect("Home.html");
			// this is for connect with second servlet
			// don't use /-> slash at time of use ,use it at time of define
			// we get dispatcher at this stage
			RequestDispatcher rd=req.getRequestDispatcher("credit");
			// for send  dispatcher to next server
			rd.forward(req, resp);
			
		}
		else {
			resp.sendRedirect("LoginForm.html");
		}
		
	}
}