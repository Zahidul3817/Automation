package com.Encapsulation;

public class EncapsulationClassA {
	// hide this code

	// 1st step we have to use private access modifier to warping our source code
	// 2nd step we have to use getter method ( return method) and setter method and( by selecting private access modifier)
	// 3rd We have to finish within the class
	private String jobTittle = "QA Automation Engineer";
	private int monthlySalary = 8000;

	public String getJobTittle() {
		return jobTittle;
	}

	private int getMonthlySalary() {
		return monthlySalary;
	}

	public static void main(String[] args) {
		EncapsulationClassA obj = new EncapsulationClassA();

		System.out.println(obj.getJobTittle());
		System.out.println(obj.getMonthlySalary());
	}

}
