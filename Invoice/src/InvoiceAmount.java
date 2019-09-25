import java.util.Scanner;

public class InvoiceAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bring = new Scanner(System.in);
		Scanner gba = new Scanner(System.in);
		
		System.out.println("Enter Part Number:");
		String a = gba.nextLine();
		System.out.println("Enter Part Description:");
		String b = gba.nextLine();
		System.out.println("Enter Quantity: ");
		int x = bring.nextInt();
		System.out.print("Enter Price: ");
		double y = bring.nextDouble();
		
		Invoice funsho =new Invoice(a, b,x, y);
		double invoiceAmount =funsho.getInvoiceAmount();
		System.out.printf("Invoice is %f",invoiceAmount);

	}

}
