package hu.iit.uni.miskolc.oop;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		int numberOfFilms = scan.nextInt();
		int random;
		Model[] movie = new Model[numberOfFilms];
		
		for(int i = 0; i < numberOfFilms; i++)
		{
			random = rnd.nextInt(4);
			switch(random)
			{
				case 0:
					movie[i] = new Model("Movie" + i, "Producer" + i, FilmCategory.SCIFI, rnd.nextInt(50)+ 1950, "Character" + rnd.nextInt(5)+ ", " + "Character" + rnd.nextInt(5) + 5);
					break;
				case 1:
					movie[i] = new Model("Movie" + i, "Producer" + i, FilmCategory.ROMCOM, rnd.nextInt(50)+ 1950, "Character" + rnd.nextInt(5)+ ", " + "Character" + rnd.nextInt(5) + 5);
					break;
				case 2:
					movie[i] = new Model("Movie" + i, "Producer" + i, FilmCategory.ACTION, rnd.nextInt(50)+ 1950, "Character" + rnd.nextInt(5)+ ", " + "Character" + rnd.nextInt(5) + 5);
					break;
				case 3:
					movie[i] = new Model("Movie" + i, "Producer" + i, FilmCategory.OTHER, rnd.nextInt(50)+ 1950, "Character" + rnd.nextInt(5)+ ", " + "Character" + rnd.nextInt(5) + 5);
					break;
				default:
					break;
			}
		}
		
		public static void searchByTitle(String title){
			for(Model film : movie)
			{
				if(film.getTitle().equals(title))
					film.toString();
			}
		}

	}

}
