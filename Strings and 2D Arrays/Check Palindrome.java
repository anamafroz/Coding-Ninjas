/////********

Given a String s, check it its palindrome. Return true if string is palindrome, else return false.
Palindrome strings are those, where string s and its reverse is exactly same.
Input Format :
 String S
Output Format :
"true" if S is palindrome, else "false"
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1 :
abcdcba
Sample Output 1 :
true 
Sample Input 1 :
abcd
Sample Output 1 :
false

******/////


public class Solution {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int j=str.length()-1;
        int i=0;
        boolean palindrome=false;
        //for(int i=0;i<str.length();i++){
           while(i<str.length() && j>=0){
            if(str.charAt(i)==str.charAt(j)){
                palindrome=true;
            }else if(str.charAt(i)!=str.charAt(j)){
                
                palindrome=false;
                break;
            }
               i++;
                j--;}
        
        return palindrome;
	}
}
