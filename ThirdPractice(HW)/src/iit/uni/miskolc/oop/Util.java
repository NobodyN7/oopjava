package iit.uni.miskolc.oop;

public class Util {
	public static void quadratic(Integer a, Integer b, Integer c) {
		Double x1, x2, D;
		if(a == 0) {
			System.out.println("The given equation is not quadratic");
			return;
		}
		D = (double)(b * b) - (4 * a * c);
		if(D < 0) {
			System.out.println("The equation does not have a real root");
		}
		else {
			x1 = (-b + Math.sqrt(D)) / (2 * a);
			x2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("The root(s) of the given equation is(are): ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		return;
		
	}
}
