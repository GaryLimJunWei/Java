package coreJavaOop;

public class problem12 
{

	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 3 ,4};
        int largest = arr[0];
        int secondLargest = arr[0];
        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 0; i < arr.length; i++) 
        {

            if (arr[i] > largest) 
            {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) 
            {
                secondLargest = arr[i];

            }
        }
        System.out.println("Second largest number is:" + secondLargest);
        
        smallest = secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) 
        {

            if (arr[i] < smallest) 
            {
                secondSmallest = smallest;
                smallest = arr[i];

            } 
            else if (arr[i] < secondSmallest && arr[i] != smallest) 
            {
                secondSmallest = arr[i];

            }
        }
        System.out.println("Second smallest number is:" + secondSmallest);
    }
		
		
		
		
	}
		





