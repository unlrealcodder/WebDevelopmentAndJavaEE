package JavaEEHelloWorld_p1;

public class Verification {

	public boolean isValid(String user, String pass) {
		boolean result;
		DataConnect con=new DataBaseConnect();
		result=con.isUserVaiable(user, pass);
		
		
	
		
		if(result==true) {
			System.out.println("valid");
			return true;
		}
		else {
			System.out.println("invalid");
			return false;
		}
	}
}
