import java.util.Scanner;

public class CompoundInterest {
	
	private double principal;
	private double rate;
	private int numberOfYears;
	private double amount = 0;
	
	public CompoundInterest() {
	
	}
	
	public double compoundInterestCalc() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Principal: ");
		principal = input.nextInt();
		System.out.println("Enter Rate: ");
		rate = input.nextInt();
		System.out.println("Enter Years: ");
		setNumberOfYears(input.nextInt());
		
		//for(int i = 1; i <= numberOfYears; i++) {
		//	amount = principal * (1+ (rate/100)); OR THE OPTION BELOW
			amount = principal * (Math.pow(1 + (rate/100), getNumberOfYears()));
			principal = amount;
		
			
		//}
		return principal;
		
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	

}
