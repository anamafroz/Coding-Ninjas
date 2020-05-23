//////***********


Given a string, S, find and return the highest occurring character present in the given string.
If there are 2 characters in the input string with same frequency, return the character which comes first.


Note : Assume all the characters in the given string are lowercase.


Input format :
String S
Output format :
Highest occurring character
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x

***********////////////

// highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// Write your code here
        int no_of_c=256;
        int freq[]=new int[no_of_c];
        int max=Integer.MIN_VALUE;
        char z=' ';

        
        
        for(int i=0;i<inputString.length();i++){
             int index=inputString.charAt(i);
            freq[index]++;
        }
        
        for(int i=0;i<inputString.length();i++){
            
            int index=inputString.charAt(i);
            // z="";
            if(freq[index]>max){
                max=freq[index];
               z=inputString.charAt(i);
                
            }
             
        }
        return z;     
	}
           
}
