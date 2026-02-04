package lab_2;

import java.util.Scanner;
public class q4{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
		for (int i=1;i<=10;i++) {
			System.out.print("Enter Values ");
			System.out.print(i);
			System.out.print(": ");
			int j=scan.nextInt();
			sum+=j;
			
		}
		double avg=sum/10;
		System.out.print("Sum: ");
		System.out.println(sum);
		System.out.print("Average: ");
		System.out.println(avg);
		
		
	}
}