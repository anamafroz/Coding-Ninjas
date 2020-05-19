import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i=1,l=1;
		while(i<=n) {
			int sp1=1;
			while(sp1<=n-i) {
				System.out.print(" ");
				sp1=sp1+1;
			}
			

            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
			i=i+1;
		}

		
	}

}
