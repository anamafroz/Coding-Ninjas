////**********

Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1

*****//


import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        


		Scanner scan =new Scanner(System.in);
		int x = scan.nextInt();
        int n = scan.nextInt();
		int mul=1;
		while(n>0) {
            if(n>=0 && x>=0){
			mul=mul*x; }
            else
            {
                mul=1;
                System.out.println(mul);
                return;
            }
           
			n=n-1;
		}
		System.out.println(mul);
	}
}

    
