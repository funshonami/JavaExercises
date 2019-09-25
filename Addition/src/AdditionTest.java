import java.util.Scanner;

public class AdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bring = new Scanner(System.in);
		System.out.printf("Enter value for x: ");
		int x = bring.nextInt();
		
		Addition calc = new Addition(x,4);
		Addition calculate = new Addition(x,6);
		calc.add();//Calling the Method called: ADD 
		calculate.add();
		int result = calc.add();
		
		System.out.println(result);
		System.out.print(calculate.add());

	}

}
