package hu.iit.uni.miskolc.hu.oop.point;

import java.awt.Color;

import hu.iit.uni.miskolc.hu.oop.Colorable.Colorable;

public class ColoredPoint extends Point implements Colorable {

	private Color color;
	
	public ColoredPoint(Color color) {
		super(0, 0);
		this.color = color;
	}

	public ColoredPoint(int xCoord, int yCoord, Color color) {
		super(xCoord, yCoord);
		this.color = color;
	}
	@Override
	public Color getColor() {
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
	}
	
}
