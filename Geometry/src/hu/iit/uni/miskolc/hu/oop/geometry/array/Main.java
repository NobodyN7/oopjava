package hu.iit.uni.miskolc.hu.oop.geometry.array;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Cuboid;

public class Main {

	public static void main(String[] args) {
		PrismArray prismArray = new PrismArray(5);
		
		prismArray.setPrism(0, new Barrel(5, 10));
		prismArray.setPrism(1, new Barrel(20, 30));
		prismArray.setPrism(3, new Cuboid(5, 10, 10));
		prismArray.setPrism(4, new Cuboid(5, 10, 20));
		
		for(int i = 0; i < 5; i++) {
			System.out.println(prismArray.getPrism(i));
		}
		System.out.println("Average volume: " + prismArray.getAverageVolume());
		System.out.println("Number of barrels: " + prismArray.getBarrelCount());
		System.out.println("Nulls: " + (prismArray.getArraySize() - prismArray.getNoNull()));
	}
}
