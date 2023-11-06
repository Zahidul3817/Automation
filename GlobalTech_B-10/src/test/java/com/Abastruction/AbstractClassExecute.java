package com.Abastruction;

public class AbstractClassExecute extends AbstractClassA{

	@Override
	public void getSalary() {
		System.out.println("This is a Abstract method coming from Abstract class ");
		
	}
	public static void main(String[] args) {
		AbstractClassExecute obj = new AbstractClassExecute();
		obj.getEmpInfo();
		obj.getSalary();
	}
	// Interface we are using implements keyword
	// in order to complete Abstract class 

}
