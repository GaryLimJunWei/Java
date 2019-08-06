package controller;

import java.util.Scanner;
import pojo.PojoUser;


public class Controller 
{
	PojoUser userRef = new PojoUser();
	Scanner s = new Scanner(System.in); //Passing the Scanner Object to lessen the heap memory
	public void adminController(Controller refControl)
	{
		int choice = 0;
		while(true) //true means continue forever till there's a break
		{
			try 
			{
				userRef.getRefMsg().message(userRef, refControl);
				choice = s.nextInt();
				option(choice,refControl); 
//				Passing the object reference so we do not need to create multiple objects											
			} 
			catch (Exception e) 
			{
				System.out.println("Invalid input, try again");
				s.next(); //reset the input
				continue; //when it catches the exception,break is automatic
				//continue let the loop continues
			}
			break; //This break will stop the while loop
		}
	}
	
	
	public void option(int choice,Controller refControl)
	{
		

			try 
			{ //This is where the user choice will determine what is next logic
				switch(choice)
				{
				case 1 : userRef.getRefChoiceSvc().choiceOne(userRef, refControl, s);
						break;
				case 2 : userRef.getRefChoiceSvc().choiceTwo(userRef,refControl, s);
						break;
				case 3 : userRef.getRefChoiceSvc().choiceThree(userRef,refControl,s);
						break;
				case 4 : userRef.getRefChoiceSvc().choiceFour();
				        break;
				}
			}
				catch (Exception e) 
			{
				System.out.println("wrong input!");
				adminController(refControl);
			}
	
	
	}

}
