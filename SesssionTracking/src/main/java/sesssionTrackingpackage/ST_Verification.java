package sesssionTrackingpackage;

public class ST_Verification {

    public boolean isValid(String user, String pass) {

        ST_DataConnect con = new ST_DataBaseConnect();
        boolean result = con.isUserAvailable(user, pass);

        if(result == true) {
            System.out.println("valid for server on console");
            return true;
        } else {
            System.out.println("invalid for server on console");
            return false;
        }
    }
}
