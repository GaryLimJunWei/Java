package coreJavaOop;

class FindCommon
{
	// This function prints common elements in ar1 
    void findCommon(int ar1[], int ar2[], int ar3[]) 
    { 
        // Initialize starting indexes for ar1[], ar2[] and ar3[] 
        int i = 0, j = 0, k = 0; 
  
        // Iterate through three arrays while all arrays have elements 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             // If x = y and y = z, print any of them and move ahead 
             // in all arrays 
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
  
             // x < y 
             else if (ar1[i] < ar2[j]) 
                 i++; 
  
             // y < z 
             else if (ar2[j] < ar3[k]) 
                 j++; 
  
             // We reach here when x > y and z < y, i.e., z is smallest 
             else
                 k++; 
        } 
    } 
    
} 


public class problem10 
{

	public static void main(String[] args) 
	{
		FindCommon ref = new FindCommon();
		
		int[] ar1 = new int[] {1,5,10,20,40,80};
		int[] ar2 = new int[] {6,7,20,80,100};
		int[] ar3 = new int[] {3,4,15,20,30,70,80,120};
		
		System.out.println("Common elements are ");
		ref.findCommon(ar1, ar2, ar3);

	}

}
