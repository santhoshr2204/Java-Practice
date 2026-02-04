package lab_2;

import java.util.Scanner;
public class q3{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter n: ");
		int i =scan.nextInt();
		int sum=0;
		for (int j=1;j<=i;j++) {
			if (j!=i) {
				System.out.print(j);
				sum+=j;
			}
			else {
				System.out.println(j);
				sum+=j;
			}
		}
		System.out.println(sum);
		
		
	}
}