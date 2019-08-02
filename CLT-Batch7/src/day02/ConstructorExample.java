package day02;

class Mobile
{
	int price = 500;
	
	// JVM creates a default constructor of Mobile class
	//constructor name and class name must be same
	//constructor doesn't have any return type, not even void
	Mobile()
	{
		System.out.println(price);
	}
}

public class ConstructorExample 
{

	public static void main(String[] args) 
	{
		new Mobile(); //once we create object of Mobile class
						
		
		
	}

}
