package day08;

import java.util.Scanner;
import java.util.Set;

class Person
{
	int id;
	String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
//	public Person(String name,int id)
//	{
//		this.id = id;
//		this.name = name;
//	}
//	
//	@Override
//	public String toString() // It converts your object to String value(So you can print)
//	{
//		
//		return id + " "+name;
//	}
}



public class ArrayExample 
{

	public static void main(String[] args) 
	{
		String str [] = {"Physics","Chemistry","Maths"};
		
//		//for loop
//		for (int i = 0; i < str.length; i++) 
//		{
//			System.out.println(str[i]);
//		}
//		System.out.println("     \n");
//		
//		//foreach loop
//		for (String string : str) 
//		{
//			System.out.println(string);
//		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many records you want to enter : ");
		int number = s.nextInt();
		Person pRef[] = new Person[number];
				
		for (int i = 0; i < pRef.length; i++) 
		{
			System.out.println("Enter your ID : ");
			int id = s.nextInt();
			System.out.println("Enter your name : ");
			String name = s.next();
//			pRef[i] = new Person(name,id);
			
			Person p = new Person();
			p.setId(id);
			p.setName(name);
			
			pRef[i] = p;
			
		} // End of for loop
		
		//Creating an object of type Person
		//
		
		for (Person person : pRef) 
		{
			System.out.println(person.getId()+ " "+person.getName()); // person is reference of Person class
		}

	}

}
