package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnect implements DataConnect{
public  boolean checkUser(String user,String pass) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company1?user=root&password=aanand@M29");
		
		String query ="select * from login where userid=? and password=? ";
		PreparedStatement psmt=con.prepareStatement(query);
		psmt.setString(1, user);
		psmt.setString(2, pass);
		
		ResultSet rs = psmt.executeQuery();
		return rs.next();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}

@Override
public boolean isUserAvailable(String v1, String v2) {
	// TODO Auto-generated method stub
	return checkUser(v1,v2);
}
}
