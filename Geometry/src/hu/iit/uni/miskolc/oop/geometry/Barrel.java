package hu.iit.uni.miskolc.oop.geometry;

public class Barrel extends Prism {

	//Sug�r addattag
	private double radius;
	
	//Konstruktor, sug�r �s magass�gal
	public Barrel(int height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	//Kisz�molja az alap ter�let�t
	@Override
	public double getBaseArea() {
		return Math.pow(radius, 2) * Math.PI;
	}

	//Stringbe ki�r�s
	public String toString() {
		return "Barrel, radius: " + radius + ", height: " + getHeight();
	}

	
}
