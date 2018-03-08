package hu.iit.uni.miskolc.oop;

public class Employee {
	private String name;
	private Integer salary;
	
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
		return "N�v = " + name + ", fizet�s = " + salary + "ft";
	}
	
}
