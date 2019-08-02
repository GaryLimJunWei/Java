package day02;
import java.util.Scanner;

//example of encapsulation
//hibernate/JPA(Java Persistance API) ==> application are of POJO class
// this user class also knowns as ==> POJO class / entity class


 
public class UserApplication 
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ID : ");
		String id = s.next();
		
		System.out.println("Enter Password : ");
		String password = s.next();
		
		System.out.println("Enter age : ");
		int age = s.nextInt();
		
		//create an object of User class
		
		User ref = new User();
		
		ref.setAge(age);
		ref.setUserID(id);
		ref.setUserPassword(password);
		
		//call the getter methods
		
		System.out.println(ref.getAge() + " " +ref.getUserID() + " " +ref.getUserPassword());
		
		
		
		
		
	}

}
