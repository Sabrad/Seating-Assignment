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

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDietRequirements() {
        return dietRequirements;
    }

    public void setDietRequirements(String dietRequirements) {
        this.dietRequirements = dietRequirements;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
