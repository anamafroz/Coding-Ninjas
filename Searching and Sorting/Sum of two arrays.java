///////************


Two random integer arrays are given A1 and A2, in which numbers from 0 to 9 are present at every index (i.e. single digit integer is present at every index of both given arrays).
You need to find sum of both the input arrays (like we add two integers) and put the result in another array i.e. output array (output arrays should also contain only single digits at every index).
The size A1 & A2 can be different.
Note : Output array size should be 1 more than the size of bigger array and place 0 at the 0th index if there is no carry. No need to print the elements of output array.
Input format :
Line 1 : Integer n1 (A1 Size)
Line 2 : A1 elements (separated by space)
Line 3 : Integer n2 (A2 Size)
Line 4 : A2 elements (separated by space)
Output Format :
Output array elements in a single line (separated by space)
Constraints :
0 <= n1, n2 <= 10^7
Sample Input 1:
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
3
8 5 2
2
1 3
Sample Output 2:
0 8 6 5

******************//////////////////

public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		/* Your class should be named SumOfTwoArrays
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return the output array. No need to print.
		 * Taking input and printing output is handled automatically.
		 */
        
       int size=Math.max(arr1.length,arr2.length);
        int arr3[]= new int[size+1];
        int carry=0;
        int i=arr1.length-1,j=arr2.length-1,k=arr3.length-1;
        while(k>=0){
            if(i>=0 && j>=0){
                arr3[k]=carry+arr1[i]+arr2[j];
                if(arr3[k]>9){
                    arr3[k]=arr3[k]%10;
                    carry=1;
                }
                else{
                    carry=0;
                }
                i--;
                j--;
               // k--;
            }
            else if(i<0 && j>=0){
                arr3[k]=carry+arr2[j];
                if(arr3[k]>9){
                    carry=1;
                     arr3[k]=arr3[k]%10;
                }else{
                    carry=0;
                }
                j--;
               // k--;
            }
             else if(j<0 && i>=0){
                arr3[k]=carry+arr1[i];
                if(arr3[k]>9){
                    carry=1;
                     arr3[k]=arr3[k]%10;
                }else{
                    carry=0;
                }
                i--;
               // k--;
            }
            else{
                arr3[k]=carry;
                //k--;
            }
            k--;
            
         
        }
        return arr3;
	}
}
