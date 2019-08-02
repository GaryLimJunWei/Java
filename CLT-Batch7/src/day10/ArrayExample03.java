package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import questions.Questions;

class Customer
{
	String name;
	Customer(String name)
	{
		this.name=name;
	}
	@Override
	public String toString() 
	{
		return name;
	}
} // end of Customer

public class ArrayExample03
{

	public static void main(String[] args) 
	{
		List<Customer> refList = new ArrayList<Customer>();
		Scanner s = new Scanner(System.in);
		
	
		
		while(true)
		{
			System.out.println("Enter Name : ");
			String name = s.next();
			refList.add(new Customer(name)); //Passing the object into an Array List
			
			if(name.equalsIgnoreCase("exit"))
			{
				System.out.println("Exit");
				break;
			}
			for (int i = 0; i <refList.size()-1; i++) 
			{
				if(name.equals(refList.get(i)))
				{
					refList.remove(name);
					System.out.println("Name already exists!");
				}
			}
			
			System.out.println(refList);
		}
		
		
		
		

	}

}
