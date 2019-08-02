package coreJavaOop;

import java.util.Arrays;
import java.util.Scanner;

public class problem11 
{
	public static int removeDuplicateElements(int arr[], int n)
	{  
        if (n==0 || n==1)
        {  
            return n;  
        }  
        
        int[] temp = new int[n]; //Storing the array to a temporary array
        int j = 0;  
        for (int i=0; i<n-1; i++)
        {  
            if (arr[i] != arr[i+1]) //Comparing if the element is the same
            {  
                temp[j++] = arr[i];  //Putting the same element to the temp array 
            }  
         }  
        temp[j++] = arr[n-1];  //Inputing the same element into the original array
        // Changing original array  
        for (int i=0; i<j; i++)
        {  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

	public static void main(String[] args) 
	{
	
		int arr[] = {1,1,1,2,2,2,3,4,5,6,7,8};  
        int length = arr.length;  
        length = removeDuplicateElements(arr, length);  
        //printing array elements  
        System.out.println("Elements after removing duplicates :");
        for (int i=0; i<length; i++)  
        {
           System.out.print(arr[i]+" ");  
        }
        

	}

}
