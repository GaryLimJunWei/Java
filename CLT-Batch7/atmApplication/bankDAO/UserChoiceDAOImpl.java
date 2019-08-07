package bankDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import atmDatabase.AtmDBConnection;
import controller.Controller;
import pojo.PojoUser;

public class UserChoiceDAOImpl implements UserChoiceDAO 
{
	String email,password,color;
	Connection conRef = AtmDBConnection.atmConnection();
	PreparedStatement psRef;
	//When user choice is number 1 this is the method that do the registeration
	public void choiceOne(PojoUser userRef,Controller refControl,Scanner s) //Registeration Page
	{
		System.out.println("Enter email address : ");
		email = s.next();
		userRef.setEmail(email);
		if(userRef.getDefaultEmail().equalsIgnoreCase(email))
		{
			do
			{
				System.out.println("email already exists!!");
				System.out.println("Enter email address again : ");
				email = s.next();
				userRef.setEmail(email);
			}
		     while((userRef.getDefaultEmail().equalsIgnoreCase(email)));
		}
		else
		{

			userRef.setEmail(email);
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
				userRef.setPassword(tempPassword);
			}
			while(!(tempPassword.equals(password)));
			
		}
		
		else
		{
			userRef.setPassword(tempPassword);
		}
		
		System.out.println("What is your favourite color ? ");
		color = s.next();
		System.out.println(color+" is your security key, in case if you forget your password. ");
		userRef.setColor(color);
		
		System.out.println(" ");
		System.out.println("Registration Successful!!");
		System.out.println("\n");
		
		//Connecting to Database

		
		//Putting data into Database
		try 
		{
			
			psRef = conRef.prepareStatement("insert into userinfo VALUES (?, ? , ?)");
			psRef.setString(1,userRef.getEmail() );
			psRef.setString(2,userRef.getPassword());
			psRef.setString(3,userRef.getColor() );
			psRef.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println("NULL");
		}

		
		refControl.adminController(refControl);
		
		
		
	}

// ===============================================================================================================
// ===============================================================================================================
// ===============================================================================================================
	
	//Choice Two is for Login verification 
	public void choiceTwo(PojoUser userRef, Controller refControl,Scanner s)
	{
		int value=0;
		System.out.println("Enter User ID : ");
		email = s.next();
	
		if(!(email.equalsIgnoreCase(userRef.getEmail())))
		{
			System.out.println("No such email found, please register!");
			refControl.adminController(refControl);
		}

			System.out.println("Enter Password : ");
			String pass = s.next();
			if(!(pass.equals(userRef.getPassword())))
			{	
					do
					{
						System.out.println("Wrong Password input!");
						System.out.println("Enter Password again : ");
						pass = s.next();
						
						value++;
					}while(!(pass.equals(userRef.getPassword())) || value==3);

				
						
			}
			System.out.println("Login Successful!");
			userRef.getRefMsg().message2(userRef, s,refControl);
		}
		
	
	// ===============================================================================================================
	// ===============================================================================================================
	// ===============================================================================================================
	// Choice Three is when user forget password
	public void choiceThree(PojoUser userRef,Controller refControl,Scanner s) //Forget Password
	{

			System.out.println("Enter Your ID : ");
			String tempID = s.next();
			if(!(userRef.getEmail().equalsIgnoreCase(tempID)))
			{
				System.out.println("No such ID found!");
				refControl.adminController(refControl);
			}
			
			System.out.println("Enter your security key :");
			String tempSecurity = s.next();
			if(!(userRef.getColor().equalsIgnoreCase(tempSecurity)))
			{
				System.out.println("Wrong Security Password, please try again !");
				refControl.adminController(refControl);
			}

			
			System.out.println("Enter new password : ");
			String tempNewPass = s.next();
			System.out.println("Retype Password :");
			String tempNewPass2 = s.next();
			
			if(!(tempNewPass.equals(tempNewPass2)))
			{
				System.out.println("Password doesn't match!");
				refControl.adminController(refControl);
			}
			
			System.out.println("What is your favourite colour? ");
			color = s.next();
			System.out.println(color+" is your security key, in case if you forget your password. ");
			
			System.out.println("\n Your password has been reset successfully.");
			refControl.adminController(refControl);
		}
		
		
	// ===============================================================================================================
	// ===============================================================================================================
	// ===============================================================================================================
	// Choice Four is to exit the program
	public void choiceFour() //Logout(Exit)
	{
		System.out.println("Logout Successfully!!! \n");
		System.exit(0);
	}
	
	// ===============================================================================================================
	// ===============================================================================================================
	// ===============================================================================================================
	
	//This is the option where user can choose after login
	
	
	public void loginoption(int choice,PojoUser userRef, Scanner s,Controller refControl)
	{
			double temp;
			switch(choice)
			{
			case 1 : System.out.println("Available Balance  : $"+userRef.getBankAmount());
	                 userRef.getRefMsg().message3(userRef,s,refControl);
	                 break;
			case 2 : System.out.println("Enter Amount : ");
					 temp = s.nextDouble();
					 if(temp<=0.0)
					{
						 for (int i = 0; i<=2; i++) 
						 {
							System.out.println("Amount can't be negative!!");	
							System.out.println("Enter Amount : ");
							temp = s.nextDouble();
						 }
						 userRef.getRefMsg().message2(userRef,s,refControl);
					 }
						System.out.println("$"+temp+" dollars deposited successfully!!");
						userRef.depositAmount(temp);
						userRef.getRefMsg().message3(userRef,s,refControl);
						break;
						
			case 3 : System.out.println("Enter Amount : ");
					 temp = s.nextDouble();
						if(temp<=0)
						{
							for (int i = 0; i<=2; i++) 
							 {
								System.out.println("Amount can't be negative!!");
								System.out.println("Enter Amount : ");
								temp = s.nextDouble();
							 }
							
						}
						else if(temp>userRef.getBankAmount())
						{
							System.out.println("Sorry!! insufficient balance\n");
							userRef.getRefMsg().message3(userRef,s,refControl);
							
						}
						else
						{
							System.out.println("Transcation Successful!!");
							userRef.withdrawAmount(temp);
							userRef.getRefMsg().message3(userRef,s,refControl);
							break;
						}
						
	}
	}














}







	
	
			
		

