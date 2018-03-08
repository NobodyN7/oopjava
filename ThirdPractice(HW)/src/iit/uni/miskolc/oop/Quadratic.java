package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Integer firstNumber, secondNumber, thirdNumber;
		Scanner scan = new Scanner(System.in);
		String in;
		while(true) {
			System.out.println("Type 0 if you are done, otherwise 1 if you want to calculate more");
			in = scan.nextLine();
			if(in.contains("0")) {
				break;
			}
			else {
				System.out.println("Enter the first number: ");
				firstNumber = scan.nextInt();
				System.out.println("Enter the second number: ");
				secondNumber = scan.nextInt();
				System.out.println("Enter the third number: ");
				thirdNumber = scan.nextInt();
				Util.quadratic(firstNumber, secondNumber, thirdNumber);
			}
			in = scan.nextLine();
		}
		
	}
}
