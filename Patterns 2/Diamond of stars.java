import java.util.Scanner;


public class Solution {
	public static void diamondOfStars(int n) {
        
        
        Scanner scan =new Scanner(System.in);
		//int n = scan.nextInt();
        int i=1;
        int k=(n+1)/2;
        if(n%2!=0) {
        	
        	
        		while(i<=k) {
        		int j=1;
        		
        		while (j<=k-i) {
        			System.out.print(" ");
        			j++;
        		}
        		j=1;
        		while(j<=i) {
        			System.out.print("*");
        			j++;
        		}
        		j=1;
        		while(j<=i-1) {
        			System.out.print("*");
        			j++;
        		}
        		
     		System.out.println();
       		i++;
        	}
        		i=1;
        	while(i<=k-1) {
        		int j=1;
        		while(j<=i) {
        			System.out.print(" ");
        			j++;
        		}
        		j=1;
        		while(j<=2*(k-i)-1) {
        			System.out.print("*");
        			j++;
        		}
        		System.out.println();
        		i++;
        	}
        		
        		
        	
        	
        }
        
        else {
        	return;
        }
		
	}
}
