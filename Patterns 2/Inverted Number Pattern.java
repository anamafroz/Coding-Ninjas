//***

Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1


***//

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		
            Scanner scan =new Scanner(System.in);
		    int n = scan.nextInt();
            int i=1;
        int c=n;
        while(i<=n){
            int j=1;
            while(j<=n-i+1){
                System.out.print(c);
                j++;
            }
            c--;
            System.out.println();
            i++;
        }
		
	}

}
