package day04;



abstract class Visa
{
	
	abstract void login(); // abstract method, without a body, ends with a semicolon
	// abstract class it will behave like a parent class
	
	
	// if we declare any abstract method in a abstract class we must define in its sub class
		void logout()
		{
			//method with a body
		} // end of logout
		
}// end of Visa

class HSBC extends Visa // HSBC ==> child class 
{

	@Override
	void login() {
		// TODO Auto-generated method stub
		
	}
	
	//IF there is a abstract method in a abstract class, when extends you need to 
	// implement the abstract method from the abstract class
	// 

	
	
}

public class AbstractClassExample01 
{

	public static void main(String[] args) 
	{
		

	}

}
