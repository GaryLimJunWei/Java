package application;

import controller.Controller;

public class UserApplication
{

	public static void main(String[] args) 
	{
		Controller refControl = new Controller();
		refControl.adminController(refControl); //Passing the object reference to minimize the creation of object
		
	}

}
