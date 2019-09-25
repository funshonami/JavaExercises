
public class EmployeeTest {

	public static void main(String[] args) {
		Employee number=new Employee("Chris", "Ifogah", -1);
		Employee number2=new Employee("Toyin", "Olorunfemi", 700);
		
		System.out.printf("%s %s's annual salary is: %.2f%n", number.getFirstName(), number.getLastName(), number.getAnnualSalary());
		System.out.printf("%s %s's annual salary is: %.2f%n", number2.getFirstName(), number2.getLastName(), number2.getAnnualSalary());
		
		number.setMonthlyPay(200);
		number.setEmployeeRaise(10);
		number2.setEmployeeRaise(10);
		
		System.out.printf("%s %s's New annual salary is: %.2f%n", number.getFirstName(), number.getLastName(), number.getAnnualSalary());
		System.out.printf("%s %s's annual salary is: %.2f%n", number2.getFirstName(), number2.getLastName(), number2.getAnnualSalary());
		//System.out.printf("Annual raise: ", number.getAnnualSalary();

	}

}
