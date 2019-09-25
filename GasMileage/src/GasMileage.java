import java.util.Scanner;

public class GasMileage {
	int mile = 0;
	int newMile = 0;
	int gallon = 0;
	int newGallon = 0;
	double average = 0;
	
	
	
	public GasMileage() {


}
	public double averageTrip() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Miles covered: ");
		mile = input.nextInt();
		newMile= newMile + mile;
	
		System.out.print("Enter Gallons used: ");
		gallon = input.nextInt();
		newGallon = newGallon + gallon;
		
		average =(double) mile/gallon;
		System.out.printf("Average trip is: %.2f %s%n%n", average, "miles per gallon");
		
		System.out.print("Enter 1 if you have more trips: ");
		 int result =input.nextInt();
			if(result == 1) 
				averageTrip();
			
		double totalAverage = (double)newMile/newGallon;
		
		return totalAverage;
	}
	
}