///****

Given a random integer array(ARR) and a number X. Find and print the triplets of elements in the array which sum to X.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
Input format :
Line 1 : Integer N (size of the array)
Line 2 : N elements of the Array separated by a single space.
Line 3 : Integer X
Output format :
Line 1 : Triplet 1 - Elements separated by single space
Line 2 : Triplet 2 - Elements separated by single space
Line 3 : and so on
Constraints :
0 <= N <= 10^3
0 <= x <= 100
Sample Input 1:
7
1 2 3 4 5 6 7 
12
Sample Output 1:
1 4 7
1 5 6
2 3 7
2 4 6
3 4 5
Sample Input 2:
7
1 2 3 4 5 6 7 
19
Sample Output 2:


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19, nothing got printed.

***/


/* Your Code*/

public class Solution{	

	public static void tripletSum(int[] input, int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		*/
		int n=input.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(input[i]+input[j]+input[k]==x){
                        
                        if(input[i]<=input[j] && input[i]<=input[k]){
                            
                            if(input[j]<input[k]){
                                System.out.println(input[i]+" "+input[j]+" "+input[k]);
                            }
                            else{
                                System.out.println(input[i]+" "+input[k]+" "+input[j]);
                            }
                            
                        }
                        
                        
                        else if(input[j]<=input[i] && input[j]<=input[k]){
                            
                            if(input[i]<input[k]){
                                System.out.println(input[j]+" "+input[i]+" "+input[k]);
                            }
                            else{
                                System.out.println(input[j]+" "+input[k]+" "+input[i]);
                            }
                            
                        }
                        
                        else{
                             if(input[i]<input[j]){
                                System.out.println(input[k]+" "+input[i]+" "+input[j]);
                            }
                            else{
                                System.out.println(input[k]+" "+input[j]+" "+input[i]);
                            }
                            
                        }
                        
                        
                    }
                }
            }
        }
	}
}
