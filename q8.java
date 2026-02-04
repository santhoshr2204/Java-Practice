package lab_2;

import java.util.Scanner;

public class q8{
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	System.out.print("enter Number: ");
	int x=scan.nextInt();
	int q=1;
	for (int i=1;i<=x;i++) {
		System.out.print(q);
		System.out.print(" ");
		q+=2;
		
	}
	
	}
}