
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. there should be only 1 occurance of @ and .
		//2. there should be minimum 4 characters before @
		//3. min 3 chars between @ and .
		//4. min 2 chars after .
		// need optimised o/p (why you used the extra methods, conditions, etc)
		
		String email = "pratiksha.mahendra@ibm.com";
				//"zubair@.mail.com";
		int iat = email.indexOf('@');
		int idot = email.indexOf('.');
		
		if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') 
				&& iat > 3 && idot > (iat +3) && email.length() > (idot + 2))
			System.out.println("Valid Email");
		else
			System.out.println("Invalid Email");
		
				
	}

}
