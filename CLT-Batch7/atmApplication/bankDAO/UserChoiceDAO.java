package bankDAO;

import java.util.Scanner;
import controller.AdminController;
import pojo.PojoUser;

public interface UserChoiceDAO 
{
	public void choiceOne(PojoUser userRef,AdminController refControl,Scanner s);
	public void choiceTwo(PojoUser userRef,AdminController refControl,Scanner s);
	public void choiceThree(PojoUser userRef,AdminController refControl,Scanner s);
	public void choiceFour();
	public void loginoption(int choice,PojoUser userRef, Scanner s,AdminController refControl);
}
