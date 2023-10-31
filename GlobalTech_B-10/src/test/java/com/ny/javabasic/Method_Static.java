package com.ny.javabasic;

public class Method_Static {
	public void getEmpInfo() {
		String SSN = "111-33-4676";
		System.out.println("Employee SSN Number: " + SSN);
	}

	String getEmpAddress() {
		String Address = "123 Main St";
		System.out.println("Employee Address: " + Address);
		return Address;

	}

	public static void getEmpName(String name) {
		System.out.println("Employee Name:" + name);

	}

	public static void main(String[] args) {
		// How to call a static method?
		// Ans: By Class name

		// Which method will execute faster Static or Non-Static?
		// Ans: Static method will execute faster compare to Non-static method (Run time)

		// Static Method is calling by class name
		System.out.println("=================");
		System.out.println("Static Method is calling by class name");
		Method_Static.getEmpName("Anik");

		// Non-Static Method need to create an object
		System.out.println("=================");
		System.out.println("Non-Static Method need to create an object");
		Method_Static object = new Method_Static();
		object.getEmpAddress();
		object.getEmpInfo();
		//-----------------------------------
		// calling return method
		 object.getCity();
		 // calling >> return method
		 //String City = object.getCity();
		System.out.println("Return method call:: " + object.getCity());
		
		 // calling >> return parameter method
		String City1 = object.getCity1("Dhaka");
		System.out.println("Return parameter method:: " +City1);
		
		

	}
	// declaring return method
	public String getCity() {
		String city="New York";
		return city;
		
	}
	// declaring return parameter method
		public String getCity1(String city1) {
			//city1="New York";
			return city1;
			
		}

}
