package atmapp1;

import java.util.Scanner;

import bankServices.UserChoiceImpl;
import pojo.PojoUser;

public class Controller 
{
	
	public static void main(String[] args) 
	{	
		
		tryCatch();
		
		
	}
	
	public static void tryCatch()
	{
		int choice = 0;
		PojoUser userRef = new PojoUser();
		UserChoiceImpl refChoice = new UserChoiceImpl();
		Scanner s = new Scanner(System.in);
		
		while(true) //true means continue forever till there's a break
		{
			try 
			{
				MessagePrintService1.message();
				choice = s.nextInt();
				userRef.setChoice(choice);
				refChoice.option(userRef, s);
			} 
			catch (Exception e) 
			{
				System.out.println("Invalid input, try again");
				s.next(); //reset the input
				continue; //when it catches the exception,break is automatic
				//continue let the loop continues
			}
			break;
		}
	}

}
