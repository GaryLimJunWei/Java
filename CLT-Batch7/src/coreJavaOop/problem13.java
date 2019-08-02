package coreJavaOop;

public class problem13 
{
	
	public static void main(String[] args)
	{
		int[] arr = {20,30,30,40,50,50,60,60};
		remove(arr);
	}
	
	public static void remove(int[] arr)
	{
		int len = arr.length;
		int j = 0;
		for (int i = 0; i<len-1; i++) 
		{
			if(arr[i] != arr[i+1])
			{
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[len-1];
		
		
		int no=0;
		for (int k = 0; k <j; k++) 
		{
			System.out.print(arr[k] + " ");
		
			no++;
			
		}
		
		System.out.println("\nThe new length of the array is "+no);
	}

}
