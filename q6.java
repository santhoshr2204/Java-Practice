package lab_2;

import java.util.Scanner;

public class q6{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter multiplication Table to be printed: ");
		int x=scan.nextInt();
		for (int i=1;i<=10;i++) {
			int val = i*x;
			System.out.print(x);
			System.out.print(" * ");
			System.out.print(i);
			System.out.print(" = ");
			System.out.println(val);
			
			
		}
	}
}