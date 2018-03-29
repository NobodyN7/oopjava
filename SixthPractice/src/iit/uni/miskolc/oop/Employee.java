package iit.uni.miskolc.oop;

import java.time.LocalDate;

public class Employee {
	static int pensionAgeLimit = 65;
	private String name;
	private Integer salary;
	private LocalDate birthDate;
	
	
	
	public Employee() {
		birthDate = LocalDate.now();
		salary = 0;
		name = "";
	}

	public Employee(String name, int salary, LocalDate birthDate){
		this.birthDate = birthDate;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, LocalDate birthDate){
		this.name = name;
		this.birthDate = birthDate;
		this.salary = 10000 * (LocalDate.now().getYear() - birthDate.getYear());
	}
	
	public int yearsLeftToPension(){
		return pensionAgeLimit - (LocalDate.now().getYear() - birthDate.getYear());
	}
	
	public static void setPensionageLimit(int limit){
		pensionAgeLimit = limit;
	}
	
	public static Employee hasMoreYearstoPension(Employee firstEmployee, Employee secondEmployee){
		if(firstEmployee.yearsLeftToPension() >= secondEmployee.yearsLeftToPension()){
			return firstEmployee;
		}
			return secondEmployee;
	}
	
	private static String getMonthNameFromMonthNumber(int number){
		String[] months = new String[13];
		months[1] = "Janu�r";
		months[2] = "Febru�r";
		months[3] = "M�rcius";
		months[4] = "�prilis";
		months[5] = "M�jus";
		months[6] = "J�nius";
		months[7] = "J�lius";
		months[8] = "Augusztus";
		months[9] = "Szeptember";
		months[10] = "Okt�ber";
		months[11] = "November";
		months[12] = "December";
		
		return months[number];
	}
	
	public boolean isBetweenSalary(int lowerSalary, int upperSalary){
		if(salary < upperSalary && salary > lowerSalary){
			return true;
		}
		return false;
	}
	
	public boolean hasBiggerSalary(Employee otherEmployee){
		if(salary > otherEmployee.salary){
			return true;
		}
		return false;
	}
	
	public double getTax(){
		return salary * 0.16;
	}
	
	public void raiseSalary(int raise){
		salary+=raise;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Integer getSalary(){
		return salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}

	public String toString() {
		return "N�v = " + name + " sz�letett: " + birthDate.getYear()  + ", fizet�s = " + salary + "ft, " + yearsLeftToPension() + " �v a nyugd�j ig";
	}
	
}
