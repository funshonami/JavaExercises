/*  Write a code that  accept a number from a user, check if the number is even
  number. if the the number is not even, print the number, else print the entered
 value and all the even number between 0 and the entered number. */


import java.util.Scanner;
public class Even {
	public void checker() {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number1 = input.nextInt();

		//Determine if output is EVEN or ODD
/*		if (number1 % 2 != 0) {
			System.out.println(number1);
		  }
		
		
		else if (number1 % 2== 0) 
			for(int a=2; a<=number1; a= a+2) {
			System.out.printf("%d\t%n", a);
			
			}
		
		// if(?) Else(:)
		System.out.println(number1 > 10? "Greater than 10" : "Less than 10");
*/		
		for (int number=0, total=0; number<20; number ++, total++, total+=number) {
			System.out.println(total);
		}
		 
		 }
	
		}




