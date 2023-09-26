package determiningthegrade;

import java.util.Scanner;


public class app {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter your score: "); 
		int score = scanner.nextInt();
	   
		char grade = (score >= 90) ? 'A' :
			(score >= 80) ? 'B' :
				(score >= 70) ? 'C' :
					(score >= 60) ? 'D' :
						'F';
		
		System.out.println("The students grade is: " + grade) ;
}
}