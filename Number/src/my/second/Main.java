package my.second;
import my.first.Number;
public class Main {

		public static void main(String[] args){
			final Number number = new Number(Math.random());
			System.out.println("Eredeti szám" + number);
			Number randomNumber = new Number(Math.random());
			int count = 0;
			
			while(!number.equals(randomNumber)){
				System.out.println(randomNumber);
				randomNumber = new Number(Math.random());
				count++;
			}
			System.out.println(randomNumber);
			System.out.println(count);
			
			System.out.println(number);
			number.setNumber(0.4);
			System.out.println(number);
			
		}
}
