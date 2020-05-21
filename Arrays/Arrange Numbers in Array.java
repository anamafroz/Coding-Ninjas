//****

You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2.
Note: You need not print the array. You only need to populate it.
Input Format :
 Integer N
Output Format :
Elements of the array separated by single space(It has been taken care, need not worry)
Constraints :
1 <= n <= 10^6
Sample Input 1 :
6
Sample Output 1 :
 1 3 5 6 4 2
Sample Input 2 :
9
Sample Output 2 :
 1 3 5 7 9 8 6 4 2


****//

/* Main code*/

import java.util.Scanner;

public class Runner {	
	static Scanner S = new Scanner(System.in);

	public static void printArray(int[] arr) {
		
		for(int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = S.nextInt();
		int[] arr = new int[n];

		Solution.arrange(arr, n);
		printArray(arr);

	}
}


/*Your code*/


public class Solution {

	
	public static int[] arrange(int n){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/			
    int i=0;
        int arr[]= new int[n];
        int k=(n-1)/2;
        int val=1;
        for(i=0;i<=k;i++){
           arr[i]=val;
           val= val+2;
            
        }
        if (n%2==0){
        val=n;}
        else{val=n-1;}
        for(i=k+1;i<n;i++){
            arr[i]=val;
            val=val-2;
        }
        
        return arr;
        
	}
	
}
