package gu_test2;

import java.util.ArrayList;

public class Edit { //edit class contains all methods to edit data already saved into a database. An object which needs to be edited is
	//removed from the ArrayList and added again but with new values on edited data type
	

	public void editSeniorPlayerChoice(ArrayList<SeniorPlayersObject> p) { 
		try {
			SeniorPlayersObject editPlayer = editSeniorPlayer(p);
			p.add(editPlayer.getSFU_number()-1,editPlayer);	
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Error. This SFU NUM does not exist.\n");
		}//catch
	}//editSeniorPlayer

	
	public SeniorPlayersObject editSeniorPlayer(ArrayList<SeniorPlayersObject> p) { //This method edit a Senior player
		
		String editParam = "";
		String editValue = "";
		SeniorPlayersObject editPlayer = new SeniorPlayersObject();
		
		try {
			System.out.println("\nSelect the Player's SFU NUM to edit:");
			int indexEdit = Validate.validateInteger()-1;
				if(indexEdit >= 0) {
					editPlayer = p.get(indexEdit);
					p.remove(editPlayer);
					System.out.println("Type exactly the data you want to edit [Ex: AGE]");
					editParam = Validate.validateString().toUpperCase();
					System.out.println("Enter the new value for: " + editParam);
					editValue = Validate.validateString();
					editPlayer.editPlayerObj(editPlayer,editParam, editValue);
				}//if
				System.out.println(editParam + " has been edited.\n");
	}catch(NullPointerException e) {
		System.out.println("Data type " + editParam + " does not exist.\n");
	}//catch
		return editPlayer;
	}//editPlayer method
	
	
	public void editJuniorPlayerChoice(ArrayList<JuniorPlayersObject> pj) {
		try {
			JuniorPlayersObject editJuniorPlayer = editJuniorPlayer(pj);
			pj.add(editJuniorPlayer.getSFU_number()-1,editJuniorPlayer);	
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Error. This SFU NUM does not exist.\n");
			}//catch
	}//editJuniorPlayer
	
	
	public JuniorPlayersObject editJuniorPlayer(ArrayList<JuniorPlayersObject> pj) { //This method edit a JuniorPlayer
		
		String editParam = "";
		String editValue = ""; 
		
		JuniorPlayersObject editJuniorPlayer = new JuniorPlayersObject();
		try {
			System.out.println("Select the Player's SFU NUM to edit:");
			int indexEdit = Validate.validateInteger()-1;
				if(indexEdit >= 0) {
					editJuniorPlayer = pj.get(indexEdit);
					pj.remove(editJuniorPlayer);
					System.out.println("Type exactly the data you want to edit [Ex: AGE]");
					editParam = Validate.validateString().toUpperCase();
					System.out.println("Enter the new value for: " + editParam);
					editValue = Validate.validateString();
					editJuniorPlayer.editJuniorPlayerObj(editJuniorPlayer,editParam, editValue);
				}//if statement
				System.out.println(editParam + " has been edited.\n");
		}catch(NullPointerException e) {
			System.out.println("Data type " + editParam + " does not exist.\n");
		}//catch
		return editJuniorPlayer;
	}//editPlayer method
	
	
	public void editStaffChoice(ArrayList <StaffObject> s) { //This method edit a staff member
		try {
		StaffObject editStaffObj = editStaff(s);
		s.add(editStaffObj.getSFU_number()-1,editStaffObj);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Error. This SFU NUM does not exist.\n");
		}//catch
	}//editStaffChoice

	public StaffObject editStaff(ArrayList <StaffObject> s) {
		
		String editParam = "";
		String editValue = ""; 
		
		StaffObject editStaffObj = new StaffObject();
		try {
			System.out.println("Select the Staff's SFU NUM to edit:");
			int indexEdit = Validate.validateInteger()-1;
				if(indexEdit >= 0) {
					editStaffObj = s.get(indexEdit);
					s.remove(editStaffObj);
					System.out.println("Type exactly the data you want to edit [Ex: AGE]");
					editParam = Validate.validateString().toUpperCase();
					System.out.println("Enter the new value for: " + editParam);
					editValue = Validate.validateString();
					editStaffObj.editStaffObj(editStaffObj,editParam, editValue);
				}//if statement
				System.out.println(editParam + " has been edited.\n");
		}catch(NullPointerException e) {
		System.out.println("Data type " + editParam + " does not exist.\n");
		}//catch
		return editStaffObj;
	}//editPlayer method
	
	
	public void editGameChoice(ArrayList <Games> g) { //This method edit a Game 
		try {
		Games editGames = editGames(g);
		g.add(editGames);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Error. This SFU NUM does not exist.\n");
		}//catch
	}//editGameChoice

	
	public Games editGames(ArrayList<Games> g) {
		
		String editParam = "";
		String editValue = "";
		
		Games editGames = new Games();
		
		System.out.println("|-GAMES LIST-|\n");
		System.out.printf("%2s %14s %12s %18s", "ID" ,"DATE", "LOCATION", "OPPOSITION\n");
		System.out.printf("%2s %14s %12s %18s", "--","-----------","---------","--------------\n");
		for(int i=0;i<g.size();i++) {
			System.out.printf("%2s %14s %12s %17s\n",(i+1), g.get(i).getDateOfMatch(), g.get(i).getLocation(),g.get(i).getOpposition());
		}//for loop
		try {
			System.out.println("Type the Game ID you whant to edit");
			int indexEdit = Validate.validateInteger()-1;
			if(null != g) {
				for(int i=0;i<g.size();i++) {
					if(i==indexEdit) {
						System.out.printf("%12s %12s %20s","DATE","LOCATION","KICK-OFF TIME\n");
						System.out.printf("%12s %12s %19s\n","-------","----------","---------------");
						System.out.printf("%12s %12s %19s\n\n", g.get(indexEdit).getDateOfMatch(),g.get(indexEdit).getLocation(),
						g.get(indexEdit).getKoTime());
						System.out.printf("%12s %13s","OPPISITION", "RESULT\n");
						System.out.printf("%12s %12s\n","------------","----------");
						System.out.printf("%12s %12s\n\n", g.get(indexEdit).getOpposition(),g.get(indexEdit).getResult());
						System.out.printf("%12s %12s %16s","HT SCORE","2H SCORE","FINAL SCORE\n");
						System.out.printf("%12s %12s %15s\n", "----------","----------","-------------");
						System.out.printf("%12s %12s %15s\n\n",g.get(indexEdit).getFirstHalfScore(),g.get(indexEdit).getSecondHalfScore(),
						g.get(indexEdit).getFinalScore());
						System.out.printf("%25s\n","COMMENTS");
						System.out.printf("%25s\n","------------");
						System.out.printf("%25s\n", g.get(indexEdit).getComments());
						
							if(indexEdit >= 0) {
								editGames = g.get(indexEdit);
								g.remove(editGames);
								System.out.println("Type exactly the kind of data you want to edit [Ex: OPPOSITION]");
								editParam = Validate.validateString().toUpperCase();
								System.out.println("Enter the new value for: " + editParam);
								editValue = Validate.validateString();
								editGames.editGames(editGames,editParam, editValue);
							}//if indexEdit >=0 		
						}//if i==indexEdit
				}//for loop
			}//if(null!=g)
			System.out.println(editParam + " has been edited.\n");
		}catch(NullPointerException e) {
		System.out.println("Data type " + editParam + " does not exist.\n");
		}//catch
		return editGames;
	}//editGames
	
	
	public void editTrainingChoice(ArrayList <Trainings> t) { //This method edit a Training
		Trainings editTrainings = editTrainings(t);
		t.add(editTrainings);
	}//editTrainingChoice
	

	public Trainings editTrainings(ArrayList<Trainings> t) {
		
		String editParam = "";
		String editValue = "";
	
	Trainings editTrainings = new Trainings();
	
	System.out.println("|-TRAINING LIST-|\n");
	System.out.printf("%2s %14s %12s %14s", "ID" ,"DATE", "LOCATION", "TIME\n");
	System.out.printf("%2s %14s %12s %14s", "--","-----------","---------","-----\n");
	for(int i=0;i<t.size();i++) {
		System.out.printf("%2s %14s %12s %15s\n",(i+1), t.get(i).getTrainingDate(), t.get(i).getTrainingLocation(),t.get(i).getTrainingTime());
	}//for loop
	try {
		System.out.println("\nType the Training ID you whant to edit");
		int trainingDispChoice = Validate.validateInteger()-1;
			if(null != t) {
				for(int i=0;i<t.size();i++) {
					if(i==trainingDispChoice) {
						System.out.printf("%12s %12s %13s","DATE","LOCATION","TIME\n");
						System.out.printf("%12s %12s %12s\n","-------","----------","-----");
						System.out.printf("%12s %12s %12s\n\n", t.get(i).getTrainingDate(),t.get(i).getTrainingLocation(),t.get(i).getTrainingTime());
						System.out.printf("%12s %25s %27s","COACH", "PLAYERS LIST", "SKILLS\n");
						System.out.printf("%12s %25s %26s\n","------------","------------------","---------------------");
						System.out.printf("%12s %23s %26s\n\n", t.get(i).getCoachName(),t.get(i).getPlayersList(),t.get(i).getSkillsUndertaken());
						System.out.printf("%19s %17s","ACTIVITIES","INJURIES\n");
						System.out.printf("%19s %16s\n", "----------------","----------");
						System.out.printf("%19s %16s\n\n",t.get(i).getActivities(),t.get(i).getInjuries());
						System.out.printf("%25s\n","NOTES");
						System.out.printf("%25s\n","------------");
						System.out.printf("%25s\n", t.get(i).getNotes());	
						
							if(trainingDispChoice >= 0) {
								editTrainings = t.get(trainingDispChoice);
								t.remove(editTrainings);
								System.out.println("\nType exactly the kind of data you want to edit [Ex: PLAYERS LIST]");
								editParam = Validate.validateString().toUpperCase();
								System.out.println("Enter the new value for: " + editParam);
								editValue = Validate.validateString();
								editTrainings.editTrainingObj(editTrainings,editParam, editValue);
							}//if trainingDispChoice >=0
					}//if i==trainingDispChoice
				}//for loop
			}//if null != g
			System.out.println(editParam + " has been edited.\n");
		}catch(NullPointerException e) {
		System.out.println("Data type " + editParam + " does not exist.\n");
		}//catch
		return editTrainings;
	
	}//editTrainings
	
}//Edit class