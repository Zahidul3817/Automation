package com.ReviewClass;
// Commute to Manhattan
// when you have car you can go to Manhattan 
// when you call uber you can go to Manhattan
// when you take subway you can go to Manhattan
// when you take Bus you can go to Manhattan
// other wise you stay home

//or
//Grading calculator 
//when you get between 90- 100 your grade is = A
//when you get between 80- 89 your grade is = B
//when you get between 70- 79 your grade is = C
//when you get between 60- 69 your grade is = D
// When you get less than 60 = F



// && And operator

// True + TRUE  == Outcome will display 

// || Or operator

// True + True
                // == Outcome will display
// True + false 

public class IfelseCondition {

	public static void main(String[] args) {  
		int salary = 80000;

		if (salary > 100000) {
			System.out.println("employee gonna pay %15 tax");
		}
//80000
		else if (salary >= 70000 && salary <= 100000) {
			System.out.println("employee gonna pay %10 tax");
		} else if (salary >= 50000 && salary <= 70000) {

			System.out.println("employee gonna pay %7 tax");
		}

		else if (salary >= 15000 && salary <= 50000) {
			System.out.println("employee gonna pay %5 tax");
		}
		else {
			System.out.println("employee gonna pay %0 tax");
		
		}

	}

}
