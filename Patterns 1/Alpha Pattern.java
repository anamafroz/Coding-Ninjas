//***

Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 
 
 **///
 
 import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char c=(char)('A'+i-1);
            while(j<=i){
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}
