import java.util.Scanner;

public class Game {
	
	public void playGame() { //METHOD TO SET THE NAME
		int a = (int) Math.ceil((Math.random() * 9));
		int b = (int)(Math.random() * 10);
		int c = (int)(Math.random() * 10);
		
		System.out.printf("What is the sum of %d%d%d? %n", a,b, c);
		
		Scanner add = new Scanner(System.in);
		int result = add.nextInt();
		
		if (a + b + c == result) {
			System.out.println("Answer is correct");
				
		}
		
		if (a + b + c != result) {
			System.out.println("Answer is incorrect");
		}
	}
	


	
		
	

}
