/////************


Given an integer array, which is sorted (in increasing order) and has been rotated by some number k in clockwise direction. Find and return the k.
Input format :
Line 1 : Integer n (Array Size)
Line 2 : Array elements (separated by space)
Output Format :
Integer k
Constraints :
0 <= n <= 10^7
Sample Input 1:
6
5 6 1 2 3 4
Sample Output 1:
2
Sample Input 2:
5
3 6 8 9 10
Sample Output 2:
0

***//////



public class Solution {

    public static int arrayRotateCheck(int[] arr){
        //Your code goes here

    int d=0;
        for(int i=0;i<arr.length;i++){
            int m=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    d=d+1;
                    break;
                }
            }
        }
    return d;
	}
}
