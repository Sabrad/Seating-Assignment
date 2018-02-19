/*
 * Author: Jamie and David
 * Seating Algorithm (Rough)
 * Date: 
 * Group - any party wherein all members choose each other (consider overlapping groups for issues)
 * Priority: 1) any group bigger than maxSeatAtTable/2 2) Time
 */

//import statements
import java.util.*;
import java.io.*;
import java.util.Scanner;
//start of class
public class Algorithm {
	
	public static void main (String[] args) {
		

	}
	
	
	//in the event that information is given to us from a file IN ORDER OF PURCHASE and not an arrayList
	public ArrayList<Student> studentToArrayFromFile (File f) {
		
		//creates scanner for file
		Scanner S;
		ArrayList <Student> students = new ArrayList <Student> ();
		
		try {
			S = new Scanner(f);
			String s = S.nextLine();
			String a = "***"; //students are split with a line "***"
			//assumes first line in file is blank, that student info is in order of student number, name, diet, email, preferences; each in its own line
			//assumes file looks like this
			/*
			 * Time stamp
			 * Student number
			 * Student name
			 * Dietary requirements
			 * Email
			 * Friends list (if any)
			 * ***
			 * next Time stamp ...
			 */
			do {
				String studentNumber = S.nextLine();
				String name = S.nextLine();
				String dietRequirements = S.nextLine();
				String email = S.nextLine();
				s = S.nextLine();
				s = S.nextLine();
				ArrayList <String> friends = new ArrayList <String> ();
				while (S.hasNext() && s.compareTo(a) != 0) { // if there's anything else in that section of the file
					friends.add(s);
					s = S.nextLine();
				}
				students.add(new Student(studentNumber, name, dietRequirements, email, friends));
				s = S.nextLine();
				
			} while (S.hasNext());

			S.close(); //closes scanner
		} catch (FileNotFoundException e) {
			//  Auto-generated catch block
			e.printStackTrace();
			System.out.println("No file found!");
		}
		
		return students;
		
	}
	
}
