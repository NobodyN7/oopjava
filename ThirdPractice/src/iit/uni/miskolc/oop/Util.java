package iit.uni.miskolc.oop;

public class Util 
{
	public static void calculate(String operator, Double firstNumber, Double secondNumber){
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
				System.out.println("Can't divide with 0");
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		default:
			System.out.println("The specified calculation could not be recognized");
			break;
		}
	}
}
