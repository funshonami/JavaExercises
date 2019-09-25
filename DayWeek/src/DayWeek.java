import java.util.Scanner;

public class DayWeek {
	int number;
	
	
	public DayWeek() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: " );
		number= input.nextInt();
		int result = 1 + (number/7);
		switch(number%7) {
		case 0:
			if (number<7) {
				System.out.println("This is Sunday and Week 1");
			}
			else {
			System.out.printf("This is Sunday and Week: %d", result);
			}
			break;
		case 1:
			if (number<7) {
				System.out.println("This is Monday and Week 1");
			}
			else {
			System.out.printf("This is Monday and Week: %d", result);
			}
			break;
		case 2:
			if (number<7) {
				System.out.println("This is Tuesday and Week 1");
			}
			else {
			System.out.printf("This is Tuesday and Week: %d", result);
			}
			break;
		case 3:
			if (number<7) {
				System.out.println("This is  Wednesday and Week 1");
			}
			else {
			System.out.printf("This is Wednesday and Week: %d", result);
			}
			break;
		case 4:
			if (number<7) {
				System.out.println("This is Thursday and Week 1");
			}
			else {
			System.out.printf("This is Thursday and Week: %d", result);
			}
			break;
		case 5:
			if (number<7) {
				System.out.println("This is Friday and Week 1");
			}
			else {
			System.out.printf("This is Friday and Week: %d", result);
			}
			break;
		case 6:
			if (number<7) {
				System.out.println("This is Saturday and Week 1");
			}
			else {
			System.out.printf("This is Saturday and Week: %d", result);
			}
			break;
		default:
			System.out.println("Not a valid Day");
			break;
			}
		
	}

}
