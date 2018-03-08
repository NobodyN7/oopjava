package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Rectangle firstRectangle = new Rectangle(86,42);
		Rectangle secondRectangle = new Rectangle(17);
		
		Rectangle thirdRectangle = firstRectangle;
		
		System.out.println(firstRectangle);
		System.out.println(secondRectangle);
		System.out.println(thirdRectangle);
		firstRectangle.setBoth(64,60);
		System.out.println(firstRectangle);
		System.out.println(secondRectangle);
		System.out.println(thirdRectangle);
		firstRectangle.setBoth(secondRectangle.getA(), secondRectangle.getB());
		System.out.println(firstRectangle == secondRectangle);
		System.out.println(firstRectangle == thirdRectangle);
		System.out.println(firstRectangle.equals(secondRectangle));
	}

}
