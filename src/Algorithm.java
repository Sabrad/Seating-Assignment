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
	
	/*
	 * For our definition of a friend wherein both choose each other, removes students from a list that didn't choose each other
	 * We need to consider whether or not changing the original student object is a good idea (ie if someone wants to sort before everyone pays)
	 * At the moment, it DOES change the students info, so arguably, make a copy of the ArrayList <Student> students then run it through this
	 */
	public void friendExist (ArrayList<Student> students, int studentIndex) {
		
		// if arrayList isn't empty, finds a student number on student's friends, checks if friend is not attending, if so, removes
		if (!students.get(studentIndex).friends.isEmpty()) {
//			int numFriends = students.get(studentIndex).friends.size(); //can be used for clarity, but not needed
//			int numStudents = students.size(); //can be used for clarity, but not needed
			for (int i = 0; i < students.get(studentIndex).friends.size(); i++) { 
				for (int j = 0; j < students.size(); j++) {
					if(students.get(studentIndex).friends.get(i).compareTo(students.get(j).studentNumber) != 0) {
						students.get(studentIndex).friends.remove(j);
					}
				}
			}
		}
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
