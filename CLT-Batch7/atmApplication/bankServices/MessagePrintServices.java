package bankServices;

import java.util.Scanner;
import controller.AdminController;
import pojo.PojoUser;

public interface MessagePrintServices 
{
	public void message(PojoUser userRef,AdminController refControl);
	public void wishToContinue(PojoUser userRef,Scanner s,AdminController refControl);
	public void message2(PojoUser userRef,Scanner s,AdminController refControl);
}
