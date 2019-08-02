package coreJavaOop;

public class problem7 
{
	
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++) // this loop will continues till "i" is more than 5
	    {
	        int temp = i; // creating temporary variable to store the value of "i"
	        
	        for (int j = 1; j <= i; j++) // loop till j is more than i
	        {
	            System.out.print(temp + " "); // printing temp 
	            temp = temp + 1; // after printing increase temp by 1
	         
	        }
	        
	        temp = temp - 2; // decrease the value of temp by 2
	      
	        for (int k = i - 1; k >= 1; k--) // loop till k is more than 1 when k is i-1
	        {
	    
	            System.out.print(temp + " ");
	            temp = temp - 1; // temp is decreasing by 1
	        }
	        System.out.println();
	    }


	}

}
