//////////***************

Given a string and a character x. Write a function to remove all occurrences of x character from the given string.
Leave the string as it is, if the given character is not present in the string.


Input Format :
Line 1 : String S
Line 2 : Character c
Output Format :
Modified string
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
welcome to coding ninjas
o
Sample Output 1:
welcme t cding ninjas
Sample Input 2:
Think of edge cases before submitting solutions
x
Sample Output 2:
Think of edge cases before submitting solutions

**********///////////////

public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
        String remove="";
        
   for(int i=0;i<input.length();i++){
    if(input.charAt(i)==c){
        continue;
    }
   
    remove=remove+input.charAt(i);
    }
       return remove;  
        
	}
    
   

}
