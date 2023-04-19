package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	

	// Constructor for firstName and lastName
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED FOR: " + firstName + " " + lastName);
		
		// Method call for user department
		this.department = setDepartment();
		System.out.println("DEPARTMENT: " + department);
		
		// Method call for random password generation
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODE FOR " + firstName + " "
				+ lastName + "'s " + "department:\n1 Sales\n2 Development\n"
						+ "3 Accounting\n0 None");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) { 
			return "Sales"; 
		} else if (deptChoice == 2) {
			return "Development";
		} else if (deptChoice == 3) {
			return "Accounting";
		} else {
			return "";
		}
	}
	
	// Generate random password
	private String generateRandomPasswprd(int length) {
		
		return password;
	}
	
	// Set mailboxCapacity
	
	// Set alternateEmail
	
	//Change password
}
