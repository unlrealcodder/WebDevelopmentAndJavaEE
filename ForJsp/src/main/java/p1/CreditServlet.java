package p1;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/credit")
public class CreditServlet extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse resp) throws IOException  {
	System.out.println("second servlet");
	
}
}
