
public class Employee {
	private String firstName;
	private String lastName;
	private double monthlyPay;

	public Employee(String name, String surname, double pay) {
		firstName = name;
		lastName = surname;
		monthlyPay = pay;
		if (monthlyPay < 0) {
			monthlyPay = 0;
		}

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlyPay() {

		return monthlyPay;
	}

	public void setMonthlyPay(double monthlyPay) {
		if (monthlyPay < 0) {
			monthlyPay = 0;
		} 
		if (monthlyPay > 0){
			this.monthlyPay = monthlyPay;
		}
	}

	public void setEmployeeRaise(int rate) {
		monthlyPay = monthlyPay + (monthlyPay * rate / 100);
	}


	public double getAnnualSalary() {
		double employeeAnnual = (monthlyPay * 12);
		return employeeAnnual;
	}
}
