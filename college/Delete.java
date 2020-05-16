package gu_test2;

import java.util.ArrayList;

public class Delete { //remove class remove an object from an arrayList
	
	
	public void removeSeniorPlayer(ArrayList<SeniorPlayersObject> p) {
		System.out.println("\nSelect SFU NUM of the player you want to remove [ex: 2]: ");
		int indexRemove = Validate.validateInteger()-1;
		if(indexRemove >= 0 && indexRemove < p.size()) {
			String prname = p.get(indexRemove).getName();
			String prsurname = p.get(indexRemove).getSurname();
			System.out.println("You are removing Player number " + (indexRemove+1) + " " + prname + " "+ prsurname + ". Are you sure?");
			String answer = Validate.validateString();
			if(answer.equals("yes") || answer.equals("YES")) {
				if(null != p) {
					for(int i=0;i<p.size();i++) {
							if(i==indexRemove) {
							p.remove(indexRemove);
							}//if(i==indexRemove)		
					}//for loop
					for(int i=(indexRemove);i<p.size();i++) {
						p.get(i).SFU_number--;
					}//second for loop
				}//if (null != p)
				System.out.println("Player " + prname + " " + prsurname + " has been removed.");
			}//if answer==yes
			else if(answer.equals("no") || answer.equals("NO")) {
				System.out.println("Player " + prname + " " + prsurname + " has not been removed.");
			}//else if
			else {
				System.out.println("Please, type 'yes' or 'no'");
			}//else
		}//if indexRemove
		else {
			System.out.println("SFU Number " + (indexRemove+1)+ " does not exist");
		}//else
	}//removeSeniorPlayer

	
	public void removeJuniorPlayer(ArrayList<JuniorPlayersObject> pj) {
		
		System.out.println("\nWhat Player do you want to remove? ");
		int indexRemove = Validate.validateInteger()-1;
		if(indexRemove >= 0 && indexRemove < pj.size()) {
			String prname = pj.get(indexRemove).getName();
			String prsurname = pj.get(indexRemove).getSurname();
			System.out.println("You are removing Player number " + (indexRemove+1) + " " + prname + " " + prsurname +". Are you sure?");
			String answer = Validate.validateString();
			if(answer.equals("yes") || answer.equals("YES")) {
				if(null != pj) {
					for(int i=0;i<pj.size();i++) {
							if(i==indexRemove) {
							pj.remove(indexRemove);
							}//if(i==indexRemove)		
					}//for loop
					for(int i=(indexRemove);i<pj.size();i++) {
						pj.get(i).SFU_number--;
					}//second for loop
				}//if (null != pj)
				System.out.println("Player " + prname + " has been removed.");
			}//if answer==yes
			else if(answer.equals("no") || answer.equals("NO")) {
				System.out.println("Player " + prname + " " + prsurname + " has not been removed.");
			}//else if
			else {
				System.out.println("Please, type 'yes' or 'no'");
			}//else
		}//if indexRemove
		else {
			System.out.println("SFU Number " + (indexRemove+1) + " does not exist");
		}//else
	}//removeJuniorPlayer
	
	
	
	public void removeStaff(ArrayList<StaffObject> s) {
		
		System.out.println("\n Type the SFU NUMBER of the Staff member you want to remove: ");
		int indexRemove = Validate.validateInteger()-1;
		if(indexRemove >= 0 && indexRemove < s.size()){	
			String sname = s.get(indexRemove).getName();
			String ssurname = s.get(indexRemove).getSurname();
			System.out.println("You are removing Staff member number " + (indexRemove+1) + " " + sname + " " + ssurname + ". Are you sure?");
			String answer = Validate.validateString();
			if(answer.equals("yes") || answer.equals("YES")) {
				if(null != s) {
					for(int i=0;i<s.size();i++) {
							if(i==indexRemove) {
							s.remove(indexRemove);
							}//if(i==indexRemove)		
					}//for loop
					for(int i=(indexRemove);i<s.size();i++) {
						s.get(i).SFU_number--;
					}//second for loop
				}//if (null != s)
				System.out.println("Staff member " + sname + " has been removed.");
			}//if answer==yes
			else if(answer.equals("no") || answer.equals("NO")) {
				System.out.println("Player " + sname + " " + ssurname + " has not been removed.");
			}//else if
			else {
				System.out.println("Please, type 'yes' or 'no'");
			}//else
		}//if indeRemove
		else {
			System.out.println("SFU Number " + (indexRemove+1) + " does not exist");
		}//else
	}//removeStaffObject
	
	
	public void removeGames(ArrayList<Games> g) {

		System.out.println("|-GAMES LIST-|\n");
		System.out.printf("%2s %14s %12s %18s", "ID" ,"DATE", "LOCATION", "OPPOSITION\n");
		System.out.printf("%2s %14s %12s %18s", "--","-----------","---------","--------------\n");
		for(int i=0;i<g.size();i++) {
			System.out.printf("%2s %14s %12s %17s\n",(i+1), g.get(i).getDateOfMatch(), g.get(i).getLocation(),g.get(i).getOpposition());
		}//for loop
		System.out.println("\nWhat game do you want to remove?.");
		int indexRemove = Validate.validateInteger()-1;
		if(indexRemove >=0 && indexRemove < g.size()) {
			if(null != g) {
				for(int i=0;i<g.size();i++) {
					if(i==indexRemove) {
						System.out.printf("%12s %12s %20s","DATE","LOCATION","KICK-OFF TIME\n");
						System.out.printf("%12s %12s %19s\n","-------","----------","---------------");
						System.out.printf("%12s %12s %19s\n\n", g.get(indexRemove).getDateOfMatch(),g.get(indexRemove).getLocation(),
								g.get(indexRemove).getKoTime());
						System.out.printf("%12s %13s","OPPISITION", "RESULT\n");
						System.out.printf("%12s %12s\n","------------","----------");
						System.out.printf("%12s %12s\n\n", g.get(indexRemove).getOpposition(),g.get(indexRemove).getResult());
						System.out.printf("%12s %12s %16s","HT SCORE","2H SCORE","FINAL SCORE\n");
						System.out.printf("%12s %12s %15s\n", "----------","----------","-------------");
						System.out.printf("%12s %12s %15s\n\n",g.get(indexRemove).getFirstHalfScore(),g.get(indexRemove).getSecondHalfScore(),
								g.get(indexRemove).getFinalScore());
						System.out.printf("%25s\n","COMMENTS");
						System.out.printf("%25s\n","------------");
						System.out.printf("%25s\n", g.get(indexRemove).getComments());
						
						String sdate = g.get(indexRemove).getDateOfMatch();
						String sopposition = g.get(indexRemove).getOpposition();
						System.out.println("\nYou are removing this Game " + (indexRemove+1) + "on date " + sdate + ". Are you sure?");
						String answer = Validate.validateString();
						if(answer.equals("yes") || answer.equals("YES")) {
							if(null != g) {
								for(int n=0;n<g.size();n++) {
										if(n==indexRemove) {
										g.remove(indexRemove);
										}//if(i==indexRemove)		
								}//for loop
							}//if (null != g)
							System.out.println("The game on " + sdate + " against " + sopposition + " has been removed.");
						}//if answer==yes
						else if(answer.equals("no") || answer.equals("NO")) {
							System.out.println("Game on " + sdate + " has not been removed.");
						}
						else {
							System.out.println("Please, type 'yes' or 'no'");
						}//else
					}//if i==indexRemove
				}//for loop
			}//if null != g
		}//if indexRemove
		else {
			System.out.println("Game " + (indexRemove+1) + " does not exist");	
		}//else
	}//removeGame
	
	
	public void removeTraining(ArrayList<Trainings> t) {
		
		System.out.println("|-TRAINING LIST-|\n");
		System.out.printf("%2s %14s %12s %14s", "ID" ,"DATE", "LOCATION", "TIME\n");
		System.out.printf("%2s %14s %12s %14s", "--","-----------","---------","-----\n");
		for(int i=0;i<t.size();i++) {
			System.out.printf("%2s %14s %12s %15s\n",(i+1), t.get(i).getTrainingDate(), t.get(i).getTrainingLocation(),t.get(i).getTrainingTime());
		}//for loop
		System.out.println("What Training do you want to remove?");
		int indexRemove = Validate.validateInteger() -1;
		if(indexRemove >=0 && indexRemove < t.size()) {
			if(null != t) {
				for(int i=0;i<t.size();i++) {
					if(i==indexRemove) {
						System.out.printf("%12s %12s %13s","DATE","LOCATION","TIME\n");
						System.out.printf("%12s %12s %12s\n","-------","----------","-----");
						System.out.printf("%12s %12s %12s\n\n", t.get(i).getTrainingDate(),t.get(i).getTrainingLocation(),t.get(i).getTrainingTime());
						System.out.printf("%12s %18s %25s","COACH", "PLAYERS LIST", "SKILLS UNDERTAKEN\n");
						System.out.printf("%12s %18s %24s\n","------------","------------------","---------------------");
						System.out.printf("%12s %18s %24s\n\n", t.get(i).getCoachName(),t.get(i).getPlayersList(),t.get(i).getSkillsUndertaken());
						System.out.printf("%19s %17s","ACTIVITIES","INJURIES\n");
						System.out.printf("%19s %16s\n", "----------------","----------");
						System.out.printf("%19s %16s\n\n",t.get(i).getActivities(),t.get(i).getInjuries());
						System.out.printf("%25s\n","NOTES");
						System.out.printf("%25s\n","------------");
						System.out.printf("%25s\n", t.get(i).getNotes());
					}//if statement
				}//for loop
			}//if null != g
		
			String sdate = t.get(indexRemove).getTrainingDate();
			System.out.println("\n\nYou are removing this Training on " + sdate + ". Are you sure?");
			String answer = Validate.validateString();
			if(answer.equals("yes") || answer.equals("YES")) {
				if(null != t) {
					for(int n=0;n<t.size();n++) {
							if(n==indexRemove) {
							t.remove(indexRemove);
							}//if(i==indexRemove)		
					}//for loop
					System.out.println("The game on " + sdate + " has been removed.\n");	
				}//if null != t
			}//if answer == yes
			else if(answer.equals("no") || answer.equals("NO")) {
				System.out.println("Player " + sdate + " has not been removed.");
			}//else if
			else {
				System.out.println("Please, type 'yes' or 'no'");
			}//else
		}//if indexRemove
		else {
			System.out.println("Training " + (indexRemove+1) + " does not exist");
		}//else
	}//removeTraining
	
}//Delete class
