package gu_test2;
import java.util.Scanner;

public class DataEntry { //dataEntry class contains all data entries to take inputs from user during creation (ex: a new player)

	public void seniorPlayerDataEntry(SeniorPlayersObject po, Scanner sc) { //data Entries for players > 18
		
		 System.out.println("\n|-ADD A NEW PLAYER-|\n");
		 System.out.println("Enter player's name: ");
		 po.setName(sc.nextLine());
		 
		 System.out.println("Enter " + po.getName() + "'s Surname: ");
		 po.setSurname(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s Date of Birth [dd/mm/yyyy]: ");
		 po.setDateOfBirth(sc.nextLine());
		 
		 System.out.println("Enter "  + po.getName() + "'s Telephone Number: ");
		 po.setTelNumber(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s Mobile Number: ");
		 po.setMobileNumber(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s Email: ");
		 po.setEmail(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s House Number: ");
		 po.setHouseNumber(sc.nextLine());	 
		 
		 System.out.println("Enter  " + po.getName() + "'s Address: ");
		 po.setAddress(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s PostCode: ");
		 po.setPostCode(sc.nextLine());
		 
		 System.out.println("Enter " + po.getName() + "'s Next of Kin full name: ");
		 po.setNextOfKin(sc.nextLine());
		 
		 System.out.println("Enter Next Of Kin contact number: ");
		 po.setNextOfKinTel(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s Doctor full Name: ");
		 po.setDoctorName(sc.nextLine());
		 
		 System.out.println("Enter " +  po.getName() + "'s Doctor contact number: ");
		 po.setDoctorTel(sc.nextLine());
		 
		 System.out.println("Enter any known health issues (max 20 char): ");
		 po.setKnownIssues(sc.nextLine());
		 
		 int roleSel = 0;
		 while(roleSel < 1 || roleSel > 7) {
			 System.out.println("Select the Role Played: ");
			 System.out.println("1 - Goalkeeper");
			 System.out.println("2 - Centre Back");
			 System.out.println("3 - Full Back");
			 System.out.println("4 - Midfielder");
			 System.out.println("5 - Wing");
			 System.out.println("6 - Forward");
			 System.out.println("7 - Striker");
			 
			  roleSel = Validate.validateInteger();
			 
			 if(roleSel == 1) {
			  po.setRole("Goalkeeper");
			 }//if
			 
			 else if(roleSel == 2) {
				  po.setRole("Centre Back");
			 }//else if
			 
			 else if(roleSel == 3) {
				  po.setRole("Full Back");
			 }//else if
			 
			 else if(roleSel == 4) {
				  po.setRole("Midfielder");
			 }//else if
			 
			 else if(roleSel == 5) {
				  po.setRole("Wing");
			 }//else if
			 
			 else if(roleSel == 6) {
				  po.setRole("Forward");
			 }//else if
			 
			 else if(roleSel == 7) {
				  po.setRole("Striker");
			 }//else if
		 }//while
		 System.out.println("Fee Paid [type 'YES' or 'NO']: ");
		 String fees = Validate.validateString();
		 
		 if(fees.equals("yes") || fees.equals("YES")) {
			po.setFees("yes");
			
		int type = 0;
		while(type < 1 || type > 3) {
		 System.out.println("Select a type of payment:");
			System.out.println("1 - Annual");
			System.out.println("2 - Semestral");
			System.out.println("3 - Monthly");
			type = Validate.validateInteger();
		}//while loop
			if(type == 1) {
				po.setFeesExp("Annual");
			}//if type==1
			else if(type == 2) {
				po.setFeesExp("Semestral");
			}//else if
			else if(type == 3) {
				po.setFeesExp("Monthly");
			}//else if
			else {
				Validate.validateInteger();
			}//else
		 }//if
		 else {
			 po.setFees("no");
			 po.setFeesExp("-");
		 }//else
	
		 System.out.println("\n*** '"+po.getName().toUpperCase()+" "+po.getSurname().toUpperCase()+"' has been added. ***\n".toUpperCase());
			
	}//seniorPlayerDataEntry
	
	
	public void juniorPlayerDataEntry(JuniorPlayersObject pjo, Scanner sc) { //data entry if Players are < 18
		 System.out.println("\n|-ADD A NEW JUNIOR PLAYER-|\n");
		 
		 System.out.println("This player is underage.\nEnter the Guardian Full Name: ");
		 pjo.setGuardianName(sc.nextLine());
		 
		 System.out.println("Type of Relationship with " + pjo.getGuardianName()+ ": ");
		 pjo.setRelationship(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getGuardianName() + " House Number: ");
		 pjo.setGuardianHouseNumber(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getGuardianName() + " Address: ");
		 pjo.setGuardianAddress(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getGuardianName() +  " PostCode: ");
		 pjo.setGuardianPostCode(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getGuardianName() + " telephone number: ");
		 pjo.setGuardianTel(sc.nextLine());
		 
		 System.out.println("Do you want add another Guardian?: ");
		 String gu_answer = Validate.validateString();
		 
		 if(gu_answer.equals("yes") || gu_answer.equals("YES")) {
				 
			 
			 System.out.println("Enter the second Guardian Full Name: ");
			 pjo.setGuardianName2(sc.nextLine());
			 
			 System.out.println("Type of relationship with " + pjo.getGuardianName2()+ ": ");
			 pjo.setRelationship2(sc.nextLine());
			 
			 System.out.println("Enter the second Guardian House Number: ");
			 pjo.setGuardianHouseNumber2(sc.nextLine());
			 
			 System.out.println("Enter the second Guardian Address: ");
			 pjo.setGuardianAddress2(sc.nextLine());
			 
			 System.out.println("Enter the second Guardian PostCode: ");
			 pjo.setGuardianPostCode2(sc.nextLine());
			 
			 System.out.println("Enter the second Guardian telephone number: ");
			 pjo.setGuardianTel2(sc.nextLine());
		 
		 }//if statement
		 
		 if(gu_answer.equals("no") || gu_answer.equals("NO")) {
			 pjo.setGuardianName2("-");
			 pjo.setGuardianHouseNumber2("-");
			 pjo.setRelationship2("-");
			 pjo.setGuardianAddress2("-");
			 pjo.setGuardianPostCode2("-");
			 pjo.setGuardianTel2("-");
		 }//if
		 
		 System.out.println("Enter junior player's Name: ");
		 pjo.setName(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Surname: ");
		 pjo.setSurname(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Date of Birth [dd/mm/yyyy]: ");
		 pjo.setDateOfBirth(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Telephone Number: ");
		 pjo.setTelNumber(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Mobile Number: ");
		 pjo.setMobileNumber(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Email: ");
		 pjo.setEmail(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s House Number: ");
		 pjo.setHouseNumber(sc.nextLine());	 
		 
		 System.out.println("Enter " + pjo.getName() +  "'s Address: ");
		 pjo.setAddress(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s PostCode: ");
		 pjo.setPostCode(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Doctor full Name: ");
		 pjo.setDoctorName(sc.nextLine());
		 
		 System.out.println("Enter " + pjo.getName() + "'s Doctor contact number: ");
		 pjo.setDoctorTel(sc.nextLine());
		 
		 System.out.println("Enter any known health issues (max 20 char): ");
		 pjo.setKnownIssues(sc.nextLine());
		 
		 int roleSel = 0;
		 
		 while(roleSel < 1 || roleSel > 7) {
			 System.out.println("Select the Role Played: ");
			 System.out.println("1 - Goalkeeper");
			 System.out.println("2 - Centre Back");
			 System.out.println("3 - Full Back");
			 System.out.println("4 - Midfielder");
			 System.out.println("5 - Wing");
			 System.out.println("6 - Forward");
			 System.out.println("7 - Striker");

			 roleSel = Validate.validateInteger();
		
			 if(roleSel == 1) {
			  pjo.setRole("Goalkeeper");
			 }//if
			 
			 else if(roleSel == 2) {
				  pjo.setRole("Centre Back");
			 }//else if
			 
			 else if(roleSel == 3) {
				  pjo.setRole("Full Back");
			 }//else if
			 
			 else if(roleSel == 4) {
				  pjo.setRole("Midfielder");
			 }//else if
			 
			 else if(roleSel == 5) {
				  pjo.setRole("Wing");
			 }//else if
			 
			 else if(roleSel == 6) {
				  pjo.setRole("Forward");
			 }//else if
			 
			 else if(roleSel == 7) {
				  pjo.setRole("Striker");
			 }//else if
		 }//while loop			
		 System.out.println("Fee Paid [type 'YES' or 'NO']: ");
		 String fees = Validate.validateString();
		 
		 if(fees.equals("yes") || fees.equals("YES")) {
			pjo.setFees("yes");
			
			int type = 0;
			while(type < 1 || type > 3) {
			 System.out.println("Select a type of payment:");
				System.out.println("1 - Annual");
				System.out.println("2 - Semestral");
				System.out.println("3 - Monthly");
				type = Validate.validateInteger();
			}//while loop
				if(type == 1) {
					pjo.setFeesExp("Annual");
				}//if type==1
				else if(type == 2) {
					pjo.setFeesExp("Semestral");
				}//else if
				else if(type == 3) {
					pjo.setFeesExp("Monthly");
				}//else if
				else {
					Validate.validateInteger();
				}//else
			 }//if
			 else {
				 pjo.setFees("no");
				 pjo.setFeesExp("-");
			 }//else
		
		 
		 
		 System.out.println("\n*** '"+pjo.getName().toUpperCase()+" "+pjo.getSurname().toUpperCase()+"' has been added. ***\n".toUpperCase());
		 
	}//juniorPlayersDataEntry
	
	public void staffDataEntry(StaffObject so, Scanner sc) {
		
		System.out.println("\n|-ADD A NEW STAFF MEMBER-|\n");
	
		System.out.println("Enter name: ");
		 so.setName(sc.nextLine());
		 
		 System.out.println("Enter Surname: ");
		 so.setSurname(sc.nextLine());
		 
		 System.out.println("Enter Age: ");
		 so.setAge(sc.nextLine());
		 
		 System.out.println("Enter Date of Birth [dd/mm/yyyy]: ");
		 so.setDateOfBirth(sc.nextLine());
		 
		 System.out.println("Enter Telephone Number: ");
		 so.setTelNumber(sc.nextLine());
		 
		 System.out.println("Enter Mobile Number: ");
		 so.setMobileNumber(sc.nextLine());
		 
		 System.out.println("Enter Email: ");
		 so.setEmail(sc.nextLine());
		 
		 System.out.println("Enter House Number: ");
		 so.setHouseNumber(sc.nextLine());	 
		 
		 System.out.println("Enter Address: ");
		 so.setAddress(sc.nextLine());
		 
		 System.out.println("Enter PostCode: ");
		 so.setPostCode(sc.nextLine());
		 
		 System.out.println("Fee Paid [type 'YES' or 'NO']: ");
		 String fees = Validate.validateString();
		 
		 if(fees.equals("yes") || fees.equals("YES")) {
			so.setFees("yes");
			
			
			int type = 0;
			while(type < 1 || type > 3) {
			 System.out.println("Select a type of payment:");
				System.out.println("1 - Annual");
				System.out.println("2 - Semestral");
				System.out.println("3 - Monthly");
				type = Validate.validateInteger();
			}//while loop
				if(type == 1) {
					so.setFeesExp("Annual");
				}//if type==1
				else if(type == 2) {
					so.setFeesExp("Semestral");
				}//else if
				else if(type == 3) {
					so.setFeesExp("Monthly");
				}//else if
				else {
					Validate.validateInteger();
				}//else
			 }//if
			 else {
				 so.setFees("no");
				 so.setFeesExp("-");
			 }//else
		
		 
		 System.out.println("\n*** '"+so.getName().toUpperCase()+" "+so.getSurname().toUpperCase()+"' has been added. ***\n".toUpperCase());
		 
	}//StaffDataEntry
	
	public void gameDataEntry(Games g, Scanner sc) {
		
		System.out.println("\n|-ADD A NEW GAME RECORD-|\n");
		System.out.println("Date of match: ");
		g.setDateOfMatch(sc.nextLine());
		System.out.println("Location of Match [HOME/AWAY]: ");
		String location = Validate.validateString();
		if(location.equals("home") || location.equals("HOME")) {
			g.setLocation("HOME");
			
		}//if
		else if(location.contains("away") || location.equals("AWAY")) {
			g.setLocation("AWAY");
		}//else if
		else {
			System.out.println("Error. Not valid choice. Type 'HOME' or  'AWAY'. ");
		}//else
		System.out.println("Opposition Team Name:");
		g.setOpposition(sc.nextLine());
		System.out.println("Kick Off Time: ");
		g.setKoTime(sc.nextLine());
		System.out.println("Result [WIN/LOST/DRAW]");
		String result = Validate.validateString();
		if(result.equals("win") || result.equals("WIN")) {
			g.setResult("WIN");
		}//if
		else if(result.equals("lost") || result.equals("LOST")) {
			g.setResult("LOST");
		}//else if
		else if(result.equals("draw") || result.equals("DRAW")) {
			g.setResult("DRAW");
		}//else if
		else {
			System.out.println("Error. Not valid choice. Type 'WIN' 'LOST' or  'DRAW'. ");
		}//else
		System.out.println("Score:");
		g.setFinalScore(sc.nextLine());
		System.out.println("First Half Score: ");
		g.setFirstHalfScore(sc.nextLine());
		System.out.println("Second Half Score: ");
		g.setSecondHalfScore(sc.nextLine());
		System.out.println("Comments [800 characters max]: ");
		g.setComments(sc.nextLine());
		
		
		System.out.println("\n***New Game on" + g.getDateOfMatch() +" has been created. ***\n".toUpperCase());
		
	}//MatchDataEntry
	
	
	public void trainingDataEntry(Trainings tr, Scanner sc) {
		
		System.out.println("\n|-ADD A NEW GAME RECORD-|\n");
		System.out.println("Training Date: ");
		tr.setTrainingDate(sc.nextLine());
		System.out.println("Training Location:");
		tr.setTrainingLocation(sc.nextLine());
		System.out.println("Training Time:");
		tr.setTrainingTime(sc.nextLine());
		System.out.println("Coach Full Name:");
		tr.setCoachName(sc.nextLine());
		System.out.println("Skills Undertaken:");
		tr.setSkillsUndertaken(sc.nextLine());
		System.out.println("Activities:");
		tr.setActivities(sc.nextLine());
		System.out.println("PlayersList");
		tr.setPlayersList(sc.nextLine());
		System.out.println("Injuries:");
		tr.setInjuries(sc.nextLine());
		System.out.println("Notes");
		tr.setNotes(sc.nextLine());
		
		System.out.println("\n***New Training on" + tr.getTrainingDate() + " has been created. ***\n".toUpperCase());
			
	}//trainingDataEntry
	
}//DataEntry class
