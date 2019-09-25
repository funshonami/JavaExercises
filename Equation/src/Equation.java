import java.util.Scanner;

public class Equation {
	public void runEquation() {


		Scanner bring =new Scanner(System.in);
		
		System.out.println("Enter Value for a");
		double a = bring.nextDouble();
		System.out.println("Enter Value for b");
		double b = bring.nextDouble();		
		System.out.println("Enter Value for c");
		double c = bring.nextDouble();
		
		double calculate = ((b * b) - (4 * a * c));
		
		if (calculate > 0) {
			double r1 = (-b + Math.pow(calculate, 0.5)) / (2 *a);
			double r2 = (-b - Math.pow(calculate, 0.5)) / (2 *a);
			System.out.printf("The equation has two roots: %f and %f", r1, r2);
		}
		
		if (calculate == 0) {
			double r1 = -b/(2 *a);
			double r2 = r1;
			System.out.printf("The equation has one root: %f", r2);
		}
		
		if (calculate < 0) {
			System.out.println("INVALID: The Equation has no real roots");
		
 	}
	}
}
	
