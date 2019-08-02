package day01;

class User
{
	
	
}

class UserLogic
{
	
}

class UserApplication
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		
	}
}

class StaticDemo 
{
	static int number = 10; //static variable
	int number2 =30; // non-static variable
} // end of StaticDemo

public class Example02 
{

	public static void main(String[] args) 
	{
		
		System.out.println("HiHi");
		UserApplication.main(null);
		
		System.out.println(StaticDemo.number);
		
		
		
		StaticDemo obj = new StaticDemo();
		System.out.println(obj.number2);

	}

}
