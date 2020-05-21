///**

Given an integer array(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
Assume, duplicate number is always present in the given array.
Input format :
Line 1 : An integer N(size of the input array)
Line 2 : Array elements (separated by a single space)
Output Format :
Duplicate element
Constraints :
2 <= n <= 10^4
Sample Input 1:
9
0 7 2 5 4 7 1 3 6
Sample Output 1:
7
Sample Input 2:
5
0 2 1 3 1
Sample Output 2:
1

**////

/* Main Code */

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
		System.out.println(Solution.duplicateNumber(arr));
	}
}

/* Your Code */


import java.util.Arrays;

public class Solution{	
	
	public static int duplicate(int[] arr){
   int i=0;
        for(i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return arr[i];
	}
}
