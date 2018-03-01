package iit.uni.miskolc.oop;

import java.util.Scanner;

public class Mean {
	public static void main(String[] args){
		int size = 10;
		double[] array = new double[size];
		double mean = 1.0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < size; i++)
		{
			array[i] = scan.nextDouble(); 
		}
		for(double A : array)
		{
			System.out.println(A);
		}
		for(double D : array){
			mean *= D;
		}
		System.out.println("Result :" + Math.pow(mean, 1.0/size));
	}

}
