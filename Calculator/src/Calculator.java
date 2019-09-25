// pg 527 (4.18)

import java.util.Scanner;

public class Calculator {
	private int accountNumber;
	private int balance;
	private int charges;
	private int credits;
	private int creditLimit;
	
	public Calculator() {
		
	}
	public void runCalculator() {


		Scanner bring =new Scanner(System.in);
		
		System.out.println("Enter Balance");
		balance = bring.nextInt();
		System.out.println("Enter Value for Items Charged");
		charges = bring.nextInt();		
		System.out.println("Enter Value for All Credits Applied");
		credits = bring.nextInt();
		System.out.println("Enter credit Limit");
		creditLimit = bring.nextInt();
		
		int calculate = (balance + charges - credits);
		System.out.printf("New Balance is: %d%n", calculate);
		
		if(calculate > creditLimit) {
			System.out.println("Credit limit exceeded");
		}
		
		else if (calculate <creditLimit) {
			System.out.println("Proceed with payment");
		}
		
	}	
}
