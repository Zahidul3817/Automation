package com.ReviewClass;

public interface New_Interface_Class {
	
	// Java below 1.8 version Interface contain 100% abstract methods 
	public void getSalary();
	
	
	// Java above 1.7 version contain concrete method as well as abstract methods
	// with the help of default access modifier 
	
	default void getInfo() {
		
	}

}

