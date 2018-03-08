package hu.iit.uni.miskolc.oop;

public class Rectangle {
	private int a;
	private int b;
	
	public Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	public Rectangle(int a){
		this(a, a);
	}
	
	//GETTERS
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getArea(){
		return a*b;
	}
	//SETTERS
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "a = " + a + ", b = " + b;
	}
	
	public void setBoth(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void setBoth(int a){
		this.a = a;
		this.b = a;
	}
	public boolean isBigger(Rectangle otherRectangle){
		if(this.getArea() > otherRectangle.getArea()){
			return true;
		}
		return false;
	}
	public boolean equals(Rectangle otherRectangle){
		if(this.a == otherRectangle.getA() && this.b == otherRectangle.getB()){
			return true;
		}
		return false;
	}

}
