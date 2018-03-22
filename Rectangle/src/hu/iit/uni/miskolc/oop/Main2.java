package hu.iit.uni.miskolc.oop;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		
		/*
		 * 2. Készitsen egy futtatható osztályt, amelyben létrehoz 10 darab téglalap típ típusú objektumot és
		 * eltárolja a referenciájukat egy tömbben, véletlenszerûen generálva az oldalaikat a 2-10 tartományban
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
		System.out.println("Téglalap a oldala:");
		int aSide = scanner.nextInt();
		System.out.println("Téglalap b oldala:");
		int bSide = scanner.nextInt();
		userRectangle = new Rectangle(aSide, bSide);
		System.out.println(userRectangle);
		//számolja meg az ettõl kisebb térületi téglalapokat
		int count = 0;
		for(int i = 0; i < rectangle.length; i++){
			if(userRectangle.isBigger(rectangle[i])){
				count++;
			}
		}
		System.out.println(count + "db kisebb téglalap van");
		
		
		
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
