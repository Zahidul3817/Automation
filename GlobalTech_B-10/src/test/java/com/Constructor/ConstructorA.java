package com.Constructor;

public class ConstructorA {
	// Q. what is constructor?
	// Ans:Constructor is a special types of method.
	// Q. How to create a constructor?
	// Ans:Same as class name as well as constructor we can't use void keyword.
	// Because constructor invoked implicitly
	// Q. How many types of constructor?
	// Ans: There are two types of constructor
	// 1. Parameter constructor
	// 2/ Non-Parameter constructor

	public ConstructorA(String name) {
		System.out.println("Name:"+ name);
	}
	
	public ConstructorA(int salary) {
		System.out.println("Salary:"+ salary);
	}
	
	public ConstructorA() {
		System.out.println("Default Constructor remove to null value");
	}

	public static void main(String[] args) {
		ConstructorA obj = new ConstructorA("Alam");
		ConstructorA obj2 = new ConstructorA(10000000);
		ConstructorA obj3 = new ConstructorA();
		
		
	}
	
	
	
}
