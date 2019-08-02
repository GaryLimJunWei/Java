package day03;

class People
{
	int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
}

class People1
{
	int age;
	String name;
	
	public People1(int age, String name) 
	{
		this.age = age;
		this.name = name;
	}
}

public class TestingOverRidding
{

	public static void main(String[] args) 
	{
	 new People().setAge(21);
	 new People().setName("Abc");
	 new People1(20,"Abc");
		
		
	}

}
