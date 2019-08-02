package questions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pojo.PojoUser;
import pojo.User;

public class Main 
{

	public static void main(String[] args) 
	{
		int score=0;
		List<Questions> question = new ArrayList<Questions>();
		User refGet = new User();
		
		Questions question1 = new Questions("What is the Capital of Russia??","A. Moscow","B. St Petersburg","C. Novosibirsk Oblast","D. Sverdlovsk");
		Questions question2 = new Questions("What is the Largest Planet??","A. Earth","B. Jupiter","C. Pluto","D. Venus");
		Questions question3 = new Questions("Which is the Largest Dog?","A. Husky ","B. Poodle","C. English mastiff","D. Terrier");
		
		question.add(question1);
		question.add(question2);
		question.add(question3);
		
		int value = 0;
		System.out.println(question.get(value));
		Scanner s = new Scanner(System.in);
		String option;
		
		try
		{
			for (int i = 0; i <=question.size()-1; i++) 
			{
				System.out.println("\nEnter a value :");
				option = s.next();

				if(value==0)
				{
					refGet.setAns("A");
				}
				else if(value==1)
				{
					refGet.setAns("B");
				}
				else if(value==2)
				{
					refGet.setAns("C");
				}
				else
				{
					System.out.println("");
				}
				
				
				
				if(option.equalsIgnoreCase(refGet.getAns()))	
				{
					System.out.println("Correct Answer!");
					score++;
					refGet.getScore(score);
					System.out.println("Score = "+refGet.getScore(score));
				}
				else
				{
					System.out.println("Wrong Answer!");
					System.out.println("Score = "+refGet.getScore(score));
				}
				
				System.out.println("\n"+question.get(value+1));
				value++;
		}
		
		}
		catch(Exception e)
		{
			System.out.println("\nEnd of Question");
			System.out.println("Your total score is "+refGet.getScore(score));
			
			
			

		}
		
		
		
		
		
		
	}

}
