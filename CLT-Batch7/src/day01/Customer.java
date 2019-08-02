package day01;

public class Customer //Customer is a name of the class 
{
	
	// declare variable
	int age; // has a relationship
	String NRIC; //has a relationship
	
	 void customerDetails(int age,String NRIC) //methods
	{
		System.out.println(age);
		System.out.println(NRIC);
	}

	public static void main(String[] args) 
	{
		//create an object of customer class
		//object name is the class name
		Customer refCustomer = new Customer(); // object we create by using new operator
		
		//call the method through the reference
		refCustomer.customerDetails(10,"S9424007G");
		
		

	}

}
