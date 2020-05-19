/***

Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.

****//


 
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
        int temp=n,sum1=0,sum2=0;
        
        while(temp>0){
        	int rem,x;
            rem=temp%10;
           
            
            
            if(rem%2==0){
             sum1=sum1+rem;
          }
            else{
            sum2=sum2+rem;
        }
            temp=temp/10;
                 }
       System.out.println(sum1+" "+sum2);
        

	}
}
