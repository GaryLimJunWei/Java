package bankDAO;

import java.util.Scanner;
import controller.Controller;
import pojo.PojoUser;

public interface UserChoiceDAO 
{
	public void choiceOne(PojoUser userRef,Controller refControl,Scanner s);
	public void choiceTwo(PojoUser userRef,Controller refControl,Scanner s);
	public void choiceThree(PojoUser userRef,Controller refControl,Scanner s);
	public void choiceFour();
	public void loginoption(int choice,PojoUser userRef, Scanner s,Controller refControl);
}
