//****

Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321

**//


import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            int k=n;
            while(j<=n){
                
                
                
                if(j==n-i+1){
                    System.out.print("*");
                }else{
                System.out.print(k);}
                k--;
                
                j++;
            }
            System.out.println();
            i++;
        }

	}
}
