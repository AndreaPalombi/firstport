package gu_test2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Choices { //Choices class contains all main program functions called when a selection is made by the user from the main menu
	
	private static SeniorPlayersObject po = new SeniorPlayersObject();
	private static JuniorPlayersObject pjo = new JuniorPlayersObject();
	private static StaffObject so = new StaffObject();
	private static Games games = new Games();
	private static Trainings trainings = new Trainings();
	private static Fees fees = new Fees();
	private static PlayerProfile playerProfile = new PlayerProfile();
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<SeniorPlayersObject> p = new ArrayList<SeniorPlayersObject>();
	private static ArrayList<JuniorPlayersObject> pj = new ArrayList<JuniorPlayersObject>(); 
	private static ArrayList<StaffObject> s = new ArrayList<StaffObject>();
	private static ArrayList<Games> g = new ArrayList<Games>();
	private static ArrayList<Trainings> t = new ArrayList<Trainings>();
	private static ArrayList<Fees> f = new ArrayList<Fees>();
	private static ArrayList<PlayerProfile> pp = new ArrayList<PlayerProfile>();
	private static SaveAndExit saveAndExit = new SaveAndExit();
	private static Menu menu = new Menu();
	private static Add add = new Add();
	private static DataEntry dataEntry = new DataEntry();
	private static Display display = new Display();
	private static Delete remove = new Delete();
	private static Edit edit = new Edit();
	private static Utilities utilities = new Utilities();
	
	
	public void userChoices() throws IOException{
	
	do {
		System.out.println(utilities.systemTimer()); //display local time and zone
		menu.menu();
		int menuChoice = Validate.validateInteger();
		if(menuChoice<1 || menuChoice>10) {
			System.out.println("\n***Invalid choice. Please select a number from the menu.***\n".toUpperCase());
		}//if

			
		//==========MENU CHOICE 1==========//	
		
		if(menuChoice==1) {	
			System.out.printf("%15s", "ADD MENU \n");
			System.out.printf("%17s","-------------\n");
		
			System.out.println("1 - Add a New Player ");
			System.out.println("2 - Add a New Staff Member ");
			System.out.println("3 - Add a New Game ");
			System.out.println("4 - Add a New Training");
			System.out.println("5 - Back ");
			try {
				int addChoice = Validate.validateInteger();
				if(addChoice == 1) {
				add.setAge(pjo,po,pj,p,sc);
				}//if
				else if(addChoice == 2) {
				dataEntry.staffDataEntry(so, sc);
				add.addStaff(s, so);	
				}//else if
				else if(addChoice == 3) {
				dataEntry.gameDataEntry(games, sc);
				add.addGames(g, games);
				}//else if
				else if(addChoice == 4) {
				dataEntry.trainingDataEntry(trainings, sc);
				add.addTrainings(t, trainings);
				}//else if
				else {
				System.out.println("Error. Invalid choice.");
				}//else
			}catch(InputMismatchException e){
				System.out.println("Error. Invalid choice.");
			}//catch		
		}//if menuChoice==1
		
		
		
		//==========MENU CHOICE 2==========//
		
		if(menuChoice==2) {
			System.out.printf("%18s", "DISPLAY MENU \n");
			System.out.printf("%19s","----------------\n");
			
			System.out.println("1 - Senior Players ");
			System.out.println("2 - Junior Players ");
			System.out.println("3 - Staff ");
			System.out.println("4 - Games ");
			System.out.println("5 - Trainings");
			System.out.println("6 - Back ");
			try {
				int listDisplay = Validate.validateInteger();
				if(listDisplay == 1) {
					utilities.loading();
					display.displaySeniorPlayers(p);
					display.goBackMenu();
				}//if
				else if(listDisplay == 2) {
					utilities.loading();
					display.displayJuniorPlayers(pj);
					display.goBackMenu();
				}//else if
				else if(listDisplay == 3) {
					utilities.loading();
					display.displayStaff(s);
					display.goBackMenu();
				}//else if
				else if(listDisplay == 4) {
					utilities.loading();
					display.displayGames(g);
				}//else if
				else if(listDisplay == 5) {
					utilities.loading();
					display.displayTrainings(t);		
				}//else if
				else {
				System.out.println("Error. Invalid choice.");
				}//else
			}catch(InputMismatchException e) {
				System.out.println("Invalid Input.");
			}//catch
		}//if menuChoice==2
		
		
		//==========MENU CHOICE 3==========//
		
		if(menuChoice==3) {
			System.out.printf("%18s", "DELETE MENU \n");
			System.out.printf("%20s","-----------------\n");
			
			System.out.println("1 - Delete a Senior Player ");
			System.out.println("2 - Delete a Junior Player ");
			System.out.println("3 - Delete a Staff Member ");
			System.out.println("4 - Delete a Game ");
			System.out.println("5 - Delete a Training session");
			System.out.println("6 - Back ");
			try {
				int deletion = Validate.validateInteger();
				if(deletion==1) {
					display.displaySeniorPlayers(p);
					remove.removeSeniorPlayer(p);
				}//if
				else if(deletion==2) {
					display.displayJuniorPlayers(pj);
					remove.removeJuniorPlayer(pj);
				}//else if
				else if(deletion == 3) {
					display.displayStaff(s);
					remove.removeStaff(s);	
				}//else if
				else if(deletion == 4) {
					remove.removeGames(g);
					display.goBack(g);
				}//else if
				else if(deletion == 5) {
					remove.removeTraining(t);
					display.goBack2(t);
				}//else if
				else {
				System.out.println("Error. Invalid choice.");	
				}//else
			}catch(InputMismatchException e) {
				System.out.println("Invalid choice.");
			}//catch		
		}//if menuChoice==3
		
		
		//==========MENU CHOICE 4==========//
		
		if(menuChoice==4) {
			System.out.printf("%18s", "EDIT MENU \n");
			System.out.printf("%20s","---------------\n");
			
			System.out.println("1 - Edit a Senior Player ");
			System.out.println("2 - Edit a Junior Player ");
			System.out.println("3 - Edit a Staff Member ");
			System.out.println("4 - Edit a Game");
			System.out.println("5 - Edit a Training");
			System.out.println("6 - Back ");
			try {
				int editChoice = Validate.validateInteger();
				if(editChoice==1) {
					display.displaySeniorPlayers(p);
					edit.editSeniorPlayerChoice(p);
					
				}//if
				else if(editChoice==2) {
					display.displayJuniorPlayers(pj);
					edit.editJuniorPlayerChoice(pj);
					
				}//else if
				else if(editChoice==3) {
					display.displayStaff(s);
					edit.editStaffChoice(s);
					
				}//else if
				else if(editChoice==4) {
					edit.editGameChoice(g);
				}//else if
				else if(editChoice==5) {
					//display.DisplayTrainings(t);
					edit.editTrainingChoice(t);
				}//else if
				else {
				System.out.println("Error. Invalid choice.");	
				}//else
			}catch(InputMismatchException e) {
				System.out.println("Invalid Choice.");
			}//catch	
		}//if menu choice==4
		
		
		//========MENU CHOICE 5==========//
		if(menuChoice==5) {
			
			System.out.printf("%17s", "FEES MENU \n");
			System.out.printf("%19s","---------------\n");
			
			System.out.println("1 - Senior Player Fees ");
			System.out.println("2 - Junior Player Fees ");
			System.out.println("3 - Staff Member Fees ");
			System.out.println("4 - Back ");
			try {
				int editChoice = Validate.validateInteger();
				if(editChoice==1) {
					fees.seniorPlayersFees(p,f, sc);
				}//if
				else if(editChoice==2) {
					fees.juniorPlayersFees(pj, sc);
				}//else if
				else if(editChoice==3) {
					fees.staffFees(s, sc);
				}//else if
				else {
				System.out.println("Error. Invalid choice.");	
				}//else
			}catch(InputMismatchException e) {
				System.out.println("Invalid Choice.");
			}//catch
		}//if menuChoice==5
		
		
		//========MENU CHOICE 6===========//
		if(menuChoice == 6) {
			System.out.printf("%26s", "PLAYER PROFILE MENU \n");
			System.out.printf("%27s","-----------------------\n");
			
			System.out.println("1 - Add a Senior Player profile ");
			System.out.println("2 - Add a Junior Player profile ");
			System.out.println("3 - Display Player profile ");
			System.out.println("4 - Back ");
			int playProfChoice = Validate.validateInteger();
			if(playProfChoice == 1) {
				playerProfile.addPlayerProfile(p,pp,sc);
			}//if
			else if(playProfChoice == 2) {
				playerProfile.addJuniorPlayerProfile(pj,pp,sc);
			}//else if
			else if(playProfChoice == 3) {
				playerProfile.displayPlayerProfile(pp,sc);
			}//else if
			else {
			System.out.println("Error. Invalid choice.");	
			}//else
			
		}//if menuChoice==6
		
		
		//========MENU CHOICE 7 ==========//
		
		if(menuChoice==7) { 
		saveAndExit.saveAndExit(p, pj,s,g,t,pp,sc);	
		}//if menuChoice==7
				
			}while(true); //do-while loop
			
	}//main method
		
	public void loadDatabase() throws IOException {	//this method loads all files from databases.
		ReadFile rf = new ReadFile();
		p = rf.readFilePlayers("Data\\players.txt","players");
		pj = rf.readFileJuniorPlayers("Data\\junior_players.txt","junior_players");
		s = rf.readFileStaff("Data\\staff.txt", "staff");
		g = rf.readFileGames("Data\\games.txt", "games");
		t = rf.readFileTrainings("Data\\trainings.txt", "trainings");
		pp = rf.readPlayerProfile("Data\\playerProfile.txt", "playerProfile");
	}//loadDatabase
	
}//Choices class
