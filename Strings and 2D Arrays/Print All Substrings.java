////****

Given a String S of length n, print all its substrings.
Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.
Input Format :
String S
Output Format :
 All Substrings of S, one in each line.
Constraints :
0 <= |S| <= 10^2
where |S| represents the length of string, S.
Note : The order in which you print substrings doesn't matter.
Sample Input 1 :
xyz
Sample Output 1 :
x
xy
xyz
y
yz
z
Sample Input 2 :
ab
Sample Output 2 :
a
b
ab

*****/////



public class Solution {

	public static void printSubstrings(String str){
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question.
		*/
        for(int i=0;i<str.length();i++){
            int j=str.length();
            while(j>i){
                System.out.println(str.substring(i,j));
                j--;
            }
        }
	}
	

}
