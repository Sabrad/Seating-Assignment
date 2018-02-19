//import statements
import java.util.*;

//start of class
public class Student {
	
	//class variables
	String studentNumber;
	String name;
	String dietRequirements;
	String email;
	ArrayList <String> friends = new ArrayList <String> ();
	
	//constructor
	Student (String s1, String s2, String diet, String email, ArrayList <String> friends) {
		this.studentNumber = s1;
		this.name = s2;
		this.dietRequirements = diet;
		this.email = email;
		this.friends = friends;
	}

}
