package hu.iit.uni.miskolc.oop;

public class Employee {
	static int pensionAgeLimit = 65;
	private String name;
	private Integer salary;
	private Integer age;
	
	
	
	public Employee() {
		age = 0;
		salary = 0;
		name = "";
	}

	public Employee(String name, int salary, int age){
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String name, int age){
		this.name = name;
		this.age = age;
		this.salary = 10000*age;
	}
	
	public int yearsLeftToPension(){
		return pensionAgeLimit - age;
	}
	
	public void setPensionageLimit(int limit){
		pensionAgeLimit = limit;
	}
	
	public static Employee hasMoreYearstoPension(Employee firstEmployee, Employee secondEmployee){
		if(firstEmployee.yearsLeftToPension() >= secondEmployee.yearsLeftToPension()){
			return firstEmployee;
		}
			return secondEmployee;
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
		return "Név = " + name + ", fizetés = " + salary + "ft" + yearsLeftToPension() + "év a nyugdíj ig";
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
