package hu.iit.uni.miskolc.oop.geometry.runable;

import hu.iit.uni.miskolc.oop.geometry.Barrel;
import hu.iit.uni.miskolc.oop.geometry.Cuboid;

public class Main {

	public static void main(String[] args) {
		Barrel barrel = new Barrel(10, 10);
		System.out.println(barrel);
		System.out.println(barrel.getVolume());
		
		
		Cuboid cuboid = new Cuboid(10, 10, 10);
		System.out.println(cuboid);
		System.out.println(cuboid.getVolume());
		
		System.out.println("The barrel is bigger: " + barrel.isBigger(cuboid));
	}
}
