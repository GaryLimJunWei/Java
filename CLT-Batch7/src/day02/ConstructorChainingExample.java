package day02;

class Laptop
{
	Laptop()
	{
		this(20);
		System.out.println("Hello I am in default constructor..");
	}
	
	Laptop(int price)
	{
		this(30,"Apple");
		System.out.println(price); //20
	}
	
	Laptop(int price,String brand)
	{
		
		System.out.println(price+" "+brand); //30 Apple
		
	}
}

public class ConstructorChainingExample 
{

	public static void main(String[] args) 
	{
		new Laptop();
	}

}
