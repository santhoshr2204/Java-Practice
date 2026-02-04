package lab_2;

import java.util.Scanner;

public class q7{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter multiplication Table to be printed: ");
		int x=scan.nextInt();
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=x;j++) {
				
				int val = i*j;
				System.out.print(j);
				System.out.print(" * ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.print(val);
				if (j==x) {
					System.out.println("    ");
				}
				else {
					System.out.print("    ");
				}
				}
		}
	}
}