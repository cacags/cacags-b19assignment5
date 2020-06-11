package assignment_5;

public class Question08 {

	public static void main(String[] args) {
		int i=1;
		int sum1=0,sum2=0,sum3=0;
		while(i<=100) {
			
			if (i<=5) {
				sum1+=i;
			
			}if(i<=11) {
				sum2+=i;
			
			}if(i<=100) {
				sum3+=i;
			}
			
		i++;
			
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		

	}

}
