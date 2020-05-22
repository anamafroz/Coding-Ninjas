///**********

Given two sorted arrays of Size M and N respectively, merge them into a third array such that the third array is also sorted.
Input Format :
 Line 1 : Size of first array i.e. M
 Line 2 : M elements of first array separated by space
 Line 3 : Size of second array i.e. N
 Line 2 : N elements of second array separated by space
Output Format :
M + N integers i.e. elements of third sorted array in a single line separated by spaces.
Constraints :
0 <= M, N <= 10^6
Sample Input :
5
1 3 4 7 11
4
2 4 6 13
Sample Output :
1 2 3 4 4 6 7 11 13 

***///



public class Solution {

	public static int[] merge(int arr1[], int arr2[]){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/	
        
        int n=arr1.length;
        int m=arr2.length;
        int k =m+n;
        int i=0,j=0,t=0;
        int arr3[]=new int[k];
        
       
            while(i<n&&j<m){
                
                if (arr1[i] < arr2[j]){ 
                    arr3[t] = arr1[i];
                    i++;
                    t++;
                    }
            else{
                
                arr3[t] = arr2[j];
                j++;
            t++;}
            }
            
            while (i < n) {
            arr3[t] = arr1[i];
            i++;
            t++;
            }
       
        while (j< m) {
            arr3[t] = arr2[j]; 
              j++;
                t++;
    }
        return arr3;
	}
	
}
