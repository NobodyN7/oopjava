package hu.iit.uni.miskolc.oop;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		
		/*
		 * 2. K�szitsen egy futtathat� oszt�lyt, amelyben l�trehoz 10 darab t�glalap t�p t�pus� objektumot �s
		 * elt�rolja a referenci�jukat egy t�mbben, v�letlenszer�en gener�lva az oldalaikat a 2-10 tartom�nyban
		 */
		
		Rectangle[] rectangle = new Rectangle[10];
		Random rnd = new Random();
		for(int i = 0; i < rectangle.length; i++){
			rectangle[i] = new Rectangle(rnd.nextInt(9) + 2, rnd.nextInt(9) + 2);
		}
		
		Rectangle minRectangle = rectangle[0];
		for(int i = 1; i < rectangle.length; i++){
			if(minRectangle.isBigger(rectangle[i])){
				minRectangle = rectangle[i];
			}
		}
		for(Rectangle rectangles : rectangle){
			rectangles.toString();
		}
		
		Scanner scanner = new Scanner(System.in);
		Rectangle userRectangle;
		System.out.println("T�glalap a oldala:");
		int aSide = scanner.nextInt();
		System.out.println("T�glalap b oldala:");
		int bSide = scanner.nextInt();
		userRectangle = new Rectangle(aSide, bSide);
		System.out.println(userRectangle);
		//sz�molja meg az ett�l kisebb t�r�leti t�glalapokat
		int count = 0;
		for(int i = 0; i < rectangle.length; i++){
			if(userRectangle.isBigger(rectangle[i])){
				count++;
			}
		}
		System.out.println(count + "db kisebb t�glalap van");
		
		
		
		for (int i = 0; i < rectangle.length; i++){
			if(rectangle[i].equals(userRectangle)){
				System.out.println(i);
				break;
			}
			else if(i == rectangle.length){
				System.out.println("nincs ilyen");
			}
		}
		scanner.close();
	}

}
