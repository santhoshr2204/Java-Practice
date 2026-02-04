package lab_2;

import java.util.Scanner;
public class q9{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int x=scan.nextInt();
		
		for (int i=1;i<=x;i++) {
			for (int j=1;j<=i;j++) {
				if (j!=i) {
					System.out.print("*");
		        } 
				else {
					System.out.println("*");
				}
			}   
		}
	}
}