/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee Michael = new Employee();
		Michael.employeeToString();
		
		Employee Dwight = new Employee(2011, "Dwight", "Schrute", 2250);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.employeeToString();

		Employee Justin = new Employee(420691, "Justin", "Kim", 300);
		Justin.employeeToString();
		
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250);
		Pam.employeeToString();

		Dwight.raiseSalary(10);
		System.out.println(Dwight.getFirstName());
		System.out.println(Dwight.getSalary());
		System.out.println(Dwight.getAnnualSalary());

		
		Jim.raiseSalary(10);
		System.out.println(Jim.getFirstName());
		System.out.println(Jim.getSalary());
		System.out.println(Jim.getAnnualSalary());

		
		Justin.raiseSalary(10);
		System.out.println(Justin.getFirstName());
		System.out.println(Justin.getSalary());
		System.out.println(Justin.getAnnualSalary());

		
		Pam.raiseSalary(10);
		System.out.println(Pam.getFirstName());
		System.out.println(Pam.getSalary());
		System.out.println(Pam.getAnnualSalary());

		
		
	}
}
