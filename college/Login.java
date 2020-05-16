package gu_test2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	//declaring variables useful for login
	String username;
	String password;
	
	ArrayList<Login> login = new ArrayList<Login>();
	ReadFile rf = new ReadFile();
	Scanner sc = new Scanner(System.in);
	
	public Login() { //void constructor
		
	}
	
	public Login(String username, String password) { //constructor. Initialise variables
		
		this.username = username;
		this.password = password;
	}
	
	//setters and getters

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void loginMenu() throws IOException { //this method contains the menu which appears when the program runs. It allows to choose if 
		//create an account or log in.
		
		System.out.printf("%66s", "***SCOTTISH FOOTBALL UNION CLUB***\n\n");
		System.out.printf("%50s","LOGIN\n");
		System.out.printf("%53s", "-----------\n");
		System.out.printf("%53s", "1 - Sign Up\n");
		System.out.printf("%52s", "2 - Log In\n");
		int loginChoice = Validate.validateInteger();
		//sc.nextLine();
		
			if(loginChoice == 1) {
				signUp();
			}//if
			else if(loginChoice == 2) {
				signIn();
			}//else if
			else {
			System.out.println("Invalid choice.");
			loginMenu();	
			}//else
	}//loginMenu
	
	
	public void signUp() throws IOException { //this method allows to create a new account for log in
		
		WriteFile wf = new WriteFile();
		
		System.out.printf("%53s", "CREATE AN ACCOUNT\n");
		System.out.printf("%53s","Insert a Username: ");
		setUsername(sc.nextLine());
		System.out.printf("%53s","Insert a Password: ");
		setPassword(sc.nextLine());
		System.out.println();
		wf.saveLogin(getUsername(), getPassword(), "login"); //the new account will be saved on a text file database
		System.out.println("Account has been created.");
		loginMenu();
	}//signUp
	
	public void signIn() throws IOException { //this method allows the user to log into the system
		
		login = rf.readFileLogin("Data\\login.txt", "login"); //call any account previously created and store into the text file database 
		boolean logged = false;
		System.out.printf("%53s","LOGIN\n");
		System.out.printf("%53s","Username:");
		String usernameLogin = sc.nextLine();
		System.out.printf("%53s","Password:");
		String passwordLogin = sc.nextLine();
	
		for(Login l : login) {
			if(usernameLogin.equals(l.getUsername()) && passwordLogin.equals(l.getPassword())) { //if user inputs are found into database, then log in
				System.out.println("Login successfull!\n".toUpperCase());
				Choices choices = new Choices();
				choices.userChoices();
				logged = true;
			}//if
		}//for loop

		if(!logged) {
			System.out.println("Login failed. Username or password not valid.\n");
			loginMenu();
		}//if
	}//signIn
	
}//Login class
