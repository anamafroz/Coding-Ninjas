/***

Given a number N, print sum of all even numbers from 1 to N.

**/

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i=1,sum=0;
		while(i<=n) {
			if(i%2==0) {
				sum=sum+i;
				i=i+1;
			}
			else{i=i+1;}
			
		}
		System.out.println(sum);
		


		
	}

}


