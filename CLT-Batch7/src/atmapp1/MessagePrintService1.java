package atmapp1;
import java.util.Scanner;

public class MessagePrintService1 
{
	static int choice,rand=0;
	static PojoUser userRef = new PojoUser();
	static ChoiceService1 refChoice = new ChoiceService1();
	static Scanner s = new Scanner(System.in);
	static void message()

	{
				System.out.println("User Home Page : ");
				System.out.println("1. Register");
				System.out.println("2. Login");
				System.out.println("3. Forget Password");
				System.out.println("4. Logout(exit) ");
				System.out.println(" ");
				System.out.println("Enter Your Choice : ");
				
	}
	
	static void message2()
	{
		
		while(true)
		{
			try 
			{
				System.out.println("Type 1 : Check Available Bank Balance ");
				System.out.println("Type 2 : Deposit Amount ");
				System.out.println("Type 3 : Withdraw Amount ");
				choice = s.nextInt();
				userRef.setChoice(choice);
				LoginPageDAO.loginOption();
				
			} 
			catch (Exception e) 
			{
				System.out.println("Wrong input, try again");
				s.next();
				continue;
				
			}
			
		}
		
	
		
		
	}
	
	static void wishToContinue()
	{
		String ans;
		System.out.println("Wish to Continue? (y/n) : ");
		ans = s.next();
		if(ans.equalsIgnoreCase("y"))
		{
			MessagePrintService1.message2();	
		}
		else if(ans.equalsIgnoreCase("n"))
		{
			System.out.println("Thanks for Banking with Us !!!\n");
			Controller.tryCatch();
		}
		else
		{
			wronginput();
		}
	}
	
	static void wronginput()
	{
		System.out.println("Choice not available, please try again!");
		wishToContinue();
	}
	
	
}
