package day08;

public class DevCode 
{
	static void logic(int num)
	{
		try 
		{
			
 		} 
//		catch (Exception e) 
//		{
//			System.out.println("A number can't be divisible by 0");
//		}
		
		catch (ArithmeticException e) 
		{
			System.out.println("A number can't be divisible by 0");
		}
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("handled Array IndexOutOfBoundsException");
		}
		catch (Exception e) 
		{
			System.out.println("Exception is the super class of all Exception classes");
		}
		
		finally
		{
			System.out.println("closing files...");
		}
		
	}
		
}
