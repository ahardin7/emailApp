package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String email;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	
	// This will generate a new email based on the employees fname, lname, and dept. It will also generate a random string for the pw, set methodss to change the pw, and have get methods to display name, email, and mailbox capacity
	
	// Constructor to receive the first first name and last name
		// this.fname = fname is the class name referring to the local param. .this calls the class level variable
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the dept. + return the dept.
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	// Ask for the department 
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Acccounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {return "sales"; }
		else if (deptChoice == 2) {return "dev"; }
		else if (deptChoice == 3) {return "acct"; }
		else { return ""; }
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHJKLMNOPQRSTUVWXYZ!@#$%&*";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String (password); 
	}
	
	// Set the mailbox capacity
	
	// Set the alternate email 
	
	// Change the password
	
}
