////*************

Given a random integer array, push all the zeros that are present to end of the array. The respective order of other elements should remain same.
Change in the input array itself. You don't need to return or print elements. Don't use extra array.
Note : You need to do this in one scan of array only.


Input format :
Line 1 : Integer N, Array Size
Line 2 : Elements of the array separated by a single space.
Output Format :
Array elements in a single line (separated by single space)
Constraints :
0 <= N <= 10^7
Sample Input 1:
7
2 0 4 1 3 0 28
Sample Output 1:
2 4 1 3 28 0 0
Sample Input 2:
5
0 3 0 2 0
Sample Output 2:
3 2 0 0 0

*****////


public class PushZerosAtEnd {
	
	public static void pushZerosAtEnd(int[] arr){
		/* Your class should be named PushZerosAtEnd 
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to return or print the output.
     		 * Taking input and printing output is handled automatically.
     		 */
        int i=0,k=0;
       
           while(i<arr.length ) {
               
               if(arr[i]!=0){
                   arr[k]=arr[i];
                   i++;
                   k++;
               }
               else{
                   i++;
               }
               
           }
        
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
            
        

	}
}
