import java.util.Scanner;

public class ExampleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Part Number: ");
		String a =input.nextLine();
		System.out.print("Enter Part Description: ");
		String b =input.nextLine();
		System.out.print("Enter quantity bought: ");
		int c =input.nextInt();
		System.out.print("Price per item: ");
		double d =input.nextDouble();
		
		Example test= new Example(a,b,c,d);
		double funsho= test.getInvoiceAmount();
		
		System.out.printf("Your invoice is: %n Part number: \t%s%n Part Description: \t%s%n Total Amount: \t%.2f",a,b,funsho);

	}

}
