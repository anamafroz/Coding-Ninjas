/***

  Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
  
  ***/
  
  
  import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int s = scan.nextInt();
		int e = scan.nextInt();
		int w = scan.nextInt();
		int F;
		
		while(s<=e) {
			F=5*(s-32)/9;
			System.out.println(s +"\t"+ F);
			s=s+w;
		}

		
	}

}
