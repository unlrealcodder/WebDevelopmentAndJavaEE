package sesssionTrackingpackage;



import java.io.IOException;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/credit")
public class ST_Credit extends HttpServlet {

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	
    	HttpSession session=req.getSession();
    	System.out.println(session.getId());
    	//System.out.println(session.getAttributeNames());
   
    	List<String> friendnames=(List<String>) session.getAttribute("listofname");
    	resp.sendRedirect("Home.jsp");
    	System.out.println(friendnames);
        System.out.println("Inside Credit Servlet");
    }
}
