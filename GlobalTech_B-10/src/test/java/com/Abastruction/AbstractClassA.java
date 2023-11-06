package com.Abastruction;

public abstract class AbstractClassA {// Abstract class (Incomplete class) >> contain 0 to 100% abstract method
	// In order to complete Abstract class we have to extend it to different class(regular class)

	public abstract void getSalary(); // Abstract method (Incomplete method)
	//  In order to complete Abstract method we have to extend it to different class(regular class)

	public void getEmpInfo() {// Concrete method >> which has body { }
		System.out.println("This is a Concrete method ");
	}

}