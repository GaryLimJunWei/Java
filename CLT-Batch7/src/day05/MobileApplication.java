package day05;

import java.util.Scanner;

public class MobileApplication 
{

	public static void main(String[] args) 
	{
		//step 1
		 
		 Mobile refMobile = new Mobile(); // each time from the MobileApplication to call the classes 
		 Chat refChat = new Chat();
		 
		 //step 2
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter Your text : ");
		 String myText = s.next(); //because is String, it goes to the String parameters
		 refChat.setChat(myText); // This argument will set the value to setter method in Chat class
		 
		 //step 3
		 WhatsApp refWhatsApp = new WhatsApp(); // Creating an object from WhatsApp
		 refMobile.setRefWhatsApp(refWhatsApp); 
		 
		 refWhatsApp.setRefChat(refChat);
		 
		 System.out.println(refMobile.getRefWhatsApp().getRefChat().getChat());
		 
		 
	}

}
