package sesssionTrackingpackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")
public class St_LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws  ServletException, IOException {
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
		ST_Verification obj=new ST_Verification();
		boolean output=obj.isValid(user, pass);
		List<String> names=new ArrayList<>();
		names.add("mahesh");
		names.add("adesh");
		names.add("raj");
		
		HttpSession ses=req.getSession();
		// push data into session
		ses.setAttribute("listofname", names);
		
		System.out.println(ses.getId());
		
		
		
		
		PrintWriter out=resp.getWriter();
		
		
		
		
		
		if(output==true) {
			//resp.sendRedirect("Home.html");
			// this is for connect with second servlet
			// don't use /-> slash at time of use ,use it at time of define
			// we get dispatcher at this stage
			RequestDispatcher rd=req.getRequestDispatcher("/credit");
			// for send  dispatcher to next server
			rd.forward(req, resp);
			
			
		}
		else {
			//resp.sendRedirect("ST_login.html");
		}
		
	}
}



