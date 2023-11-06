package com.JavaCondition;

public class SwapValue {
// How to swap the value without using 3rd variable 
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		System.out.println("Before Swap A value is :: " + a);
		System.out.println("Before Swap B value is :: " + b);
		a = a + b; // = 300

		b = a - b;// =100

		a = a - b;// =200
		
		
		
		
		System.out.println("==================");

		System.out.println("After Swap A value is :: " + a);
		System.out.println("After Swap B value is :: " + b);
	}

}
