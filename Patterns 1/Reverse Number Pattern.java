//**

Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321

**////

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
            int c=i;
			while(j<=i) {
				System.out.print(c);
                c--;
				j++;
			}
			System.out.println();
			i++;
		}
		
	}

}
