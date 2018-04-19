package iit.uni.miskolc.oop;

import iit.uni.miskolc.oop.exception.DivisionByZeroException;

public class Util 
{
	public static void calculate(String operator, Double firstNumber, Double secondNumber) throws DivisionByZeroException, IllegalArgumentException{
		System.out.print("Result: ");
		switch(operator){
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
		case "/":
			if(!secondNumber.equals(0.0))
				System.out.println(firstNumber / secondNumber);
			else
				throw new DivisionByZeroException();
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		default:
			throw new IllegalArgumentException("Unknown operator");
		}
	}
}
