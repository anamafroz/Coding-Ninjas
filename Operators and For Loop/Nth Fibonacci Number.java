///*******

Nth term of fibonacci series F(n) is calculated using following formula -
    F(n) = F(n-1) + F(n-2), 
    Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number.

*******////

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i=1,x=1,y=1,sum = 0;
		for(i=1;i<=n;i++) {
			if(i==1 || i==2){
                sum=x;
               
            }else{
				 sum =x+y;
				x=y;
				y=sum;
            }
			
		}
		System.out.println(sum);

		
	}

}
