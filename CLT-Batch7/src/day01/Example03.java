package day01;

class StaticNonStaticDemo
{
	int variable1 = 50;
	static int variable2 = 60;
	
	
	


	void showVariables()
	{
		System.out.println(variable1 + " " +variable2); //no needs to create object
		//call variable1 and variable2
		
	} //end of showVariables
	
	static String reference1 = "Python";
	String reference2 = "Java";
	
	static void showReferences() // static method can only access static data member directly (without creating object)
	{
		
		System.out.println(reference1);
		
		StaticNonStaticDemo obj2 = new StaticNonStaticDemo();
		System.out.println(obj2.reference2);
		//call reference1 and reference2
	}// end of references
}// end of StaticNonStaticDemo

public class Example03 
{

	public static void main(String[] args) 
	{
		
		StaticNonStaticDemo.showReferences(); // static method therefore direct call
		new StaticNonStaticDemo().showVariables(); //shortcut to create object
		//static main calling a non-static method therefore creates an object
		
		// finally call - showVariables() and showReference()

	} // end of main

} // end of Example03
