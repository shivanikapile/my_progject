package mypackage;

import java.util.Scanner;

public class switch_calculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		

		int a =sc.nextInt();
		int b =sc.nextInt();
		System.out.println("choose operation \n 1,2,3,4");
		int operation = sc.nextInt();
		switch (operation) {

		case 1:
			System.out.println("Addition of two numbers " + a+ b);
			
			break;
		case 2:
			System.out.println("subtraction is " + (a-b));
			break;

		case 3:
			System.out.println("multiplication  of two numbers " + a * b);
			break;
		case 4:
			System.out.println("division of two numbers " + a / b);
			break;

		default:
			System.out.println(" invalid operation ");

		}
	}
}
