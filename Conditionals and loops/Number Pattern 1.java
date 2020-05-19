/****

Print the following pattern
Pattern for N = 4
1
23
345
4567

*****///


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		//int i=1;
		for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+i);
            }
            
            System.out.println();
        }

		
	}

}
