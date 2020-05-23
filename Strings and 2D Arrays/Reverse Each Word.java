////////************

Given a string S, reverse each word of a string individually. For eg. if a string is "abc def", reversed string should be "cba fed".
Input Format :
String S
Output Format :
Modified string
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Give proper names to variables and functions
Sample Output 2:
eviG reporp seman ot selbairav dna snoitcnuf

***********//////////////

public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		// Write your code here
        String word[]=input.split(" ");
        String reverse="";
        
        for(int i=0;i<word.length;i++){
            String wrd=word[i];
            String rw="";
            for(int j=wrd.length()-1;j>=0;j--){
                rw=rw+wrd.charAt(j);
            }
            reverse=reverse+rw+" ";
        }
        return reverse;
	}
}
