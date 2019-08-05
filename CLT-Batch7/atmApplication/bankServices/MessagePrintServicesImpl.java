package bankServices;

import java.util.Scanner;

import controller.Controller;
import pojo.PojoUser;


public class MessagePrintServicesImpl implements MessagePrintServices 
{
	int choice;
	public void message(PojoUser userRef,Controller refControl)

	{
				System.out.println("User Home Page : ");
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Forget Password");
				System.out.println("4. Logout(exit) ");
				System.out.println(" ");
				System.out.println("Enter Your Choice : ");
				
	}
	@Override
	public void message2(PojoUser userRef, Scanner s,Controller refControl) 
	{
		while(true)
		{
			try 
			{
				System.out.println("Type 1 : Check Available Bank Balance ");
				System.out.println("Type 2 : Deposit Amount ");
				System.out.println("Type 3 : Withdraw Amount ");
				choice = s.nextInt();
				userRef.getRefChoiceSvc().loginoption(choice,userRef,s,refControl);
				
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong input, try again");
				s.next();
				continue;
				
			}
			
		}
		
		
	}
	
	

	
		public void wishToContinue(PojoUser userRef,Scanner s,Controller refControl)
	{
		String ans;
		try 
		{
			System.out.println("Wish to Continue? (y/n) : ");
			ans = s.next();
			if(ans.equalsIgnoreCase("y"))
			{
				message2(userRef,s,refControl);	
				
			}
			else if(ans.equalsIgnoreCase("n"))
			{
				System.out.println("Thanks for Banking with Us !!!\n");
				refControl.adminController(refControl);
			}
			else
			{
				System.out.println("Wrong input! Try again");
				userRef.getRefMsg().wishToContinue(userRef, s,refControl);
			}
		
				
				
		} 
		catch (Exception e) 
		{
			System.out.println("Wrong input!!");
			userRef.getRefMsg().message2(userRef, s,refControl);
		}
		
	}
		






		
		

}
