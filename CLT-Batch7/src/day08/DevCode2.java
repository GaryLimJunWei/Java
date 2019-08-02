package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DevCode2 {
	
	//1. handle NullPointerException (Calling a method etc using a reference while the ref is null)
	//2. handle NumberFormatException(BufferedReader) (While the input should be int but passing String)
	//3. handle InputMismatchException (Scanner) 
	
	
	static void logic() throws NumberFormatException, IOException
	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter number : ");
//		int number = s.nextInt();
//		System.out.println(number);
		
//		
		try 
		{
			String s = null;
			s.equals("Hello");
			System.out.println(s);
		} 
		catch (Exception e) 
		{
			
		}
		
	}
}
