package com.ReviewClass;

public class Java_Conditions {
     // How to verify the data?
	// Ans: By using the if else condition
	public static void main(String[] args) {
		
		int age = 18;
		if (age == 19) {
			System.out.println("Match the values");
		} else if (age == 17) {
			System.out.println("Eligible to Vote ");
		} else if (age < 18) {
			System.out.println("Not Eligible to Vote");
		}
		else {
			System.out.println("Missmatch");
		}

	}

}
