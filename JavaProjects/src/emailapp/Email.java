package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private int defaultPasswordLength = 5;
	private String email;
	private String companySuffix = ".company.com";
	

	// Constructor for firstName and lastName
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
		// Method call for user department
		this.department = setDepartment();
		
		// Generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() +
			"@" + department.toLowerCase() + companySuffix;
		
		// Method call for random password generation
		this.password = generateRandomPassword(defaultPasswordLength);
		System.out.println("PASSWORD: " + password);
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.println("New Worker: " + firstName + " " + lastName + 
				"\nPlease select department code: " + "\n1 Sales\n2 Development\n"
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
	private String generateRandomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set mailboxCapacity
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set alternateEmail
	public void setAltEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	private String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
	}
	
	
}
