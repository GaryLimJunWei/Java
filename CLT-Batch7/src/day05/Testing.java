package day05;

import java.util.Scanner;
import java.util.Set;

class method
{
	void received() 
	{
		String password;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your password : ");
		password = s.next();
		
	
		
	}
}

class One
{
	Two refB; // null
	
	public void setRefB(Two refB) 
	{
		this.refB = refB;
	}
	
	public Two getRefB() 
	{
		return refB;
	}
	
	
	
	
}

class Two
{
	Three refC;
	One refA;
	
	/*
	 * public Three getRefC() { return refC; }
	 * 
	 * public void setRefC(Three refC) { this.refC = refC; }
	 */
	
	void determine(One refA) // ref will hold password
	{
		boolean status;
		
		
//		if(refB.getPassword().equals("1234"))
//		{
//			status=true;
//		}
//		else
//		{
//			status=false;
//		}
//		refC.display(status);
		
	}
}

class Three
{
	void display(boolean status)
	{
		if(status=true)
		{
			System.out.println("You have succeed!");
		}
		else
		{
			System.out.println("Wrong input");
		}
		
	}
	
	
}

public class Testing 
{

	public static void main(String[] args) 
	{
		// step 1
		
		// create object of class A, b and C
		
		// step : 2
		
		// call setter method
		
		
		// step : 3
		
		// determine method => if true then call getter method else show not data
		
		
		

	}

}
