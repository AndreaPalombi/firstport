package gu_test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class WriteFile { //this file write all data into database text files
	

	public void writeToFile(ArrayList<SeniorPlayersObject> po, String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\players.txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
		
			for(int i=0;i<po.size();i++)
			{
				out.write(String.valueOf(i+1)+",");
				out.write(po.get(i).getName()+ ",");
				out.write(po.get(i).getSurname()+ ",");
				out.write(po.get(i).getAge()+ ",");
				out.write(po.get(i).getDateOfBirth()+ ",");
				out.write(po.get(i).getTelNumber()+ ",");
				out.write(po.get(i).getMobileNumber()+ ",");
				out.write(po.get(i).getEmail()+ ",");
				out.write(po.get(i).getHouseNumber()+ ",");
				out.write(po.get(i).getAddress()+ ",");
				out.write(po.get(i).getPostCode()+ ",");
				out.write(po.get(i).getNextOfKin()+ ",");
				out.write(po.get(i).getNextOfKinTel()+ ",");
				out.write(po.get(i).getDoctorName()+ ",");
				out.write(po.get(i).getDoctorTel()+ ",");
				out.write(po.get(i).getKnownIssues()+ ",");
				out.write(po.get(i).getRole()+ ",");
				out.write(po.get(i).getFees()+",");
				out.write(po.get(i).getFeesExp()+"\n");
			}
			out.close();
			System.out.println("Players Data File updated".toUpperCase());
	}//writeToFile
	
	public void writeToFileJP(ArrayList<JuniorPlayersObject> jpo, String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\junior_players.txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
			for(int i=0;i<jpo.size();i++)
			{
				out.write(jpo.get(i).getSFU_number()+",");
				out.write(jpo.get(i).getName()+",");
				out.write(jpo.get(i).getSurname()+",");
				out.write(jpo.get(i).getAge()+",");
				out.write(jpo.get(i).getDateOfBirth()+",");
				out.write(jpo.get(i).getTelNumber()+",");
				out.write(jpo.get(i).getMobileNumber()+",");
				out.write(jpo.get(i).getEmail()+",");
				out.write(jpo.get(i).getHouseNumber()+",");
				out.write(jpo.get(i).getAddress()+",");
				out.write(jpo.get(i).getPostCode()+",");
				out.write(jpo.get(i).getGuardianName()+",");
				out.write(jpo.get(i).getGuardianHouseNumber()+",");
				out.write(jpo.get(i).getGuardianAddress()+",");
				out.write(jpo.get(i).getGuardianPostCode()+",");
				out.write(jpo.get(i).getGuardianTel() +",");
				out.write(jpo.get(i).getRelationship()+",");
				out.write(jpo.get(i).getGuardianName2()+",");
				out.write(jpo.get(i).getGuardianHouseNumber2()+",");
				out.write(jpo.get(i).getGuardianAddress2()+",");
				out.write(jpo.get(i).getGuardianPostCode2()+",");
				out.write(jpo.get(i).getGuardianTel2()+",");
				out.write(jpo.get(i).getRelationship2()+",");
				out.write(jpo.get(i).getDoctorName()+",");
				out.write(jpo.get(i).getDoctorTel()+",");
				out.write(jpo.get(i).getKnownIssues()+",");
				out.write(jpo.get(i).getRole()+",");
				out.write(jpo.get(i).getFees()+",");
				out.write(jpo.get(i).getFeesExp()+"\n");
			}
			out.close();
			System.out.println("Junior Players Data File updated".toUpperCase());
		}//writeToFileJP
		
	
	public void writeToFileStaff(ArrayList<StaffObject> so, String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\staff.txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
			for(int i=0;i<so.size();i++)
			{
				out.write(so.get(i).getSFU_number()+",");
				out.write(so.get(i).getName()+",");
				out.write(so.get(i).getSurname()+",");
				out.write(so.get(i).getAge()+",");
				out.write(so.get(i).getDateOfBirth()+",");
				out.write(so.get(i).getTelNumber()+",");
				out.write(so.get(i).getMobileNumber()+",");
				out.write(so.get(i).getEmail()+",");
				out.write(so.get(i).getHouseNumber()+",");
				out.write(so.get(i).getAddress()+",");
				out.write(so.get(i).getPostCode()+",");
				out.write(so.get(i).getFees()+",");
				out.write(so.get(i).getFeesExp()+"\n");
			}//for loop
			out.close();
			System.out.println("Staff Data File updated".toUpperCase());
		}//writeToFileStaff
	
		
	public void writeToFileGames(ArrayList<Games> games, String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\games.txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
			for(int i=0;i<games.size();i++)
			{
				out.write(games.get(i).getDateOfMatch()+",");
				out.write(games.get(i).getLocation()+",");
				out.write(games.get(i).getOpposition()+",");
				out.write(games.get(i).getKoTime()+",");
				out.write(games.get(i).getResult()+",");
				out.write(games.get(i).getFinalScore()+",");
				out.write(games.get(i).getFirstHalfScore()+",");
				out.write(games.get(i).getSecondHalfScore()+",");
				out.write(games.get(i).getComments()+"\n");
			}//for loop
			out.close();
			System.out.println("Games Data File updated".toUpperCase());
	}//writeToFileGames
	
	public void writeToFileTrainings(ArrayList<Trainings> trainings, String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\trainings.txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
			for(int i=0;i<trainings.size();i++)
			{
				out.write(trainings.get(i).getCoachName()+",");
				out.write(trainings.get(i).getTrainingDate()+",");
				out.write(trainings.get(i).getTrainingLocation()+",");
				out.write(trainings.get(i).getTrainingTime()+",");
				out.write(trainings.get(i).getSkillsUndertaken()+",");
				out.write(trainings.get(i).getActivities()+",");
				out.write(trainings.get(i).getPlayersList()+",");
				out.write(trainings.get(i).getInjuries()+",");
				out.write(trainings.get(i).getNotes()+"\n");
			}//for loop
			out.close();
			System.out.println("Training Data File updated".toUpperCase());
	}//writeToFileTrainings
	
	
	
	public void writeToFilePlayerProfile(ArrayList<PlayerProfile>pp,String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\playerProfile.txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
			for(int i=0;i<pp.size();i++)
			{
				out.write(pp.get(i).getName()+",");
				out.write(pp.get(i).getSurname()+",");	
				out.write(pp.get(i).getShortPass()+",");
				out.write(pp.get(i).getLongPass()+",");
				out.write(pp.get(i).getFirstTouch()+",");
				out.write(pp.get(i).getPassComments()+",");	
				out.write(pp.get(i).getFront()+",");
				out.write(pp.get(i).getRear()+",");	
				out.write(pp.get(i).getSlide()+",");	
				out.write(pp.get(i).getTackleComments()+",");	
				out.write(pp.get(i).getVolley()+",");	
				out.write(pp.get(i).getLob()+",");	
				out.write(pp.get(i).getStrike()+",");	
				out.write(pp.get(i).getStrikeComments()+",");	
				out.write(pp.get(i).getFreeKick()+",");	
				out.write(pp.get(i).getPenalty()+"\n");	
			}//for loop
			out.close();
			System.out.println("Player Profile updated".toUpperCase());
	}//writeToFilePlayerProfile
	

	public void saveLogin(String username, String psw, String pathAndName) throws IOException
	{
		FileWriter write = new FileWriter("Data\\" + pathAndName + ".txt");
		BufferedWriter bw=new BufferedWriter(write);
		PrintWriter out= new PrintWriter(bw);
			
				out.write(username+",");
				out.write(psw+"\n");	
			
				out.close();
	}//saveLogin

}//WriteFile class
