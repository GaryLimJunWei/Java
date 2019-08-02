package atmapp1;

import java.util.Scanner;

public class LoginPageDAO 
{
	static void loginOption()
	{
		double temp;
		Scanner s = new Scanner(System.in);
		switch(PojoUser.getChoice())
		{
		case 1 : System.out.println("Available Balance  : $"+PojoUser.getBankAmount());
                 MessagePrintService1.wishToContinue();
                 break;
		case 2 : System.out.println("Enter Amount : ");
				 temp = s.nextDouble();
				 if(temp<=0.0)
					{
						System.out.println("Amount can't be negative!!");
						MessagePrintService1.message2();	
					}
					System.out.println("$"+temp+" dollars deposited successfully!!");
					PojoUser.depositAmount(temp);
					MessagePrintService1.wishToContinue();
					break;
					
		case 3 : System.out.println("Enter Amount : ");
				 temp = s.nextDouble();
		
					if(temp<=0)
					{
						System.out.println("Amount can't be negative!!");
						System.out.println("Enter Amount : ");
						temp = s.nextDouble();
					}
					else if(temp>PojoUser.getBankAmount())
					{
						System.out.println("Sorry!! insufficient balance");
						MessagePrintService1.wishToContinue();
					}
						PojoUser.withdrawAmount(temp);
						System.out.println("Transcation Successful!!");
						MessagePrintService1.wishToContinue();
						break;
		}
					
		
		
		
		
			
		}
}
