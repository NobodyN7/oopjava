package hu.iit.uni.miskolc.hu.oop.point;

import hu.iit.uni.miskolc.hu.oop.Colorable.Colorable;

public class Point {

	private int xCoord;
	private int yCoord;
	
	public Point(int xCoord, int yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	@Override
	public String toString() {
		return "Point [xCoord=" + xCoord + ", yCoord=" + yCoord + "]";
	}
	
	
	
}
