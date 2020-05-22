/////********

Given an NxM 2D array, you need to find out which row or column has largest sum (sum of its elements) overall amongst all rows and columns.
Input Format :
 Line 1 : 2 integers N and M respectively, separated by space 
 Line 2: Single line having N*M elements entered in row wise manner, each separated by space.
Output Format :
 If row sum is maximum then - "row" row_num max_sum
 If column sum is maximum then - "column" col_num max_sum
Constraints :
0 <= N <= 10^4
0 <= M <= 10^4
Note : If there are more than one rows/columns with maximum sum consider the row/column that comes first. And if ith row and jth column has same sum (which is largest), consider the ith row as answer.
Sample Input 1 :
2 2 
1 1 1 1
Sample Output 1 :
row 0 2
Sample Input 2 :
3 3
3 6 9 1 4 7 2 8 9
Sample Output 2 :
column 2 25

***************////////////


public class Solution {

	
	public static void findLargest(int input[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        int row=input.length;
        int col=input[0].length;
        //int sum=0;
        int large=Integer.MIN_VALUE;
        String s="";
        int x=0;
        
        for(int i=0;i<row;i++){
           int sum=0;
            for(int j=0;j<col;j++){
                sum=sum+input[i][j];
            }
            if(sum>large){
                large=sum;
                x=i;
                s="row";
            }
        }
       
          for(int i=0;i<col;i++){
           int sum=0;
            for(int j=0;j<row;j++){
                sum=sum+input[j][i];
            }
            if(sum>large){
                large=sum;
                x=i;
                s="column";
            }
        }
        
        System.out.println(s+" "+x+" "+large);
           
	}

	
}
