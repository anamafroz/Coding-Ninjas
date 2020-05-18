/**

Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet

**//




import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String str= scan.next();
		char c = str.charAt(0);
		if(c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='f'||c=='g'||c=='h'||c=='i'||c=='j'||c=='k'||c=='l'||c=='m'||c=='n'||c=='o'||c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='u'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z') {
			System.out.println(0);
		}else if(c=='A'||c=='B'||c=='C'||c=='D'||c=='E'||c=='F'||c=='G'||c=='H'||c=='I'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N'||c=='O'||c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='U'||c=='V'||c=='W'||c=='X'||c=='Y'||c=='Z'){
		System.out.println(1);
		}else {
			System.out.println(-1);
		}

	}
}
