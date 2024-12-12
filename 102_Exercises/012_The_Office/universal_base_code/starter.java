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
		Employee michael = new Employee();
		michael.getAnnualSalary();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Dwight.getAnnualSalary();
		Dwight.employeeToString();
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.getAnnualSalary();
		Jim.employeeToString();
		Employee Pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		Pam.getAnnualSalary();
		Pam.employeeToString();
		Employee Jacob = new Employee(470778, "Jacob", "Cho", 999999.0);
		Jacob.getAnnualSalary();
		Jacob.employeeToString();
		Jacob.raiseSalary(80);
	}
}
