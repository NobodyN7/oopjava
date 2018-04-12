package hu.iit.uni.miskolc.hu.oop.Colorable;

import java.awt.Color;

public interface Colorable {

	Color defaultColor = Color.RED;
	
	Color getColor();
	
	void setColor(Color color);
}
