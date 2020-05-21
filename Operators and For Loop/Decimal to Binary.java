//****

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Input format :
Integer N
Output format :
Corresponding Binary number (long)
Constraints :
0 <= N <= 10^5
Sample Input 1 :
12
Sample Output 1 :
1100
Sample Input 2 :
7
Sample Output 2 :
111

***//



import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        
        Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		long ans=0,rem,pv=1;
		
		while(n>0) {
			rem=n%2;
			ans=ans+(pv*rem);
			n=n/2;
			pv=pv*10;
			
			
		}
		System.out.println(ans);
		
	}
}
