package assignment_5;

public class Question03 {

	public static void main(String[] args) {
		int j=0;
		for (int i=5; i<=50; i++){
			
			if (i%2==0) {
				System.out.print(i + " ");
				j++;
			}
			
		}
				System.out.println("\nThe Number of Even Number: " + j);

	}

}
