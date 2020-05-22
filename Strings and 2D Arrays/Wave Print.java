////////*****


Given a two dimensional N*M array, print the array in a sine wave order. i.e. print the first column top to bottom, next column bottom to top and so on.
Note : Print the elements separated by space.
Input format :
N, M, array elements (separated by space)
Output format :
Elements of matrix in wave form in a single line and space separated
Constraints :
0 <= N <= 10^4
0 <= M <= 10^4
Sample Input 1:
3 4 1  2  3  4 5  6  7  8 9 10 11 12
Sample Output 1:
1 5 9 10 6 2 3 7 11 12 8 4
Sample Input 2:
5 3 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
Sample Output 2:
1 4 7 10 13 14 11 8 5 2 3 6 9 12 15 


************////////////////////



public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		
		// Write your code here
        
        int row=input.length;
        int col=input[0].length;
        int i=0;
        
        for(int j=0;j<col;j++){
            if(j%2==0){
             i=0;
            while(i<row){
                System.out.print(input[i][j]+" ");
                i++;
            }}
            else{
                 i=row-1;
                while(i>=0){
                    System.out.print(input[i][j]+" ");
                i--;
                }
            }
        }

	}

	
}

