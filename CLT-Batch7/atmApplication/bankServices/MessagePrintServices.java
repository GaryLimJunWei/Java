package bankServices;

import java.util.Scanner;

import controller.Controller;
import pojo.PojoUser;

public interface MessagePrintServices 
{
	public void message(PojoUser userRef,Controller refControl);
	public void wishToContinue(PojoUser userRef,Scanner s,Controller refControl);
	public void message2(PojoUser userRef,Scanner s,Controller refControl);
}
