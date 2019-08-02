package day04;

abstract class Oracle
{
	abstract void driverConnection();
}// end of Oracle

abstract class Microsoft // Microsoft and Oracle 
{
	abstract void getSoftware();
}// end of Microsoft

class MyClass
{
	void display()
	{
		Oracle ref = new Oracle() 
		{
		
			@Override
			void driverConnection()
			{
				System.out.println("Oracle Driver Connected");
			}
		}; 
		
		ref.driverConnection();
		
		Microsoft refMicrosoft = new Microsoft()
		{
			@Override
			void getSoftware()
			{
				System.out.println("Microsoft software loaded...");
			}
		};
		
		refMicrosoft.getSoftware();
		
	}
	
	//MyClass needs to access driverConnection() and getSoftware()
	// how to solve this problem?
}

public class AbstractClassExample02 
{

	public static void main(String[] args) 
	{
		
		MyClass refMyClass = new MyClass();
		refMyClass.display();
		
		
		

	}

}
