package sesssionTrackingpackage;

import java.sql.*;

public class ST_DataBaseConnect implements ST_DataConnect {

    @Override
    public boolean isUserAvailable(String user, String pass) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/company1?user=root&password=aanand@M29"
            );

            String query = "SELECT * FROM login WHERE userid=? AND password=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            return rs.next();  
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
