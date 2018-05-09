package hu.iit.uni.miskolc.hu.oop.fut;

import hu.iit.uni.miskolc.hu.oop.*;

public class RockWell {

	public static void main(String[] args) {
		OvatosDiak jani = new OvatosDiak("Jani", 12000, 300);
		boolean van;
		van = true;
		int i = 0;
		while(van) {
			van = jani.drinkBeer(300);
			if(van == false)
				break;
			i++;
			System.out.println(i + "-edik sör, " + jani.toString());
		}

	}

}
