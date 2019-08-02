package day01;
import java.util.Scanner;

//class User
//{
//	String userid,password;
//	admin = "admin";
//	password = "1234";
//	// userID take as String
//	// userpassword take as String
//}



public class UserLoginAuthentication 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.println("Enter User ID : ");
		String UserName = s.next();
		
		System.out.println("Enter Password : ");
		String Userpassword = s.next();
		
//		AuthenticationLogic ref = new AuthenticationLogic();
//		ref.userInput(UserName, Userpassword);
		
	
		new AuthenticationLogic().userInput(UserName, Userpassword);
		// To call values of variable from a static method to a non-static method, 
		// need to create an object
		
	}

}

class AuthenticationLogic 
{
	String userID,userPassword; 
	boolean status;
	
	public void userInput(String ID, String userPassword) // we are going to hold the value
	{
		this.userID = ID; // this.globalVariable = localvaiable (if both names are same)
		this.userPassword = userPassword; // globalVariable = localvariable(if names are different)
		
		validateUser();
		logic();
		
	}
	
	public boolean validateUser()
	{
		if(userID.equals("admin") && userPassword.equals("1234"))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
		
		
	}
	// write a logic to validate user
	
	
	public void logic()
	{
		if(status==true)
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	
	
}



