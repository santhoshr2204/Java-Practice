package lab_2;

import java.util.Scanner;

public class q13{
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter value: ");
		int x =scan.nextInt();
		for(int j=1;j<=x;j++) {
			for(int i =x-j;i>0;i--) {
				System.out.print(" ");
			}
			for(int q=1;q<=(2*j-1);q++) {
				System.out.print("*");
			}
			for (int w=(x-j);w>0;w--) {
				if(w==1) {
					System.out.println(" ");
				}
				else {
					System.out.print(" ");
				}
			}
		}
	}
}