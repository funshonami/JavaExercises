import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Distance covered: ");
		int miles =input.nextInt();
		Car benz = new Car("M Class", "White", miles);
		
		benz.setMileage(miles);
		//benz.drive(30);
		System.out.printf("Cars current mileage is:  %d%n", benz.getMileage());
		
		for(int a=0; a<2; a++) {
			System.out.println("1");
		}
		
		


	}

}
