package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee
{
	String name;
	int age;
	public Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() 
	{
		return name + " " +age;
	}
}

public class ArrayListExample05 
{

	public static void main(String[] args) 
	{
		List refList = new ArrayList();
		refList.add(new Employee("Amit",56));
		refList.add(new Employee("Don",19));
		refList.add(new Employee("Old Dog",61));
		refList.add(new Employee("Knn Oh",562));
		refList.add(new Employee("Amit2",562));
		
		//Sort by Name
		Collections.sort(refList,new Comparator<Employee>() 
				{

					@Override
					public int compare(Employee o1, Employee o2) {
						// TODO Auto-generated method stub
						return o1.getName().compareTo(o2.getName()); //STring ==> we use compareTo()
					}
					
				});// end of sort
		
		Iterator itr = refList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}//end of Iterator
		
		
		Collections.sort(refList, new Comparator<Employee>()
				{

					@Override
					public int compare(Employee o1, Employee o2) 
					{
						return o1.getAge() - o2.getAge(); // Int ==> We use just the " - " 
					}
			
				}); //end of sort
		System.out.println("\n");
		Iterator itr2 = refList.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}//end of Iterator
		
		
		
		
		
		
	}
	
	

}

