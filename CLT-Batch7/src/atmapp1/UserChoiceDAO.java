package atmapp1;

import java.util.Scanner;

public class UserChoiceDAO 
{
	String email,password,color;
	Scanner s = new Scanner(System.in);
	void choiceOne() //Registeration Page
	{
		System.out.println("Enter email address : ");
		email = s.next();
		PojoUser.setEmail(email);
		if(PojoUser.getDefaultEmail().equalsIgnoreCase(email))
		{
			
			do
			{
				System.out.println("email already exists!!");
				System.out.println("Enter email address again : ");
				email = s.next();
				PojoUser.setEmail(email);
			}
		     while((PojoUser.getDefaultEmail().equals(email)));
		}
		
		else
		{
			PojoUser.setEmail(email);
		}
		

		
		System.out.println("Enter Password : ");
		password = s.next();
		System.out.println("Re-type Password : ");
		String tempPassword = s.next();
		if(!(tempPassword.equals(password)))
		{
			do
			{
				System.out.println("Password doesn't match!!");
				System.out.println("Re-type Password : ");
				tempPassword = s.next();
				PojoUser.setPassword(tempPassword);
			}
			while(!(tempPassword.equals(password)));
			
		}
		
		else
		{
			PojoUser.setPassword(tempPassword);
		}
		
		System.out.println("What is your favourite color ? ");
		color = s.next();
		System.out.println(color+" is your security key, in case if you forget your password. ");
		PojoUser.setColor(color);
		
		System.out.println(" ");
		System.out.println("Registration Successful!!");
		System.out.println("\n");
		Controller.tryCatch();
	}
	
	void choiceTwo() //Login Page
	{
		System.out.println("Enter User ID : ");
		email = s.next();
		if(!(email.equals(PojoUser.getEmail())))
		{
			System.out.println("No such email found, please register!");
			Controller.tryCatch();
		}
			System.out.println("Enter Password : ");
			String pass = s.next();
			if(!(pass.equals(PojoUser.getPassword())))
					{
						do
						{
							System.out.println("Wrong Password input!");
							System.out.println("Enter Password again : ");
							pass = s.next();
							
						}while(!(pass.equals(PojoUser.getPassword())));
						
					}
			
			System.out.println("Login Successful!");
			MessagePrintService1.message2();
		
	}
	
	void choiceThree() //Forget Password
	{

			System.out.println("Enter Your ID : ");
			String tempID = s.next();
			PojoUser.setEmail(tempID);
			if(!(PojoUser.getEmail().equalsIgnoreCase(tempID)))
			{
				System.out.println("No such ID found!");
				Controller.tryCatch();
			}
			
			System.out.println("Enter your security key :");
			String tempSecurity = s.next();
			PojoUser.setColor(tempSecurity);
			if(!(PojoUser.getColor().equalsIgnoreCase(tempSecurity)))
			{
				System.out.println("Wrong Security Password, please try again !");
				Controller.tryCatch();
			}
			
			System.out.println("Enter new password : ");
			String tempNewPass = s.next();
			System.out.println("Retype Password :");
			String tempNewPass2 = s.next();
			
			if(!(tempNewPass.equals(tempNewPass2)))
			{
				System.out.println("Password doesn't match!");
				Controller.tryCatch();
			}
			
			System.out.println("What is your favourite colour? ");
			color = s.next();
			System.out.println(color+" is your security key, in case if you forget your password. ");
			PojoUser.setColor(color);
			
			System.out.println("\n Your password has been reset successfully.");
			Controller.tryCatch();
		}
		
		
	
	
	void choiceFour() //Logout(Exit)
	{
		System.out.println("Logout Successfully!!! \n");
		System.exit(0);
	}
	
	
	
}
