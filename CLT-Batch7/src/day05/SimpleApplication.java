package day05;

class A
{
	B refB; // class A has a reference of class B
	
//	void display(B refB)
//	{
//		this.refB = refB;
//	}
	
	A(B refB)
	{
		this.refB = refB;
	}
	
	public B getRefB()
	{
		return refB;
	}
}// end of class A


class B
{
	
	C refC;
	
	B(C refC)
	{
		this.refC = refC;
	}
	
	public C getrefC() 
	{
		return refC;

	}
	void show()
	{
		System.out.println("I am in Class B");
	}

//	public void setRefC(C refC) 
//	{
//		
//		this.getRefC();
//	}
	
	

	

//	public C getRefC() 
//	{
//		
//		return null;
//	}
} // end of class B

class C
{
//	String name;
//	public void setName(String name)
//	{
//		this.name = name;
//	}
	
	String name;
	
	public C(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}

public class SimpleApplication 
{

	public static void main(String[] args) 
	{
		
		C refC = new C("Hi");
		B refB = new B(refC);
		A refA = new A(refB);
		
		
//		refC.setName("Hello");
//		refA.setRefB(refB);
//		refB.setRefC(refC);
		System.out.println(refA.getRefB().getrefC().getName());

	}

}
