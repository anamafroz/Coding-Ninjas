///********

Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= N <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17

******///



import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i=1,count=1;
		
		for(i=1;i<=1000;i++) {
			int x= (3*i)+2;
			
			if(x%4!=0) {
				System.out.print(x+" ");
				count=count+1;
			}
			while(count>n) {
				return;
			}
		}
	}
}
