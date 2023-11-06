package com.Polymorphism;

public class MethodOverridingB extends MethodOverridingA{
	
	public void getSalary(int bonus, int salary) {
		System.out.println("My bonus is :: " + bonus + " &" + " My salary is ::" + salary);
	}
	
	public static void main(String[] args) {
		MethodOverridingB obj = new MethodOverridingB();
		obj.getSalary(200, 5000);
		
		obj.getSalary(9000, "Tanu");
		obj.getSalary(10000, "Muntasir");
		
		
	}
	

}
