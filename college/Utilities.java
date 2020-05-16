package gu_test2;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Utilities { //this class contains method with useful features
	
	Menu menu = new Menu();
	
	
	public String systemTimer()	{	//This method is just a timer which shows time-zone.
		//System. out. print("\033[H\033[2J");
		//System. out. flush();
		Clock c = Clock.systemDefaultZone();    
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\t\t\t\tdd/MM/yyyy  HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now) + "("+c.getZone()+")\n";
	}//systemTimer
	
	
	public void loading(){ //This method just displays the written "loading".
		try {
			System.out.println("loading...\n");
		    Thread.sleep(1200);
		}catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}//catch
	}//databaseLoading

}//Utilities class
