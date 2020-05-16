package gu_test2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Validate
{
	public static Scanner sc=new Scanner(System.in);
	
	public static int validateInteger() //validates integer entries
	{
		String input="";
		while (true)
		{
			try
			{
				//You can either use sc.nextInt, but you must make sure the
				//empty line is consumed by using sc.nextLine() with sc.nextInt().
				//or you can just use paresInt which consumes the empty line
				input=sc.nextLine();
				int choice=Integer.parseInt(input);
				return choice;
			}

			catch (InputMismatchException e)
			{

				/*
			   * The next() method must be called in the catch block to dispose of the
			   * users invalid input because the nextDouble() method leaves the input 
			   * value in the Scanners input stream if an InputMismatchException is
			   * thrown. If you omit the statement that calls next, the while loop
			   * keeps reading it, throws an exception, and displays an error  
			   * message in an infinite loop
			   */

				System.out.println("\n***"+input+" is not valid! Please select a number on the list.***".toUpperCase());
				
			}
			catch (NumberFormatException e) 
			{
				System.out.println("\n***"+input+" is not valid! Please select a number on the list.***".toUpperCase());
			}
		  }
	}
	
	public static double validateDouble() //validates double entries
	{
		while (true)
		{
			String input="";
			try
			{
				double myDouble ;
				
				input=sc.nextLine();
				myDouble=Double.parseDouble(input);
				return myDouble;
			}
			
			catch (InputMismatchException e)
			{
				/*
			   * Same comment as above applies
			   */
				System.out.println("\n***"+input+" is not valid! Please select a number on the list.***".toUpperCase());
			}
			catch (NumberFormatException e) 
			{

				System.out.println("\n***"+input+"'"+" is not valid! Please select a number on the list.***".toUpperCase());
			}
		  }
	}
	
	public static String validateString()
	{
		while (true)
		{
			try
			{
				String myString=sc.nextLine();
				if(!myString.isEmpty()) {
					return myString;
				}
			
			}
			
			catch (InputMismatchException e)
			{
				
				//sc.nextLine();
				/*
			   * Same comment as above applies
			   */
				System.out.println(e.getMessage());
				System.out.print("\n***That is not a valid String, please try again.***".toUpperCase());
			}
		  }
	}
	
	//This method checks if the file exists
	//It returns an object of type BufferedReader
	public static BufferedReader checkFileReader(String pathAndFile)
	{
		System.out.println(pathAndFile);
		BufferedReader in = null;
		try
		{
			//We wrap the File class inside the FileReader class which in turn is wrapped in the BufferedReader class
			in = new BufferedReader(new FileReader(new File(pathAndFile)));
			System.out.println("File exists".toUpperCase());
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println( "The file doesn't exist.\n".toUpperCase());
			System.exit(0);
		}
		return in;
	}//checkFile()
	
	//This method checks if the file exists
	//It returns an object of type BufferedWriter
	public static BufferedWriter checkFileWriter(String pathAndFile) throws IOException
	{
		System.out.println(pathAndFile);
		BufferedWriter in = null;
		try
		{
			//We wrap the File class inside the FileReader class which in turn is wrapped in the BufferedReader class
			//in = new BufferedWriter(new FileWriter(pathAndFile,true));
			in = new BufferedWriter(new FileWriter(new File(pathAndFile),true));
			System.out.println("File exists\n".toUpperCase());
		}
		catch(FileNotFoundException e)
		{
			System.out.println( "***The file doesn't exist.\n***".toUpperCase());
			System.exit(0);
		}
		return in;
	}//checkFile()
	
}//Validate class