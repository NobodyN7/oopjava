package hu.iit.uni.miskolc.oop;

import java.awt.Color;

import hu.iit.uni.miskolc.hu.oop.Colorable.Colorable;
import hu.iit.uni.miskolc.hu.oop.point.ColoredPoint;
import hu.iit.uni.miskolc.hu.oop.point.Pen;

public class Main {

	public static void main(String[] args) {

				Colorable coloredPoint = new ColoredPoint(10, 20, Color.BLACK);
				System.out.println(coloredPoint);
				coloredPoint.setColor(Color.BLUE);
				System.out.println(coloredPoint);

				Colorable coloredPen = new Pen("asd", 10, 10, Color.GREEN, "Singetta");
				System.out.println(coloredPen);
				coloredPen.setColor(Color.BLUE);
				System.out.println(coloredPen);
				
				setColorToDefaultColor(coloredPoint);
				System.out.println(coloredPoint);
				setColorToDefaultColor(coloredPen);
				System.out.println(coloredPen);

				



			}

			private static void setColorToDefaultColor(Colorable colorable) {
				colorable.setColor(colorable.defaultColor);
			}
		}
