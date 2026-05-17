package p1;

import java.util.*;

class InvalidUsernameException extends Exception{
      public String toString() {	
    	  return "Please Enter Valid UserName!";
      }
}

class InvalidPasswordException extends Exception{
	public String toString() {
		return "Invalid PassWord.Try Again!";
	}
}

class Login{
	String userName="pratik";
	String passWord="123456789";
	
	
	
	public void validateUserName(String userName) throws InvalidUsernameException {
		if(!this.userName.equalsIgnoreCase(userName)) {
			throw new InvalidUsernameException();
		}
	}
	
public void validatePassWord(String pass) throws InvalidPasswordException {
		if(!this.passWord.equalsIgnoreCase(pass)) {
			throw new InvalidPasswordException();
		}
	}
}
public class LoginValidationUsingCustomExceptions {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		Login l1 = new Login();
		
		System.out.println("Enter User Name: ");
		String userName = sc.nextLine();
		
		try {
			l1.validateUserName(userName);
		}
		catch(InvalidUsernameException iue) {
			System.out.println(iue);
			System.out.println("Program Terminated!");
		}
		
		int count=3;
		
		while(count>0) {
			
			System.out.println("Enter PassWord: ");
			
			String pass = sc.nextLine();
			
			try {
				l1.validatePassWord(pass);
				
				System.out.println("Login Successful!");
				break;
			}
			catch(InvalidPasswordException ipe) {
				
				count--;
				
				if(count==0) {
					System.out.println("Account Locked!");
				}else {
					System.out.println(ipe);
				}
				
			}
		}
		
	}

}
