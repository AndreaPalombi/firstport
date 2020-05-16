package gu_test2;

import java.util.ArrayList;
import java.util.Scanner;


public class PlayerProfile { //declare variables

	String name;
	String surname;
	String shortPass;
	String longPass;
	String firstTouch;
	String front;
	String rear;
	String slide;
	String volley;
	String lob;
	String strike;
	String penalty;
	String freeKick;
	String passComments;
	String tackleComments;
	String strikeComments;
	
	
	public PlayerProfile() { //void constructor
		
	}
	
	
	public PlayerProfile(String name, String surname, String shortPass,String longPass,String firstTouch,String passComments, String front,String rear,
			String slide, String tackleComments,String volley,String lob, String strike, String strikeComments, String penalty,String freeKick) 
	{ //initialise variables
		
		this.name = name;
		this.surname = surname;
		this.shortPass = shortPass;
		this.longPass = longPass;
		this.firstTouch = firstTouch;
		this.passComments = passComments;
		this.front = front;
		this.rear = rear;
		this.slide = slide;
		this.tackleComments = tackleComments;
		this.volley = volley;
		this.lob = lob;
		this.strike = strike;
		this.strikeComments = strikeComments;
		this.penalty = penalty;
		this.freeKick = freeKick;
		
	}
	
	
	//=====SETTERS AND GETTERS====//
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getShortPass() {
		return shortPass;
	}


	public void setShortPass(String shortPass) {
		this.shortPass = shortPass;
	}


	public String getLongPass() {
		return longPass;
	}


	public void setLongPass(String longPass) {
		this.longPass = longPass;
	}


	public String getFirstTouch() {
		return firstTouch;
	}


	public void setFirstTouch(String firstTouch) {
		this.firstTouch = firstTouch;
	}


	public String getFront() {
		return front;
	}


	public void setFront(String front) {
		this.front = front;
	}


	public String getRear() {
		return rear;
	}


	public void setRear(String rear) {
		this.rear = rear;
	}


	public String getSlide() {
		return slide;
	}


	public void setSlide(String slide) {
		this.slide = slide;
	}


	public String getVolley() {
		return volley;
	}


	public void setVolley(String volley) {
		this.volley = volley;
	}


	public String getLob() {
		return lob;
	}


	public void setLob(String lob) {
		this.lob = lob;
	}


	public String getStrike() {
		return strike;
	}


	public void setStrike(String strike) {
		this.strike = strike;
	}


	public String getPenalty() {
		return penalty;
	}


	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}


	public String getFreeKick() {
		return freeKick;
	}


	public void setFreeKick(String freeKick) {
		this.freeKick = freeKick;
	}


	public String getPassComments() {
		return passComments;
	}


	public void setPassComments(String passComments) {
		this.passComments = passComments;
	}


	public String getTackleComments() {
		return tackleComments;
	}


	public void setTackleComments(String tackleComments) {
		this.tackleComments = tackleComments;
	}


	public String getStrikeComments() {
		return strikeComments;
	}


	public void setStrikeComments(String strikeComments) {
		this.strikeComments = strikeComments;
	}
		
	
	
	public void addPlayerProfile(ArrayList<SeniorPlayersObject> p,ArrayList<PlayerProfile> pp, Scanner sc) {
		System.out.printf("%10s %15s %19s %18s","SFU_NUM", "NAME", "SURNAME", "DATE OF BIRTH\n");
		System.out.printf("%10s %15s %19s %18s", "-----", "-------------","--------------","--------------\n");
		if(null != p) {	
			
			for(int i=0;i<p.size();i++) {
				System.out.printf("%10s %15s %19s %18s\n", (i+1),p.get(i).getName(),p.get(i).getSurname(),
						p.get(i).getDateOfBirth());
				}//for loop
		}//if selection	
	
		System.out.println("Select a Player: ");
		int selection = Validate.validateInteger();
		
			name = p.get(selection-1).getName();
			surname = p.get(selection-1).getSurname();
		
			
			dataEntry(sc);
			
			
			pp.add(new PlayerProfile(getName(),getSurname(),getShortPass(),getLongPass(),getFirstTouch(),getPassComments(),getFront(),getRear(),
					getSlide(),getTackleComments(),getVolley(),getLob(),getStrike(),getStrikeComments(),getFreeKick(),getPenalty()));
			
			goBack(sc);	
	}//addPlayerProfile
	
	
	public void addJuniorPlayerProfile(ArrayList<JuniorPlayersObject> pj, ArrayList<PlayerProfile> pp, Scanner sc) {
		System.out.printf("%10s %15s %19s %18s","SFU_NUM", "NAME", "SURNAME", "DATE OF BIRTH\n");
		System.out.printf("%10s %15s %19s %18s", "-----", "-------------","--------------","--------------\n");
		if(null != pj) {	
			
			for(int i=0;i<pj.size();i++) {
				System.out.printf("%10s %15s %19s %18s\n", (i+1),pj.get(i).getName(),pj.get(i).getSurname(),
						pj.get(i).getDateOfBirth());
				}//for loop
		
		}//if selection	
	
		System.out.println("Select a Player: ");
		int selection = Validate.validateInteger();
		
		dataEntry(sc);
					
		name = pj.get(selection-1).getName();
		surname = pj.get(selection-1).getSurname();
		
		pp.add(new PlayerProfile(getName(),getSurname(),getShortPass(),getLongPass(),getFirstTouch(),getPassComments(),getFront(),getRear(),
				getSlide(),getTackleComments(),getVolley(),getLob(),getStrike(),getStrikeComments(),getFreeKick(),getPenalty()));
		
		goBack(sc);
	}//addJuniorPlayerProfile
	
	
	public void displayPlayerProfile(ArrayList<PlayerProfile> pp, Scanner sc) {
		
		System.out.println("Select a Player from the list below: ");
		
		for(int i=0;i<pp.size();i++) {
			System.out.println((i+1)+" - "+pp.get(i).getName()+" "+pp.get(i).getSurname());
		}//for loop
		
		
		int playerProfSel = Validate.validateInteger();
	
		
		System.out.println("PLAYER PROFILE: " + pp.get(playerProfSel-1).getName()+" "+pp.get(playerProfSel-1).getSurname());
		pp.get(playerProfSel-1).displayPlayerProfile();
		
		
		
		goBack(sc);
	}//displayPlayerProfile
	
		
	
	public void dataEntry(Scanner sc) {
		
		//======SHORT PASS======//
		
		int shortPass;
		
		do {
		System.out.println("Short Pass Skills Level [1-5]: ");
		shortPass = Validate.validateInteger();
		
			if(shortPass == 1) {
				setShortPass("1");
			}
			else if(shortPass == 2) {
				setShortPass("2");
			}
			else if(shortPass == 3) {
				setShortPass("3");
			}
			else if(shortPass == 4) {
				setShortPass("4");
			}
			else if(shortPass == 5) {
				setShortPass("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(shortPass < 1 || shortPass > 5);
		
		//======LONG PASS======//
		
		int longPass;
		do {
		System.out.println("Long Pass Skills Level [1-5]: ");
		longPass = Validate.validateInteger();
		if(longPass == 1) {
			setLongPass("1");
		}
		else if(longPass == 2) {
			setLongPass("2");
		}
		else if(longPass == 3) {
			setLongPass("3");
		}
		else if(longPass == 4) {
			setLongPass("4");
		}
		else if(longPass == 5) {
			setLongPass("5");
		}
		else {
			System.out.println("This value must be between 1 and 5");
		}
		}while(longPass <1 || longPass > 5);
		
		
		
		//======FIRST TOUCH======//
		int firstTouch;
		
		do {
			System.out.println("First Touch Skills Level [1-5]: ");
			firstTouch = Validate.validateInteger();
			if(firstTouch == 1) {
				setFirstTouch("1");
			}
			else if(firstTouch == 2) {
				setFirstTouch("2");
			}
			else if(firstTouch == 3) {
				setFirstTouch("3");
			}
			else if(firstTouch == 4) {
				setFirstTouch("4");
			}
			else if(firstTouch == 5) {
				setFirstTouch("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(firstTouch < 1 || firstTouch > 5);
		
		
		//======FRONT TACKLE======//
		
		int frontTackle;
		do {
			System.out.println("Front Tackle Skills Level [1-5]: ");
			frontTackle = Validate.validateInteger();
			if(frontTackle == 1) {
				setFront("1");
			}
			else if(frontTackle == 2) {
				setFront("2");
			}
			else if(frontTackle == 3) {
				setFront("3");
			}
			else if(frontTackle == 4) {
				setFront("4");
			}
			else if(frontTackle == 5) {
				setFront("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(frontTackle < 1 || frontTackle > 5);
		
		
		//======REAR TACKLE======//
		
		int rearTackle;
		do {
			System.out.println("Rear Tackle Skills Level [1-5]: ");
			rearTackle = Validate.validateInteger();
			if(rearTackle == 1) {
				setRear("1");
			}
			else if(rearTackle == 2) {
				setRear("2");
			}
			else if(rearTackle == 3) {
				setRear("3");
			}
			else if(rearTackle == 4) {
				setRear("4");
			}
			else if(rearTackle == 5) {
				setRear("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(rearTackle < 1 || rearTackle > 5);
			
		
		//======SLIDE TACKLE======//
		
		int slideTackle;
		do {
			System.out.println("Slide Tackle Skills Level [1-5]: ");
			slideTackle = Validate.validateInteger();
			if(slideTackle == 1) {
				setSlide("1");
			}
			else if(slideTackle == 2) {
				setSlide("2");
			}
			else if(slideTackle == 3) {
				setSlide("3");
			}
			else if(slideTackle == 4) {
				setSlide("4");
			}
			else if(slideTackle == 5) {
				setSlide("5");
			}
			else {
			System.out.println("This value must be between 1 and 5");
			}
		}while(slideTackle < 1 || slideTackle > 5);
		
		
		//======LOB=======//
		
		int lob;
		do {
			System.out.println("Lob Strike Skills Level [1-5]: ");
			lob = Validate.validateInteger();
			if(lob == 1) {
				setLob("1");
			}
			else if(lob == 2) {
				setLob("2");
			}
			else if(lob == 3) {
				setLob("3");
			}
			else if(lob == 4) {
				setLob("4");
			}
			else if(lob == 5) {
				setLob("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(lob < 1 || lob > 5);
		
		
		//=====VOLLEY=====//
		
		int volley;
		do {
			System.out.println("Volley Strike Skills Level [1-5]: ");
			volley = Validate.validateInteger();
			if(volley == 1) {
				setVolley("1");
			}
			else if(volley == 2) {
				setVolley("2");
			}
			else if(volley == 3) {
				setVolley("3");
			}
			else if(volley == 4) {
				setVolley("4");
			}
			else if(volley == 5) {
				setVolley("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(volley < 1 || volley > 5);
		
		
		//======STRIKE======//
		
		int strike;
		do {
			System.out.println("Strike Skills Level [1-5]: ");
			strike = Validate.validateInteger();
			if(strike == 1) {
				setStrike("1");
			}
			else if(strike == 2) {
				setStrike("2");
			}
			else if(strike == 3) {
				setStrike("3");
			}
			else if(strike == 4) {
				setStrike("4");
			}
			else if(strike == 5) {
				setStrike("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(strike < 1 || strike > 5);
		
		
		//=====FREE KICK=====//
		
		int freeKick;
		do {
			System.out.println("Free Kick Skills Level [1-5]: ");
			freeKick = Validate.validateInteger();
			if(freeKick == 1) {
				setFreeKick("1");
			}
			else if(freeKick == 2) {
				setFreeKick("2");
			}
			else if(freeKick == 3) {
				setFreeKick("3");
			}
			else if(freeKick == 4) {
				setFreeKick("4");
			}
			else if(freeKick == 5) {
				setFreeKick("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(freeKick < 1 || freeKick > 5);
		
		
		//=====PENALTY KICK=====//
		int penaltyKick;
		do {
			System.out.println("Penalty Kick Skills Level [1-5]: ");
			penaltyKick = sc.nextInt();
			sc.nextLine();
			if(penaltyKick == 1) {
				setPenalty("1");
			}
			else if(penaltyKick == 2) {
				setPenalty("2");
			}
			else if(penaltyKick == 3) {
				setPenalty("3");
			}
			else if(penaltyKick == 4) {
				setPenalty("4");
			}
			else if(penaltyKick == 5) {
				setPenalty("5");
			}
			else {
				System.out.println("This value must be between 1 and 5");
			}
		}while(penaltyKick < 1 || penaltyKick > 5);
		
		commentsDataEntry(sc);
		
	}//DataEntry
	
	public void commentsDataEntry(Scanner sc) {
		//sc.nextLine();
		System.out.println("Passing Coach Notes: ");
		setPassComments(sc.nextLine());
		System.out.println("Tackling Coach Notes: ");
		setTackleComments(sc.nextLine());
		System.out.println("Kicking Coach Notes: ");
		setStrikeComments(sc.nextLine());
	}//commentsDataEntry
	
	
	public void displayPlayerProfile() {
	
	 System.out.println("==========================PASSING==========================");
	 System.out.printf("%12s %12s %12s %20s\n", "SHORT P.", "LONG P.", "FIRST TOUCH", "PASS COMMENTS");
	 System.out.printf("%12s %12s %12s %20s\n", "---------", "--------", "----------", "-------------------");
	 System.out.printf("%12s %12s %12s %19s\n",getShortPass(),getLongPass(),getFirstTouch(),getPassComments());
	 
	 System.out.println("==========================TACKLING=========================");
	 System.out.printf("%12s %12s %12s %20s\n", "FRONT", "REAR", "SLIDE", "TACKLE COMMENTS");
	 System.out.printf("%12s %12s %12s %20s\n", "-------", "------", "------", "--------------------");
	 System.out.printf("%12s %12s %12s %19s\n",getFront(),getRear(),getSlide(),getTackleComments());
	
	 System.out.println("==========================KICKING==========================");
	 System.out.printf("%12s %12s %12s %20s\n","VOLLEY", "LOB", "STRIKE", "STRIKE COMMENTS");
	 System.out.printf("%12s %12s %12s %20s\n", "---------", "-----", "---------", "--------------------");
	 System.out.printf("%12s %12s %12s %19s\n",getVolley(),getLob(),getStrike(),getStrikeComments());
		
     System.out.println("==========================FREE-KICKS=======================");
	 System.out.printf("%30s %12s\n", "FREE KICK","PENALTY");
	 System.out.printf("%30s %12s\n", "---------", "----------");
	 System.out.printf("%30s %12s\n",getFreeKick(),getPenalty());
	
		
	
	}
	

	public void goBack(Scanner sc) {
		System.out.println("\nPress 'B' to back to the Menu. ".toUpperCase());
		char goBack = sc.next().charAt(0);
		if(goBack  == 'b' || goBack == 'B') {
			
		}
		else {
			
		}
	}//goBack
	
}
