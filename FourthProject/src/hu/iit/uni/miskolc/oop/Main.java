package hu.iit.uni.miskolc.oop;

public class Main {
	
	public static void main(String[] args){
		Employee akos = new Employee();
		akos.setName("Akos Rublinszki");
		akos.setSalary(200);
		System.out.println(akos.toString());
		akos.raiseSalary(100);
		Employee bence = new Employee();
		bence.setName("Bence Bogdany");
		bence.setSalary(20000);
		
		System.out.println(akos);
		System.out.println(akos.isBetweenSalary(100, 400));
		System.out.println(akos.isBetweenSalary(400, 800));
		System.out.println(akos.getTax());
		System.out.println(akos.getName() + " fizetese nagyobb?" + akos.hasBiggerSalary(bence));
	}

}
