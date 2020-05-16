package gu_test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Display { //this class contains all methods to displays objects lists

	Scanner sc = new Scanner(System.in);
	
	public void displaySeniorPlayers(ArrayList<SeniorPlayersObject> p) {
		
		System.out.println("|***SENIOR PLAYERS LIST***|\n");
		System.out.printf("%12s %19s %21s %12s %18s %15s %18s %30s %13s %33s %15s %24s %18s %24s %17s %24s %15.10s", "SFU NUM","NAME", "SURNAME", 
				"AGE", "DATE OF BIRTH", "TEL NUMBER", "MOBILE NUMBER", "EMAIL","HOUSE N", "ADDRESS", "POSTCODE", "NEXT OF KIN NAME", "NEXT OF KIN NUM", 
				"DOCTOR NAME", "DOCTOR NUMBER", "KNOWN ISSUES", "ROLE\n");
		System.out.println("     -------      --------------        --------------        -----     --------------     -----------        -----------       ------------------------    ---------        ---------------------------       ---------        -----------------    --------------    ----------------------    --------------   ----------------------   ------------   ");
		try {
			if(null != p) {	
				for(int i=0;i<p.size();i++) {
					p.get(i).displayData();
				}//for loop
			}//if statement
			else {
				System.out.println("File does not exist.".toUpperCase());
			}//else
		}catch(NullPointerException e) {
			System.out.println("Error".toUpperCase());
		}//catch
		
	}//DisplayPlayers Method
	
	public void displayJuniorPlayers(ArrayList<JuniorPlayersObject> pj) {
		
		System.out.println("|***JUNIOR PLAYERS LIST***|\n");
		System.out.printf("%12s %19s %21s %12s %18s %15s %18s %30s %13s %33s %15s %30s %27s %33s %25s %17s %20s %24s %26s %33s %23s %20s %23s %26s "
				+ "%21s %23s %15.10s", "SFU NUM","NAME", "SURNAME", "AGE", "DATE OF BIRTH", "TEL NUMBER", "MOBILE NUMBER", "EMAIL","HOUSE N", 
				"ADDRESS", "POSTCODE", "GUARDIAN'S NAME", "GUARDIAN'S HOUSE NUM", "GUARDIAN'S ADDRESS", "GUARDIAN'S POSTCODE", "GUARDIAN'S TEL", 
				"RELATIONSHIP", "2nd GUARDIAN'S NAME", "2nd GUARD.'S HOUSE NUM", "2nd GUARDIAN'S ADDRESS", "2nd GUARD.'S POSTC", "2nd GUARD.'S TEL",
				"2nd GUARD.RELATION", "DOCTOR NAME", "DOCTOR NUMBER", "KNOWN ISSUES", "ROLE\n");
		System.out.println("     -------      --------------        --------------        -----     --------------     -----------      -------------       ------------------------    ---------        ---------------------------       ---------      -------------------------   ------------------------        ---------------------------    ----------------------  ----------------     ----------------    ---------------------    ----------------------        ---------------------------    -------------------    ------------------   --------------------     -----------------------     -----------------    --------------------   ------------   ");
		try {
			if(null != pj) {
				for(int i=0;i<pj.size();i++) {
					pj.get(i).displayData();
				}//for loop
			}//if statement
			else {
				System.out.println("File does not exist.".toUpperCase());
			}//else
		}catch(NullPointerException e) {
			System.out.println("Error".toUpperCase());
		}//catch

	}//displayJuniorPlayersMethod
	
	
	public void displayStaff(ArrayList<StaffObject> s) {
		
		System.out.println("|-STAFF MEMBERS LIST-|\n");
		System.out.printf("%12s %19s %21s %12s %18s %15s %18s %30s %13s %33s %15s", "SFU NUM","NAME", "SURNAME", "AGE", "DATE OF BIRTH", "TEL NUMBER",
				"MOBILE NUMBER", "EMAIL","HOUSE N", "ADDRESS", "POSTCODE\n");
		System.out.println("     -------      --------------        --------------        -----     --------------     -----------      -------------       ------------------------    ---------        ---------------------------      ---------   ");
		try {
			if(null != s) {
				for(int i=0;i<s.size();i++) {
					s.get(i).displayData();
				}//for loop
			//p.forEach(e -> System.out.println(e.toString()));
			}//if statement
			else {
				System.out.println("File does not exist.".toUpperCase());
			}//else
		}catch(NullPointerException e) {
			System.out.println("Error".toUpperCase());
		}//catch
		
	}//DisplayStaff
	
		
	public void displayGames(ArrayList<Games> g) {
		System.out.println("|-GAMES LIST-|\n");
		System.out.printf("%2s %14s %12s %18s", "ID" ,"DATE", "LOCATION", "OPPOSITION\n");
		System.out.printf("%2s %14s %12s %18s", "--","-----------","---------","--------------\n");
		try {
			if(null != g) {
		for(int i=0;i<g.size();i++) {
			System.out.printf("%2s %14s %12s %17s\n",(i+1), g.get(i).getDateOfMatch(), g.get(i).getLocation(),g.get(i).getOpposition());
		}//for loop
		System.out.println("\nType an ID to display Game details.");
			}
		}catch(NullPointerException e) {
			System.out.println("Error".toUpperCase());	
		}
		displayFullGames(g);
		goBack(g);
	}//DisplayGames
	

	public void displayFullGames(ArrayList<Games> g) {
		int gameDispChoice = Validate.validateInteger()-1;
		if(null != g) {
			for(int i=0;i<g.size();i++) {
				if(i==gameDispChoice) {
					System.out.printf("%12s %12s %20s","DATE","LOCATION","KICK-OFF TIME\n");
					System.out.printf("%12s %12s %19s\n","-------","----------","---------------");
					System.out.printf("%12s %12s %19s\n\n", g.get(gameDispChoice).getDateOfMatch(),g.get(gameDispChoice).getLocation(),
					g.get(gameDispChoice).getKoTime());
					System.out.printf("%12s %13s","OPPOSITION", "RESULT\n");
					System.out.printf("%12s %12s\n","------------","----------");
					System.out.printf("%12s %12s\n\n", g.get(gameDispChoice).getOpposition(),g.get(gameDispChoice).getResult());
					System.out.printf("%12s %12s %16s","HT SCORE","2H SCORE","FINAL SCORE\n");
					System.out.printf("%12s %12s %15s\n", "----------","----------","-------------");
					System.out.printf("%12s %12s %15s\n\n",g.get(gameDispChoice).getFirstHalfScore(),g.get(gameDispChoice).getSecondHalfScore(),
					g.get(gameDispChoice).getFinalScore());
					System.out.printf("%25s\n","COMMENTS");
					System.out.printf("%25s\n","------------");
					System.out.printf("%25s\n", g.get(gameDispChoice).getComments());
				}//if statement
			}//for loop
		}//if null != g
	 }//DisplayFullGame
	
	
	
	public void displayTrainings(ArrayList<Trainings> t) {
		System.out.println("|-TRAINING LIST-|\n");
		System.out.printf("%2s %14s %12s %14s", "ID" ,"DATE", "LOCATION", "TIME\n");
		System.out.printf("%2s %14s %12s %14s", "--","-----------","---------","-----\n");
		try {
			if(null != t) {
		for(int i=0;i<t.size();i++) {
			System.out.printf("%2s %14s %12s %15s\n",(i+1), t.get(i).getTrainingDate(), t.get(i).getTrainingLocation(),t.get(i).getTrainingTime());
		}//for loop
		System.out.println("\nType an ID to display Game details.");
			}
		}catch(NullPointerException e) {
			System.out.println("Error".toUpperCase());	
		}//catch
		displayFullTrainings(t);
		goBack2(t);
	}//displayTrainings
	
	
	public void displayFullTrainings(ArrayList<Trainings> t) {
		int trainingDispChoice = Validate.validateInteger()-1;
		if(null != t) {
			for(int i=0;i<t.size();i++) {
				if(i==trainingDispChoice) {
					System.out.printf("%12s %12s %13s","DATE","LOCATION","TIME\n");
					System.out.printf("%12s %12s %12s\n","-------","----------","-----");
					System.out.printf("%12s %12s %12s\n\n", t.get(i).getTrainingDate(),t.get(i).getTrainingLocation(),t.get(i).getTrainingTime());
					System.out.printf("%12s %25s %27s","COACH", "PLAYERS LIST", "SKILLS\n");
					System.out.printf("%12s %25s %26s\n","------------","------------------","---------------------");
					System.out.printf("%12s %26s %25s\n\n", t.get(i).getCoachName(),t.get(i).getPlayersList(),t.get(i).getSkillsUndertaken());
					System.out.printf("%19s %17s","ACTIVITIES","INJURIES\n");
					System.out.printf("%19s %16s\n", "----------------","----------");
					System.out.printf("%19s %16s\n\n",t.get(i).getActivities(),t.get(i).getInjuries());
					System.out.printf("%25s\n","NOTES");
					System.out.printf("%25s\n","------------");
					System.out.printf("%25s\n", t.get(i).getNotes());
				}//if statement
			}//for loop
		}//if null != g
	 }//DisplayFullGame
	
	
	public void goBackMenu() {
		System.out.println("\nPress 'B' to back to the Main Menu. ".toUpperCase());
		char goBack = sc.next().charAt(0);
		if(goBack  == 'b' || goBack == 'B') {	
		}//if statement
		else {
			
		}//else	
	}//goBack
	
	
	public void goBack(ArrayList<Games> g) {
		System.out.println("\nPress 'B' to back to previous menu or any other key to back to the Menu. ".toUpperCase());
		char goBack = sc.next().charAt(0);
		if(goBack  == 'b' || goBack == 'B') {
			displayGames(g);
		}//if statement
		else {
			
		}//else	
	}//goBack
	
	
	public void goBack2(ArrayList<Trainings> t) {
			System.out.println("\nPress 'B' to back to previous menu or any other key to back to the Menu. ".toUpperCase());
			char goBack = sc.next().charAt(0);
			if(goBack  == 'b' || goBack == 'B') {
				displayTrainings(t);
			}//if statement
			else {
				
			}//else
	}//goBack method
		
}//Display Class
