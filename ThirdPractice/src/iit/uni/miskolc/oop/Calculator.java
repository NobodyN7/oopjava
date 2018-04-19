package iit.uni.miskolc.oop;

import java.io.BufferedReader;
import java.util.Scanner;

import iit.uni.miskolc.oop.exception.DivisionByZeroException;

public class Calculator {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while(true){
			calculation = scanner.nextLine();
			System.out.println(calculation);
			firstNumber = Double.parseDouble(calculation.split(" ")[0]);
			secondNumber = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
			try {
				Util.calculate(operator, firstNumber, secondNumber);
			} catch (DivisionByZeroException e) {
				e.printStackTrace();
			}
			finally{
				
			}
		}
	}

}
