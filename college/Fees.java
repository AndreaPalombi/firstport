package gu_test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Fees {
	
	//declare variables
	
	String fees;
	String feesExp;
	int i;
	
	ArrayList<Fees> f = new ArrayList<Fees>();
	
	public Fees() {//void constructor
		
	}

	public Fees(String fees, String feesExp) {
		
		this.fees = fees;
		this.feesExp = feesExp;
	}
	
	public String getFees() {
		return fees;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	public String getFeesExp() {
		return feesExp;
	}

	public void setFeesExp(String feesExp) {
		this.feesExp = feesExp;
	}


	public void seniorPlayersFees(ArrayList<SeniorPlayersObject> players, ArrayList<Fees> f, Scanner sc) {
		System.out.printf("%10s %15s %19s %18s %14s %18s","SFU_NUM", "NAME", "SURNAME", "DATE OF BIRTH", "FEES PAID", "TYPE OF PAYMENT\n");
		System.out.printf("%10s %15s %19s %18s %14s %18s", "-----", "-------------","--------------","--------------","----------","----------------\n");
		if(null != players) {	
			for(i=0;i<players.size();i++) {
				System.out.printf("%10s %15s %19s %18s %14s %16s\n", players.get(i).getSFU_number(),players.get(i).getName(),players.get(i).getSurname(),
						players.get(i).getDateOfBirth(),players.get(i).getFees(),players.get(i).getFeesExp());
				}//for loop
			}//if selection	
		goBack(f,sc);
	}//method
	

	public void juniorPlayersFees(ArrayList<JuniorPlayersObject> juniorPlayers, Scanner sc) {
		System.out.printf("%10s %15s %19s %18s %14s %18s","SFU_NUM", "NAME", "SURNAME", "DATE OF BIRTH", "FEES PAID", "TYPE OF PAYMENT\n");
		System.out.printf("%10s %15s %19s %18s %14s %18s", "-----", "-------------","--------------","--------------","----------","----------------\n");
		if(null != juniorPlayers) {	
			for(i=0;i<juniorPlayers.size();i++) {
				System.out.printf("%10s %15s %19s %18s %14s %16s\n", juniorPlayers.get(i).getSFU_number(),juniorPlayers.get(i).getName(),
				juniorPlayers.get(i).getSurname(),juniorPlayers.get(i).getDateOfBirth(),juniorPlayers.get(i).getFees(),juniorPlayers.get(i).getFeesExp());
				}//for loop
			}//if selection
		goBack(f,sc);
	}//JuniorPlayersFees
	
	
	public void staffFees(ArrayList<StaffObject> staff, Scanner sc) {
		System.out.printf("%10s %15s %19s %18s %14s %18s","SFU_NUM", "NAME", "SURNAME", "DATE OF BIRTH", "FEES PAID", "TYPE OF PAYMENT\n");
		System.out.printf("%10s %15s %19s %18s %14s %18s", "-----", "-------------","--------------","--------------","----------","----------------\n");
		if(null != staff) {	
			for(i=0;i<staff.size();i++) {
				System.out.printf("%10s %15s %19s %18s %14s %16s\n", staff.get(i).getSFU_number(),staff.get(i).getName(),staff.get(i).getSurname(),
						staff.get(i).getDateOfBirth(),staff.get(i).getFees(),staff.get(i).getFeesExp());
				}//for loop
			}//if selection
		goBack(f,sc);
	}//StaffFees
	
	
	public void goBack(ArrayList<Fees> f, Scanner sc) {
		System.out.println("\nPress 'B' to back to the Menu. ".toUpperCase());
		char goBack = sc.next().charAt(0);
		if(goBack  == 'b' || goBack == 'B') {	
		}//if
		else {
			
		}//else
	}//goBack
	
}//Fees class
