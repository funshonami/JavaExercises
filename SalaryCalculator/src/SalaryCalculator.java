import java.util.Scanner;

public class SalaryCalculator {
	private int hoursWorked;
	private int perHour;
	private double grossPay;
	
	
	public SalaryCalculator() {
		
	}
	
	public double calculatePay() {
		Scanner input = new Scanner(System.in);
		System.out.println("Input number of hours worked: ");
		hoursWorked =input.nextInt();
		System.out.println("Hourly rate: ");
		perHour =input.nextInt();
		
		if (hoursWorked > 40) {
			grossPay = ((1.5 * (hoursWorked -40)) + 40) * perHour;
		}
		
		else if (hoursWorked <= 40){
			grossPay = hoursWorked * perHour;
			
		}
		return grossPay;
	}

}
