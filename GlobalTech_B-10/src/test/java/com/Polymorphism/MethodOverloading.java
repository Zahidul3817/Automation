package com.Polymorphism;

public class MethodOverloading {
// Method Overloading rule
	// 1 step= same method use over and over
	// 2 step= changing the parameter name, location, & data type
	// 3 step= Finish within the same class

	public void getSalary(String name, int salary) {
		System.out.println("My name is :: " + name + " &" + " My salary is ::" + salary);
	}

	public void getSalary(int salary, String name) {
		System.out.println("My salary is :: " + salary + " &" + " My name is :: " + name);

	}

	public void getSalary(double salary, String name) {

		System.out.println("My salary is :: " + salary + " &" + " My name is :: " + name);

	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.getSalary("Anik", 8000);
		obj.getSalary(9000, "Tanu");
		obj.getSalary(10000, "Muntasir");

	}
}
