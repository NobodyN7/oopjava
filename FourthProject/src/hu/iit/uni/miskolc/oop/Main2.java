package hu.iit.uni.miskolc.oop;

import java.util.Random;

public class Main2 {
	
	public static void main(String[] args)
	{
		Employee[] employeeArray = new Employee[3];
		for(int i = 0; i < employeeArray.length; i++){
		employeeArray[i] = new Employee();
		employeeArray[i].setName("Employee" + i+1);
		employeeArray[i].setSalary(Math.abs(new Random().nextInt()));
		}
		for(Employee employee : employeeArray){
			System.out.println(employee);
		}
		
		Employee employeeWithHighestSalary = employeeArray[0];
		for(int i = 1; i < employeeArray.length; i++){
			if(!employeeWithHighestSalary.hasBiggerSalary(employeeArray[i])){
				employeeWithHighestSalary=employeeArray[i];
			}
		}
		System.out.println("Legmagasabb fizetés: " + employeeWithHighestSalary);
		
		int employeeSalaryIntervalCounter = 0;
		int inter1 = 100000000;
		int inter2 = 500000000;
		long sum = 0;
		long adoszum = 0;
		
		for(Employee employee : employeeArray){
			if(employee.getSalary() > inter1 && employee.getSalary() < inter2){
				employeeSalaryIntervalCounter++;
			}
		}
		System.out.println("Ennyi alkalmazott fizetése esik az intervallumba: "+ employeeSalaryIntervalCounter);
		
		for(Employee employee : employeeArray){
			sum += employee.getSalary();
		}
		System.out.println("Átlagfizetés: " + sum / employeeArray.length);
		for(Employee employee : employeeArray){
			adoszum += employee.getTax();
		}
		System.out.println("Adoosszeg: " + adoszum);
		
	}

}
