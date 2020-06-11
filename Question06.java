package assignment_5;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Enter the number of terms, n");
			int n = scan.nextInt();
			int k1 = 0, k2=1,k3;
			System.out.println("1.term: " + k1);
			System.out.println("2.term: " + k2);
			for (int i=2;i<n;i++) {
				
				k3=k1+k2;
				System.out.println((i+1) + ".term: " + k3);
				k1=k2;
				k2=k3;
							
			}
		}
		
		
		
	}

}
