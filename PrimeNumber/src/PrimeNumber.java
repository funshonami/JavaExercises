import java.util.Scanner;

public class PrimeNumber {
	private int value;
	
	
	public PrimeNumber() {
		
	}
	/*
	 * Collect value from user
	 * Save value
	 * divide value by counter and record number
	 * check number less than two as prime
	 * check number more than two as not prime
			*/
	public void checkPrime() {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter value: ");
		value = input.nextInt();
		
		int count = 0;
		for (int i = 1; i < value ; i++) {
		if (value % i == 0)
			count++; 
		}
		if (count >1) {
			System.out.println("The number is not a prime number");
			}
		else {
			System.out.println("The number is a prime number");
		}
		}
	
	}


