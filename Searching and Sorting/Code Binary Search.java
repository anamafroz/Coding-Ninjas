////**********

Given a sorted integer array (in ascending order) and an element "VAL". You need to search this element "VAL" in the given input array using Binary Search. Return the index of element in the input.
Indexing starts from 0.
Return -1 if "VAL" is not present in the input array.


Input format :
Line 1 : Integer N, Array Size
Line 2 : Elements of the array separated by single space
Line 3 : Element to be searched (i.e. VAL)
Output Format :
Index of 'VAL' if found. Otherwise, '-1'
Constraints :
0 <= N <= 10^18
Sample Input 1:
7
1 3 7 9 11 12 45
3
Sample Output 1:
1
Sample Input 2:
7
1 2 3 4 5 6 7
9
Sample Output 2:
-1

**********//

//** Main code **//

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

		int[] arr = takeInput();
		int val = s.nextInt();
		System.out.println(Solution.binarySearch(arr, val));

	}
}


//**Your code**//


public class BinarySearch{	
	//arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num){
		//write your code here
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            
            if(arr[mid]==num){
                return mid;
            }
            
            else if(arr[mid]>num){
                end=mid-1;
               
            }
            else{
                start=mid+1;
                
            }
        }
        return -1;
       
	}
}
