////****

You are given an integer array A that contains only integers 0 and 1. Write a function to sort this array. Find a solution which scans the array only once. Don't use extra array.
You need to change in the given array itself. So no need to return or print anything.
Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)
Output format :
Sorted array elements in a single line separated by space
Constraints :
0 <= N <= 10^7
Sample Input 1:
7
0 1 1 0 1 0 1
Sample Output 1:
0 0 0 1 1 1 1
Sample Input 2:
8
1 0 1 1 0 1 0 1
Sample Output 2:
0 0 0 1 1 1 1 1


*****//

/*Main code*/

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

	public static void printArray(int[] arr) {	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	
	public static void main(String[] args) {
		int[] arr = takeInput();
		Solution.sortZeroesAndOne(arr);
		printArray(arr);
	}
}

/*Your code*/

public class Solution{  

    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
	
           int i, j, k;
        int n=arr.length;
    i=0;j=n-1;
    while(i<j)
    {
        while(arr[i]==0 && i<n) i++;
        while(arr[j]==1 && j>i) j--;
        if(i<j)
        {
            k=arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }
    }

	
    }
}
