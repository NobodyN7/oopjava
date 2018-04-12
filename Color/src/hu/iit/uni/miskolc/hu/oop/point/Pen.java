package hu.iit.uni.miskolc.hu.oop.point;

import java.awt.Color;
import hu.iit.uni.miskolc.hu.oop.Colorable.Colorable;

public class Pen extends Product implements Colorable {

	// Adattagjai: sz�n �s m�rkan�v
		private Color color;
		private String brand;



		// Konstruktor: minden adatot megkap param�terk�nt
		public Pen(String name, int price, int tax, Color color, String brand) {
			super(name, price, tax);
			this.color = color;
			this.brand = brand;
		}



		// Defini�lja fel�l az �r�k�lt toString() met�dust
		@Override
		public String toString() {
			return super.toString() + ", Color: " + color + ", brand:" + brand;
		}

		//Implement�lja a Sz�nezhet� interf�szt.
		@Override
		public Color getColor() {
			return color;
		}


		@Override
		public void setColor(Color color) {
			this.color = color;
		}
	}
