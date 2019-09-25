import java.util.Scanner;

public class Operands {
	private int a;
	private int b;
	private char operator;
	//private int result;
	/*Write a code that will accept two operands and an operation and evaluates
	 * it based on the operation passed.
	 */
	
	public int calculateOperands() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st Number: " );
		a= input.nextInt();
		System.out.println("Enter 2nd Number: " );
		b= input.nextInt();
		
		System.out.println("Enter Operation: " );
		operator= input.next().charAt(0);
		
		int result=0;
		switch(operator) {
		case '+':
			result= a + b;
			break;
		case '-':
			if (a < b) {
				System.out.println("Cannot deal with negative numbers");
			}
			else {
				result = a - b;
			}
			
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			System.out.println("Not a valid operation");
			break;
			
		}
		return result;
	}

}
