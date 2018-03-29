package iit.uni.miskolc.oop;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("Hany alkalmazott?");
		Employee[] employee = new Employee[scan.nextInt()];
		
		for(int i = 0; i < employee.length; i++){
			employee[i] = new Employee("Employee" + (i+1), rnd.nextInt(100000), LocalDate.of(1950 + rnd.nextInt(70), 01, 05));
		}
		
		for(Employee emp : employee)
		{
			System.out.println(emp);
		}
		
		Employee.setPensionageLimit(60);
		System.out.println("PensionLimit has been changed");
		for(Employee emp : employee)
		{
			System.out.println(emp);
		}
		scan.close();
		
	}

}
