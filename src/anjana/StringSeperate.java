package anjana;

public class StringSeperate {

	public static void main(String[] args) {
		
		String str= "username1+password1-username2+password2-username3+password3";
		String[] pairs = str.split("-");
		
		for(String pair : pairs) {
			
			String[] userPass = pair.split("\\+");
			
			String Username = userPass[0];
			String Password = userPass[1];
			
			System.out.println("Username : " + Username );
			System.out.println("Password : " + Password );
		
		}

	}

}
