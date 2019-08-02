package atmapp1;

import java.util.Scanner;

public class ChoiceService1 
{
	Scanner s = new Scanner(System.in);
	double temp=0.0;
	static void option(PojoUser userRef)
	{
			
		try 
		{
			UserChoiceDAO refChoiceOne = new  UserChoiceDAO();
			switch(PojoUser.getChoice())
			{
			case 1 : refChoiceOne.choiceOne();
					break;
			case 2 : refChoiceOne.choiceTwo();
					break;
			case 3 : refChoiceOne.choiceThree();
					break;
			case 4 : refChoiceOne.choiceFour();
			        break;
			default: System.out.println("Wrong input, try again1 : \n");
			Controller.tryCatch();
			         
			         break;
			}
		}
			catch (Exception e) 
		{
			System.out.println("wrong input!");
		}
		
			
			
		} 
			
		
		
		
		
		
	}
	
	

	
	

