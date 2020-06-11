package assignment_5;

public class Question13 {

	public static void main(String[] args) {
		
		for (int i=1;i<=8;i++) {
			
			if (i%2!=0) {
				
				for(int j=1;j<=8;j++) {
				
					if (j%2!=0) {
						System.out.print("W" + " ");
					
					}else {
						System.out.print("B" + " ");
					}
						
				}
			
			}else {
			
				for(int j=1;j<=8;j++) {
				
					if (j%2!=0) {
						System.out.print("B" + " ");
					
					}else {
						System.out.print("W" + " ");
					}	
						
				}
			}
			
			System.out.println(" ");
			
		}

	}

}
