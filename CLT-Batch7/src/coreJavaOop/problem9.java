package coreJavaOop;

import java.util.Arrays;
import java.util.List;

public class problem9 
{

	public static void main(String[] args) 
	{
		String[] alphabet = new String[]{"A", "B", "C"};
		
		// METHOD 1 ---------------------------------------

        // Convert String Array to List
//         List<String> list = Arrays.asList(alphabet); 
//        
//        if(list.contains("A"))
//        {
//            System.out.println("Hello A");
//
//        }
		
		// --------------------------------------------------
		
		
		// METHOD 2 using streams
		boolean result = Arrays.stream(alphabet).anyMatch("A"::equals);
		if (result) 
		{
			System.out.println("A is in the Arrray");
		}
		else
		{
			System.out.println("There isn't such value in the Array");
		}
		
		//In this case, if the Array contains the character "A" , it prints
		
		
	}

}
