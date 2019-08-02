package application;

import controller.AdminController;

public class Main // naving conveion
{

	public static void main(String[] args) 
	{
		AdminController refControl = new AdminController();
		refControl.tryCatch(refControl); //Passing the object reference to minimize the creation of object
		// naving conveion tryCatch
	}

}
