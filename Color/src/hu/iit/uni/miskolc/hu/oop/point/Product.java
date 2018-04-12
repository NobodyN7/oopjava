package hu.iit.uni.miskolc.hu.oop.point;

//Defini�ljon saj�t csomagban (myproducts) �ru (Product) oszt�lyt.





public class Product {

	// Adattagjai: n�v, nett� �r (eg�sz), �fakulcs (eg�sz, sz�zal�k)



	private String name;

	private int price;

	private int tax;



	// Konstruktora: mindh�rom adat megad�s�val inicializ�lja az adattagokat.



	public Product(String name, int price, int tax) {

		this.name = name;

		this.price = price;

		this.tax = tax;

	}



	// Met�dusai:

	// - Sz�m�tsa ki a brutt��r�t egy �runak (eg�sz, kerek�tve).

	public int getPriceWithTax() {

		return (Integer) price * (1 + tax / 100);

	}



	// - Egy sztringbe �sszef�zve adja vissza az �ru nev�t �s a brutt� �r�t.

	// Defini�lja fel�l az Object oszt�lybeli toString met�dust!

	@Override

	public String toString() {

		return name + ", " + getPriceWithTax() + "ft";

	}



	// - N�velje meg az �ru nett� �r�t a param�terben megadott sz�zal�kos �rt�kkel

	// (eg�sz).

	public void raisePrice(int percentage) {

		price = price * (percentage / 100);

	}

	// - Hasonl�tsa �ssze k�t �ru brutt� �r�t. 1-et adjon vissza, ha az �ru dr�g�bb

	// mint a param�terben megadott; -1-et ha olcs�bb �s 0-t ha azonos �r�ak.

	public int compareProducts(Product other) {

		if(getPriceWithTax()>other.getPriceWithTax()) {

			return 1;

		}

		if(getPriceWithTax()<other.getPriceWithTax()) {

			return -1;

		}

		return 0;

	}

}
