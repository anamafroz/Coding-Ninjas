//////*******

Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.
Input Format :
Line 1 : Two integers M and N (separated by space) 
Line 2 : Matrix elements of each row (separated by space)
Output Format :
Sum of every ith row elements (separated by space)
Constraints :
0 <= N <= 10^4
0 <= M <= 10^4
Sample Input 1:
4 2 
1 2 3 4 5 6 7 8
Sample Output 1:
3 7 11 15 
Sample Input 2:
2 5 
4 5 3 2 6 7 5 3 8 9
Sample Output 2:
20 32


********///////


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int array[][]=new int[m][n];
        int i=0,j=0,sum=0;
        
          for(i=0;i<m;i++){
            
            for(j=0;j<n;j++){
               array[i][j]=scan.nextInt();
            }
            //System.out.print(sum);
        }
       
        for(i=0;i<m;i++){
            
            for(j=0;j<n;j++){
                sum=sum+array[i][j];
                //System.out.print(sum);
            }
            System.out.print(sum+" ");
            sum=0;
        }
        
        
	}
}
