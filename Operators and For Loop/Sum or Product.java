//****

Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
 
 **//
 
 
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int c = scan.nextInt();
		
		int z=-1;
		if(c==1) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				sum=sum+i;
			}
			System.out.println(sum);
			
		}else if(c==2) {
			int mul=1;
			for(int i=1;i<=n;i++) {
				mul=mul*i;
			}
			System.out.println(mul);
		}
		else {
			System.out.println(z);
		}

	}
}
