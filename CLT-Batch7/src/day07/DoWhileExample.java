package day07;

import java.util.Scanner;

public class DoWhileExample
{

	public static void main(String[] args) 
	{
		String ans;
		do
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Name : ");
			String name = s.next();
			
			System.out.println("You have entered : " +name);
			
			System.out.println("Wish to continue : (yes/no)");
			ans = s.next();
			
		}while(ans.equalsIgnoreCase("yes"));
		
		System.out.println("Thank You!!!");
	}

}
