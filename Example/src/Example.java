
public class Example {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Example(String number, String description, int quant, double ego) {
		partNumber=number;
		partDescription=description;
		quantity=quant;
		price=ego;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount() {
		if (quantity<0) {
			quantity=0;
			
		}
		if (price<0) {
			price=0;
		}
		double invoiceAmount = price * quantity;
		return invoiceAmount;
	}

}
