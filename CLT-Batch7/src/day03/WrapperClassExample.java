package day03;

class MyGenericClass
{
	void genericMethod(Object ref)
	{
		System.out.println(ref);
	}
}// end of MyGenericClass

public class WrapperClassExample 
{

	public static void main(String[] args) 
	{
		MyGenericClass refMyGenericClass = new MyGenericClass();
		
		int numberVariable = 20;
		Integer numberReference = numberVariable; 
		
		refMyGenericClass.genericMethod(numberReference);
		
		String reference = "Java";
		refMyGenericClass.genericMethod(reference);
		
		Person refPerson = new Person();
		refMyGenericClass.genericMethod(refPerson);
		
		Long longReference = (long) 50000;
		long longVariable = longReference; 

	}

}
