package p1;

public class VerificationLoginForm {
public boolean isValid(String user,String pass) {
	boolean result;
	DataConnect con =new DataBaseConnect();
	result=con.isUserAvailable(user, pass);
	
	if(result==true) {
		System.out.println("valid for server on console");
		return true;
	}
	else {
		System.out.println("invalid for server on console");
		return false;
	}
}
}
