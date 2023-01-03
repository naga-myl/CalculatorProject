package calproject;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		double a, b, div;
		int sum = 0, diff = 0, mul = 1;
		Scanner s = new Scanner(System.in);
		int operation;
		System.out.println("Which operation do you want to perform(0-3):");
		operation = s.nextInt();
		if (operation == 0) {
			System.out.println("You choose to perform addition");
		} else if (operation == 1) {
			System.out.println("You choose to perform subtraction");
		} else if (operation == 2) {
			System.out.println("You choose to perform Multiplication");
		} else if (operation == 3) {
			System.out.println("You choose to perform  Division");
		} else
			System.out.println("You choose wrong input, please enter between 0-3");


		switch (operation) {

		case 0:
			int n;
	
			System.out.println("How many numbers you want to perfom Addition:");
			Scanner s1 = new Scanner(System.in);
			n = s1.nextInt();
			System.out.print("enter " + n + " values:");
			for (int i = 0; i < n; i++) {
				int val = s1.nextInt();
				sum = sum + val;
			}
			System.out.println("The sum of "+ n +" numbers is  :" + sum);
			s1.close();
			break;

		case 1:
			int n1;
			System.out.println("Enter on how many number subtraction is performed:");
			Scanner s2 = new Scanner(System.in);
			n1 = s2.nextInt();
			System.out.println("Enter the first number to subtract:");
			diff = s2.nextInt();
			System.out.print("enter " +( n1-1)+ " values:");
			for (int i = 2; i <= n1; i++) {
				int val = s2.nextInt();
				diff = diff - val;
			}

			System.out.println("The differenece of "+( n1-1)+" numbers is :" + diff);
			s2.close();
			break;

		case 2:
			int n2;
			System.out.println("Enter on how many numbers multiplication is performed:");
			Scanner s3 = new Scanner(System.in);
			n2 = s3.nextInt();
			System.out.print("enter " + n2 + " values:");

			/** Using for loop to iterate for the "N2" numbers to perform Multiplication **/

			for (int i = 0; i < n2; i++) {
				int val = s3.nextInt();
				mul = val * mul;
			}

			System.out.println("The multiplication of "+ n2 +" numbers is:" + mul);
			s3.close();
			break;

		case 3:
			System.out.println("Enter the values for a and b:");
			Scanner s4 = new Scanner(System.in);
			a = s4.nextInt();
			b = s4.nextInt();
			
			if (b == 0) {
				System.out.println("Division is not performed");

			}
			
			else {
				div = a / b;
				System.out.println("Division of the numbers is :" + div);
			}
			break;
		}// switch

		s.close();
	}
}
