package day03;

class Bank
{
     Bank(String location) //this is a constructor
	{
		System.out.println("Welcome " +location);
	}
     
     void test()
     {
    	 System.out.println("Testing 123");
     }
	
	
}

class DigitalBank extends Bank
{

	DigitalBank(String location,int code)
	{
		super(location); // we must use super keyword to call parent class constructor
		System.out.println(location);
		System.out.println(code); //1234
		// either we can print location here or we can call parent class constructor 
		
		
	}

	@Override
	void test() 
	{
		// TODO Auto-generated method stub
		super.test();
		
		
		
	}
	
	
	
}

//class ChildClassOfDigitalBank extends DigitalBank
//{
//	
//}
public class inheritanceExample02 
{

	public static void main(String[] args) 
	{
		new DigitalBank("Digibank",1234); // it will call line no.14
		
		DigitalBank ref = new DigitalBank("asd",1);
		
		ref.test();
		
		

	}

}
