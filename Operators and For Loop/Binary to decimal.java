///****

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7


***//


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int place=1,ans=0,temp;
		while(n>0) {
			temp=n%10;
			ans=ans+(temp*place);
			place=place*2;
			n=n/10;
			
		}
		System.out.println(ans);
	}
}
