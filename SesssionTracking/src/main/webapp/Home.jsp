<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>Insert title here</title>
</head>
<body>
<%-- below written text is simple html text . it will diplay as it is on browser --%>
this is where the output will be displayed.
<br>

<%-- percentage is used to write java code inside the jsp
and which will be display on the java console 
And this is called as scriptlet.

we if create any objecct in that scriplet we cant import java.util package
and also for execution jvm needs bytecode means .class file 
we will get from .java source file so we need java file for that  
internally server create source file named as Home.java at run time

and convert the code written iside the jsp will be converted into java code at runtime by the server


work of conversion performedd by the jspc (jsp compiler)
jspc converts jspfile to java file

jspc converts jsp into servlets 
means we can write java code and html code both in the servlet means jspc convert jsp to servlet
 --%>
<% System.out.println("will this display??? of course it will display!!!");
	out.println("this is on broswer");
		
		%>
		
		<%List<String> data=(List) session.getAttribute("listofname");
		out.println(data);
		%>

</body>
</html>