package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample2 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		List refList = new ArrayList();
//		refList.add("Charles");
//		refList.add("Jerret");
		
		while(true)
		{
			System.out.println("Enter a name : ");
			String name=s.next();
			refList.add(name);
			if(name.equalsIgnoreCase("exit"))
			{
				System.out.println("System end");
				break;
			}
			for(int i=0; i<refList.size()-1;i++)
			{
				if(name.equalsIgnoreCase((String) refList.get(i)))
				{
					refList.remove(name);
					System.out.println("Name already exists!");
				}
				
			}
			
			
			System.out.println(refList);
			
		}
		
		

		
	}

}
