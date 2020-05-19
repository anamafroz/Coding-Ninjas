/****

Print the following pattern
Pattern for N = 4
       1
      23
     345
    4567
    
    ****///
    
    
    import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		while(i<=n) {
			int space =1;
			while (space<=n-i) {
				System.out.print(" ");
				space=space+1;
			}
            
            
			int j=0;
			while(j<i) {
				System.out.print(j+i);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}

}
