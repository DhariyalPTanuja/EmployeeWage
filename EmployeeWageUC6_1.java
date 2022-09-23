
package com.bridgelabs.problemday3_1;
//Calculating Wages for a Month

public class EmployeeWageUC6_1 {
	public int wagePerHour = 20;
	public int workingHour;
	public int isPresent;
	public int totalworkingDays = 0;
	public int totalSalary = 0;
	public int numWorkingDays = 20;
	public int hoursInMonth = 100;
	int dailyWage;
	public int totalWorkingHour = 0;

	public EmployeeWageUC6_1() {
		System.out.println("welcome to the Employee Wage Computation!!!");
	}

	public static void main(String[] args) {
		EmployeeWageUC6_1 emp = new EmployeeWageUC6_1();

		emp.calculateMonthlyWage();
	}

	// Calculate Employee Wage
	public void calculateMonthlyWage() {
		while (totalWorkingHour <= hoursInMonth && totalworkingDays <= numWorkingDays) {
			checkWorkHour();
			int dailyWage = wagePerHour * workingHour;
			totalWorkingHour = totalWorkingHour + workingHour;
			totalSalary = dailyWage + totalSalary;
			totalworkingDays++;
		}
		System.out.println("the total wage of employee is = " + totalSalary);
	}

	public int getRandomNumber() {
		int flag = (int) (Math.random() * 3);
		return flag;

	}

	public void checkWorkHour() {
		isPresent = getRandomNumber();
		switch (isPresent) {
		case 0:
			workingHour = 0;
			break;
		case 1:
			workingHour = 8;
			break;
		default:
			workingHour = 8;
			break;
		}

	}
}
