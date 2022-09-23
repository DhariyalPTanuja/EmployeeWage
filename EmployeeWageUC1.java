package com.bridgelabs.problemday3_1;

public class EmployeeWageUC1 {
	public int isPresent;
public static void main(String[] args) {
	System.out.println("welcome to the Employee Wage Computation!!!");
	int isPresent = (int)(Math.random()*2);
	//int isPresent= getRandomNumber();
	 	System.out.println(isPresent);
	 	if (isPresent == 0 ) {
	 		System.out.println("Employee is absent");
	 	}
	 	else if(isPresent == 1) {
	 		System.out.println("Employee is Present");
	 		}

	 	
}
public int getRandomNumber() {
	int isPresent = (int)(Math.random()*2);
	return isPresent;
	
}
public void checkEmployee() {
	
}
}
