package assignment_5;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int num = scan.nextInt();
			int product = num*10;
			System.out.println(product);
			
			while (product<=100) {
							
				System.out.print("Enter a number: ");
				num = scan.nextInt();
				product = num*10;
				System.out.println(product);
			}
					
			if (product>100) {
				System.out.println("The value is bigger than 100");
			}
		}
		
		

	}

}
