/***
Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
    totalSalary = basic + hra + da + allow – pf
    
    ***///
    
    
    
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int basic_salary = scan.nextInt();
		float hra=20f/100*basic_salary;
		//int hra1 = Math.round(hra);
		float da= 50f/100*basic_salary;
		//int da1 = Math.round(da);
		float pf=11f/100*basic_salary;
		//int pf1 = Math.round(pf);
		String str = scan.next();
		char c = str.charAt(0);
		int allow=0;
		if(c=='A') {
			allow=1700;
		}
		else if(c=='B') {
			allow=1500;
		}
		else {
			allow=1300;
		}
		float totalSalary =  (basic_salary + hra + da + allow - pf);
		int result2 = Math.round(totalSalary);
		System.out.println(result2 );
	}
}
