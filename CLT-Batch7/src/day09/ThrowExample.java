package day09;


class User extends Throwable
{
	public User(String ref)
	{
		System.out.println(ref+" 1");
	}
	
	static void validateAge(int age)
	{
		if(age<18)
		{
			User refUser = new User("Age can't be less than 18");
			try 
			{
				throw refUser; //What does this line does
							  // What does throw do	
			} 
			catch (User e)//Why use this User type 
			{
				System.out.println("Exception caught....");
			}
			finally
			{
				System.out.println("closing files...");
			}
			
		}
		
		
	}
}

public class ThrowExample 
{

	public static void main(String[] args) 
	{
		User.validateAge(10);

	}

}
