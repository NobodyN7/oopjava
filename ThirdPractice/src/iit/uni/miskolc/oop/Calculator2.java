package iit.uni.miskolc.oop;

import java.util.Scanner;

import iit.uni.miskolc.oop.exception.DivisionByZeroException;

public class Calculator2 {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String operator;
		Double firstNumber;
		Double secondNumber;
		while(true)
		{
			System.out.println("Enter the first number: ");
			firstNumber = scanner.nextDouble();
			System.out.println("Enter the second number: ");
			secondNumber = scanner.nextDouble();
			System.out.println("Enter operator: ");
			operator = scanner.next();
			try {
				Util.calculate(operator, firstNumber, secondNumber);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DivisionByZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
