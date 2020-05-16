package gu_test2;

public class Menu {

	
	
public void menu() { //This method contains the Menu displayed to the user as system navigation.
		
		System.out.printf("%67s %72s %70s", "**************MENU***************\n",
				 "--------------------------------------------------\n",
				"           Please, make a selection from the list below\n\n");
		System.out.printf("%48s %-30s\n", "1 -", "Add");
		System.out.printf("%48s %-30s\n", "2 -", "Display");
		System.out.printf("%48s %-30s\n", "3 -", "Delete");
		System.out.printf("%48s %-30s\n", "4 -", "Edit");
		System.out.printf("%48s %-30s\n", "5 -", "Fees");
		System.out.printf("%48s %-30s\n", "6 -", "Player Profile");
		System.out.printf("%48s %-30s\n", "7 -", "Save And Exit");
		System.out.printf("\n");	
	}//method menu

}//Class Menu
