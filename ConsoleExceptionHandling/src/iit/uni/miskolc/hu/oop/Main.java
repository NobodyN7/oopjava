package iit.uni.miskolc.hu.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] array = new int[5];
		//Beolvas Scanner osztály nextInt() metódusával
		/*for(int i = 0; i < array.length; i++){
			try{
				array[i] = scanner.nextInt();
			} catch(InputMismatchException e){
				System.out.println("You retard, type a number for fucks sake, how hard is it you absolute donkey?");
			}
		}*/
		//Beolvasás Scanner osztály nextLine() metodusával és típus konverzióval
		for(int i = 0; i < array.length; i++){
			try{
				array[i] = readFromConsole();
			} catch(IllegalArgumentException e){
				System.out.println("negatív szám nem lehet");
			}
		}
		for(int number : array){
				System.out.println(number);
		}

	}
	public static int readFromConsole() throws IllegalArgumentException, NotPrimeException {
		int number = 0;
		while(true){
			try{
				number = Integer.parseInt(scanner.nextLine());
				break;
			} catch(NumberFormatException e){
				System.out.println("Nem szám");
			}
		}
		if(number < 1){
			throw new IllegalArgumentException();
		}
		if(notPrime(number)){
			throw new NotPrimeException();
		}
		return number;
	}
	
	private static boolean notPrime(int number){
		for(int i = 2; i < number; i++){
			if(number % i == 0)
				return true;
		}
		return false;
	}

}
