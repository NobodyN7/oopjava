package uni.iit.miskolc;

import java.util.Arrays;
import java.util.Random;

public class Wallis {

	//3. feladat
	private static int faktorialis(int n)
	{
		int fakt = 1;
		for(int i = 2; i < n+1;i++)
		{
			fakt *= i;
		}
		return fakt;
	}
	private static int rekfact(int n)
	{
		if(n == 1) {
			return 1;
		}
		else {
			return n * rekfact(n - 1);
		}
	}
	//4. feladat
	private static boolean isPrime(int n) {
		for(int i = 2; i < n;i++) {
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	//4. feladat: Linearis Kereses
	private static int search(int n, int[] array){
		int i = 0;
		while(i < array.length && array[i] != n)
			i++;
		if(i < array.length)
			return array[i]; 
		return -1;
	}
	//4.feladat: rendezes
	private static int[] sort(int[] array) {
		Arrays.sort(array);
		return array;
	}
	public static void main(String[] args) {
		//1. feladat
		double pi=1;
		for(double i = 1; i < 10000; i++) {
			pi*=((2*i)/(2*i-1))*((2*i)/(2*i+1));
		}
		System.out.println(pi*2);
		//2. feladat
		pi=0.0;
		for(double i = 0; i < 10000; i++) {
			pi+=(2/((4*i + 1)*(4*i + 3)));
		}
		System.out.println(pi*4);
		System.out.println("for-ral: " + faktorialis(10));
		System.out.println("Rekurzioval: " + rekfact(10));
		for(int i = 2; i <= 100; i++){
			for(int j = 0; j <= 100; j++) {
				if(isPrime(i) && isPrime(j) && i + 2 == j){
					System.out.println("i= " + i + ", j= " + j);
				}
			}
		}
		//5. feladat
		int i = 0;
		while(true){
			if(i == 6) {
				break;
			}
			else {
				for (int j = 0; j < i; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
				i++;
			}
		}
		int[] tomb = { 5, 23 , 43, 12, 65, 54, 24 , 11, 87, 79 };
		System.out.println("Result: " + search(65, tomb));
		//4. feladat kozvetlen kivalasztasos rendezes
		tomb=sort(tomb);
		for(i = 0; i < tomb.length; i++){
			System.out.println(tomb[i]);
		}
	}
}
