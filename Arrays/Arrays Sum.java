//****

Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
Input Format :
Line 1 : An Integer N i.e. the size of the array/list
Line 2 : N integers which are elements of the array/list, separated by a single space.
Output Format :
Sum of the numbers in the array/list
Constraints :
0 <= N <= 10^7
Sample Input 1:
3
9 8 9
Sample Output 1:
26
Sample Input 2:
4
2 3 5 1
Sample Output 2:
11


****//


/*Main code*/

import java.util.Scanner;

public class Runner {	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = takeInput();		
		System.out.println(Solution.sum(input));
	}
}

/*Your code*/


public class Solution {

	public static int sum(int[] input){
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/	
		int size=input.length;
        int i=0,sum=0;
        for(i=0;i<size;i++){
            sum=sum+input[i];
        }
        return sum;

	}
	
}
