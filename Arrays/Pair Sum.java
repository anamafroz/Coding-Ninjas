///****

Given a random integer array(ARR) and a number X. Find and print the pair of elements in the array which sum to X.
Given array can contain duplicate elements as well.
While printing a pair, print the smaller element first.
That is, if a valid pair is (6, 5) print "5 6". There is no constraint that out of 5 pairs which have to be printed in 1st line. You can print pairs in any order, just be careful about the order of elements in a pair.
Input format :
Line 1 : Integer N (size of the array)
Line 2 : N elements of the Array separated by a single space.
Line 3 : Integer X
Output format :
Line 1 : Pair 1 - Elements separated by a single space
Line 2 : Pair 2 - Elements separated by a single space
Line 3 : and so on
Constraints :
0 <= N <= 10^4
0 <= x <= 100
Sample Input 1:
9
1 3 6 2 5 4 3 2 4
7
Sample Output 1:
1 6
3 4
3 4
2 5
2 5
3 4
3 4
Sample Input 2:
9
1 3 6 2 5 4 3 2 4
12
Sample Output 2:


 Explanation for Input 2:
Since there doesn't exist any pair with sum equal to 12, nothing got printed.

****///

/*Main Code*/

import java.util.Scanner;

public class Runner {
	
	static Scanner S = new Scanner(System.in);

	public static int[] takeInput() {	
		int size = S.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = S.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int x = S.nextInt();

		Solution.pairSum(arr, x);
	}
}

/*Your Code*/

public class Solution{	
	
	public static void pairSum(int[] input, int x){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                
               
               
                     if( input[i]+input[j]==x){
                         
                         
                         if(input[i]>input[j]){
                              System.out.println(input[j]+" "+input[i]);
                         }
                    else{
                    System.out.println(input[i]+" "+input[j]);}
                         
                }

            }
        }
        
		
	}
}
