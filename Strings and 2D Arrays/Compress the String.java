///////******

Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
Note : Consecutive count of every character in input string is less than equal to 9.


Input Format :
String S
Output Format :
Compressed string 
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1 :
aaabbccdsa
Sample Output 1 :
a3b2c2dsa
Sample Input 2 :
aaabbcddeeeee
Sample Output 2 :
a3b2cd2e5

*************//////

public class Solution {

	public static String compress(String inputString) {
		// Write your code here
         String output="";
        char previous ='\0';
        
      // int count=1;
        
        for(int i=0;i<inputString.length();i++){
             int count = 1; 
            while (i < inputString.length() - 1 &&  
                    inputString.charAt(i) ==  inputString.charAt(i + 1)) { 
                count++; 
                i++; 
            } 
            
            if(count>1){
                output=output+ inputString.charAt(i)+count;
            }
            else{
                 output=output+ inputString.charAt(i);
            }
        }
        
        return output;
	}

}
