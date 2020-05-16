package gu_test2;

import java.io.*;



public class Main { //Main class just runs the program and its main functions
	
	private static Utilities utilities = new Utilities();
	private static Choices choices = new Choices();
	private static Login login = new Login();
	
	
	public static void main(String[] args) throws IOException  { 
		
		
		System.out.print("Database ");
		utilities.loading(); //loading displays
		choices.loadDatabase(); //load all databases
		login.loginMenu(); //login menu displays

	}//main method	
	
}//main class
			

