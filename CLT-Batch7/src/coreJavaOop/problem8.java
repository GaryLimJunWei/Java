package coreJavaOop;

public class problem8 
{

	public static void main(String[] args) 
	{
		int i,j;
		for(i=5; i>1; i--) // the number of rows, that it repeats
		{
			for(j=0; j<i; j++) // starts from 0 and end before the end of the rows
			{
				System.out.print("* ");
			}
			
			for(int k=0; k<(j-2); k++) // 
			{
				System.out.print("* ");
			}
			if(i==2)
			{
				System.out.println("\n*");
			}
			
			System.out.println("\n");
		}

	}

}
