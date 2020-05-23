///////////********

Given a string, S, remove all the consecutive duplicates that are present in the given string. That means, if 'aaa' is present in the string then it should become 'a' in the output string.
Input format :
String S
Output format :
Modified string
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx

*******////////////

public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
        
        String output="";
        char prev ='\0';
        
        for(int i=0;i<input.length();i++){
           // int k=input.charAt(i);
            if(prev!=input.charAt(i)){
                output=output+input.charAt(i);
                prev=input.charAt(i);
            }
            
        }
       return output;
	}
}
