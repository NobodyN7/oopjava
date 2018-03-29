package my.first;

public class Number {

	private static double delta = 0.001;
	
	private double number;

	public Number(double number) {
		this.number = number;
	}
	
	public boolean equals(Number number){
		return Math.abs((this.number-number.number))<delta;
	}
	
	public String toString(){
		return Double.toString(number);
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	
}
