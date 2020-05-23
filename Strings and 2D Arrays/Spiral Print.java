/////*********

Given an N*M 2D array, print it in spiral form. That is, first you need to print the 1st row, then last column, then last row and then first column and so on.
Print every element only once.
Input format :
Line 1 : N and M, No. of rows & No. of columns (separated by space) followed by N*M  elements in row wise fashion.
Output format :
Elements of matrix in spiral form in a single line and space separated
Constraints :
0 <= N <= 10^4
0 <= M <= 10^4
Sample Input 1:
 4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
 3 3 1 2 3 4 5 6 7 8 9
Sample Output 2:
1 2 3 6 9 8 7 4 5 

***********////////////

public class solution {

	public static void spiralPrint(int matrix[][]){
		// Write your code here
        
        int count=0;
        int row=matrix.length;
        int col = matrix[0].length;
        int rs=0;
        int cs=0;
        int ce=col-1;
        int re=row-1;
        
        while(count<row*col){
            for(int i=cs;i<=ce;i++){
               System.out.print(matrix[rs][i]+" ");
                count=count+1;
            }
            rs++;
            
            for(int i=rs;i<=re;i++){
                System.out.print(matrix[i][ce]+" ");
                count=count+1;
            }
            ce--;
            
            for(int i=ce;i>=cs;i--){
                System.out.print(matrix[re][i]+ " ");
                count=count+1;
            }
            re--;
            
            for(int i=re;i>=rs;i--){
                System.out.print(matrix[i][cs]+" ");
                count=count+1;
            }
            cs++;
            
        }

	}
}
