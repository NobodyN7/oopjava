package hu.iit.uni.miskolc.oop.geometry;

public class Barrel extends Prism {

	//Sugár addattag
	private double radius;
	
	//Konstruktor, sugár és magasságal
	public Barrel(int height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	//Kiszámolja az alap területét
	@Override
	public double getBaseArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	//Stringbe kiírás
	public String toString() {
		return "Barrel, radius: " + radius + ", height: " + getHeight();
	}

	
}
