package day03;

class MasterCard
{
	static void loginAuthentication1()
	{
		System.out.println("I am in MasterCard => loginAuthentication1");
	}
	
	 void loginAuthentication2()
	{
		System.out.println("I am in MasterCard => loginAuthentication2");
	}
}// end of MasterCard

class DBSBank extends MasterCard // we use extends keywords to call parent class from child class
{

	static void loginAuthentication1()
	{
		System.out.println("I am in visa => loginAuthentication1");
	}
	
	 void loginAuthentication2()
	{
		System.out.println("I am in visa => loginAuthentication2");
	}
	
	
} //ends of DBSBank



public class inheritance 
{

	public static void main(String[] args) 
	{
		
		 MasterCard ref = new DBSBank(); //upcasting
		 ref.loginAuthentication2(); // non-static will call child class
		 ref.loginAuthentication1(); // static will call parent
	}

}
