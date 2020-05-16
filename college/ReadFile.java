package gu_test2;


import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadFile { //this class read all data word by word into database and load them into the program
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<SeniorPlayersObject> p = new ArrayList<SeniorPlayersObject>();
	ArrayList<JuniorPlayersObject> pj = new ArrayList<JuniorPlayersObject>();
	ArrayList<StaffObject> s = new ArrayList<StaffObject>();
	ArrayList<Games> g = new ArrayList<Games>();
	ArrayList<Trainings> t = new ArrayList<Trainings>();
	ArrayList<PlayerProfile> pp = new ArrayList<PlayerProfile>();
	ArrayList<Login> login = new ArrayList<Login>();
	
	
	public ArrayList<SeniorPlayersObject> readFilePlayers(String nameAndPath, String object) throws IOException {
			
		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("players"))
			{	
				p.add(new SeniorPlayersObject(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],
						data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18]));
				
			}//if
		}//while loop
		in.close();
		return p; //return object
	}//readFilePlayers
	
	
	public ArrayList<JuniorPlayersObject> readFileJuniorPlayers(String nameAndPath, String object) throws IOException {
		
		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("junior_players")) 
			{
				pj.add(new JuniorPlayersObject(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],
						data[10],data[11],data[12],data[13],data[14],data[15],data[16],data[17],data[18],data[19],data[20],data[21],data[22],data[23],
						data[24],data[25],data[26],data[27],data[28]));
			}//if
		}//while loop
		in.close();
		return pj; //return object
	}//readFileJuniorPlayers
	
	
	public ArrayList<StaffObject> readFileStaff(String nameAndPath, String object) throws IOException {
		
		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("staff"))
			{	
				s.add(new StaffObject(Integer.parseInt(data[0]),data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],
						data[11],data[12]));
				
			}//if
		}//while loop
		in.close();
		return s; //return object
	}//readFileStaff
	
	
	public ArrayList<Games> readFileGames(String nameAndPath, String object) throws IOException {
		
		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("games"))
			{	
				g.add(new Games((data[0]),data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]));
				
			}//if
		}//while loop
		in.close();
		return g; //return object
	}//readFileGames
	
	
	public ArrayList<Trainings> readFileTrainings(String nameAndPath, String object) throws IOException {
		
		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("trainings"))
			{	
				t.add(new Trainings((data[0]),data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]));
				
			}//if
		}//while loop
		in.close();
		return t; //return object
	}//readFileTrainings
	
	
	
	public ArrayList<PlayerProfile> readPlayerProfile(String nameAndPath, String object) throws IOException {

		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("playerProfile"))
			{	
				pp.add(new PlayerProfile(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],data[9],data[10],data[11],data[12],
						data[13],data[14],data[15]));
				
			}//if
		}//while loop
		in.close();
		return pp; //return object
	}//readFileFees
	
	
	public ArrayList<Login> readFileLogin(String nameAndPath, String object) throws IOException {

		BufferedReader in = Validate.checkFileReader(nameAndPath);
		String str;
		String[] data;
		while((str = in.readLine()) != null)
		{	
			data=str.split(",");
			if(object.equals("login"))
			{	
				login.add(new Login((data[0]),data[1]));
				
			}//if
		}//while loop
		in.close();
		return login; //return object
	}//readFileLogin
	
}//ReadFile class
