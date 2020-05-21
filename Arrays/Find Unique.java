///****

Given an integer array of size 2N + 1. In this given array, N numbers are present twice and one number is present only once in the array.
You need to find and return that number which is unique in the array.
Note : Given array will always contain odd number of elements.


Input format :
Line 1 : Array size i.e. 2N+1
Line 2 : Array elements (separated by space)
Output Format :
Unique element present in the array
Constraints :
1 <= N <= 10^4 + 1
Sample Input 1:
7
2 3 1 6 3 6 2
Sample Output 1:
1
Sample Input 2:
5
2 4 7 2 7
Sample Output 2:
4


*****///

/***Main code***/

import java.util.Scanner;

public class Runner {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(Solution.findUnique(arr));
	}
}

/**Your code**/

import java.util.Arrays;


public class Solution{	
	
	public static int findUnique(int[] arr){
   Arrays.sort(arr);
     
    int i=0;
    while(i<arr.length)
    {
        if(arr[i]!=arr[i+1])
        {
            return arr[i];
        }
        i=i+2;
    }
         return arr[i];
	}
}
