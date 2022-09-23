package com.bridgelabs.problemday3_1;

public class EmployeeWageUC11 {
	public int isPresent;
	
	public EmployeeWageUC11() {
		System.out.println("welcome to the Employee Wage Computation!!!");
	}
	

	public static void main(String[] args) {
		
		EmployeeWageUC11 emp = new EmployeeWageUC11();
		emp.checkEmployee();
	}

	public int getRandomNumber() {
		int flag = (int) (Math.random() * 2);
		return flag;

	}

	public void checkEmployee() {
		isPresent= getRandomNumber();
		System.out.println(isPresent);
		if (isPresent == 0) {
			System.out.println("Employee is absent");
		} else if (isPresent == 1) {
			System.out.println("Employee is Present");
		}

	}
}
