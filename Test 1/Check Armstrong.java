///****

Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false

***///



import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		
    Scanner scan =new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

int number = sc.nextInt();
int temp, remainder, result = 0, n = 0 ;
temp = number;

// Finding the number of digits

while (temp != 0)
{
temp /= 10;
++n;
}

temp = number;

// Checking if the number is armstrong

while (temp != 0)
{
remainder = temp%10;
result += Math.pow(remainder, n);
temp /= 10;
}

if(result == number)
System.out.print("true");
else
System.out.print("false");
	}
    
    
}
