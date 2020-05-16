package gu_test2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SaveAndExit { //this class write all data into database text files

	
	public void saveAndExit(ArrayList<SeniorPlayersObject>list,ArrayList<JuniorPlayersObject> jplist, ArrayList<StaffObject> slist, ArrayList<Games> glist, 
			ArrayList<Trainings> tlist, ArrayList<PlayerProfile> pplist, Scanner sc) throws IOException 
	{ //This method Save all the changes made by the user and close the program.
		
	System.out.println("Do you want to save before exit?".toUpperCase());
	String exit = Validate.validateString();
		if(exit.equals("yes") || exit.equals("YES")) {
	WriteFile wf = new WriteFile();
	wf.writeToFile(list, "players");
	wf.writeToFileJP(jplist, "junior_players");
	wf.writeToFileStaff(slist, "staff");
	wf.writeToFileGames(glist, "games");
	wf.writeToFileTrainings(tlist, "trainings");
	wf.writeToFilePlayerProfile(pplist, "playerProfile");
	System.out.println("Goodbye".toUpperCase());
	System.exit(0);
		}//if exit==yes
		else if(exit.equals("no") || exit.equals("NO")){
			System.out.println("Goodbye".toUpperCase());
			System.exit(0);
		}//else if
		else {
			System.out.println("Invalid choice! Please, type 'YES' to save and Exit OR 'NO' to exit.\n".toUpperCase());
		}//else
	}//SaveAndExit method

}//SaveAndExit class
