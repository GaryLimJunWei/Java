package coreJavaOop;

public class problem6 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int j=0;
		for(int i=1; i<=5; i++) // the number of rows, that it repeats
		{
			for(j=0; j<i; j++) // starts from 0 and end before the end of the rows
			{
				System.out.print("* " + " ");
			}
			
			for(int k=0; k<(j-2); k++) // 
			{
				System.out.print("* " + " ");
			}
			System.out.println();
		}
		
	}
		
		

}
